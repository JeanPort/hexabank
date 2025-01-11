package com.jean.hexabank.service.transferencia;

import com.jean.hexabank.DTO.TransferenciaDTO;
import com.jean.hexabank.converter.ContaConverter;
import com.jean.hexabank.converter.TransacaoConverter;
import com.jean.hexabank.core.ContaBancaria;
import com.jean.hexabank.core.Transacao;
import com.jean.hexabank.entity.ContaEntity;
import com.jean.hexabank.entity.TransacaoEntity;
import com.jean.hexabank.repo.ContaRepo;
import com.jean.hexabank.repo.TransacaoRepo;
import com.jean.hexabank.service.transacao.ITransacaoService;
import com.jean.hexabank.service.transacao.TransacaoImpl;
import org.springframework.stereotype.Service;

@Service
public class TransferenciaServiceImpl {

    private TransacaoRepo transRepo;
    private ContaRepo contaRepo;
    private ITransacaoService service = new TransacaoImpl();

    public TransferenciaServiceImpl(TransacaoRepo transRepo, ContaRepo contaRepo) {
        this.transRepo = transRepo;
        this.contaRepo = contaRepo;
    }

    public TransacaoEntity efetuarTransferencia(TransferenciaDTO dto) {

        ContaEntity cOrigem = contaRepo.findById(dto.contaOrigem()).orElse(null);
        ContaEntity cDestino = contaRepo.findById(dto.contaDestino()).orElse(null);

        ContaBancaria origem = ContaConverter.entityToContaBancaria(cOrigem);
        ContaBancaria destino = ContaConverter.entityToContaBancaria(cDestino);

        Transacao transacao = service.efeturarTransacao(origem, destino, dto.valor());

        cOrigem = ContaConverter.contaBancariaToContaEntity(transacao.getcOrigem());
        cDestino = ContaConverter.contaBancariaToContaEntity(transacao.getcDestino());
        TransacaoEntity res = TransacaoConverter.fromTransacaoToEntity(transacao);

        contaRepo.save(cDestino);
        contaRepo.save(cOrigem);
        return transRepo.save(res);
    }
}
