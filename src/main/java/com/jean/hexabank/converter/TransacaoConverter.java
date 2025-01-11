package com.jean.hexabank.converter;

import com.jean.hexabank.core.Transacao;
import com.jean.hexabank.entity.TransacaoEntity;

public class TransacaoConverter {

    public static TransacaoEntity fromTransacaoToEntity(Transacao t){
        if (t != null) {
            return new TransacaoEntity(t.getNumDoc(),  t.getNaturesa(), t.getValor(), ContaConverter.contaBancariaToContaEntity(t.getcOrigem()), ContaConverter.contaBancariaToContaEntity(t.getcDestino()));
        }
        return null;
    }
}
