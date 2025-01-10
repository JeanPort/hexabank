package com.jean.hexabank.service.transacao;

import com.jean.hexabank.core.ContaBancaria;
import com.jean.hexabank.core.Transacao;
import com.jean.hexabank.exception.ContaNotFoundException;
import com.jean.hexabank.exception.SaldoInsuficienteException;

import java.util.UUID;

public class TransacaoImpl implements ITransacaoService{


    @Override
    public Transacao efeturarTransacao(ContaBancaria cOrigem, ContaBancaria cDestino, Double valor) {

        if (cOrigem == null || cDestino == null) {
            throw new ContaNotFoundException("Conta invalida");
        }

        if (cOrigem.getSaldo() < valor) {
            throw new SaldoInsuficienteException("Saldo insuficente");
        }

        cOrigem.setSaldo(cOrigem.getSaldo() - valor);
        cDestino.setSaldo(cDestino.getSaldo() + valor);

        return new Transacao(UUID.randomUUID().toString(), "TRANSF", valor, cOrigem, cDestino);
    }
}
