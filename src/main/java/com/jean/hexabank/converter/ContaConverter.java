package com.jean.hexabank.converter;

import com.jean.hexabank.core.ContaBancaria;
import com.jean.hexabank.entity.ContaEntity;

public class ContaConverter {

    public static ContaEntity contaBancariaToContaEntity(ContaBancaria c) {
        if (c != null) {
            return new ContaEntity(c.getNumConta(), c.getAgencia(), c.getTitular(), c.getSaldo());
        }
        return null;
    }

    public static ContaBancaria entityToContaBancaria(ContaEntity entity) {
        if(entity != null) {
            return new ContaBancaria(entity.getNumConta(), entity.getAgencia(), entity.getTitular(), entity.getSaldo());
        }
        return null;
    }
}
