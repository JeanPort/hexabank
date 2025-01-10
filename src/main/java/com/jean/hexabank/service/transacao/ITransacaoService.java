package com.jean.hexabank.service.transacao;

import com.jean.hexabank.core.ContaBancaria;
import com.jean.hexabank.core.Transacao;

public interface ITransacaoService {

    Transacao efeturarTransacao(ContaBancaria cOrigem, ContaBancaria cDestino, Double valor);
}
