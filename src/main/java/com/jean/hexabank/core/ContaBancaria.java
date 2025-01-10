package com.jean.hexabank.core;

public class ContaBancaria {

    private Integer numConta;
    private Integer agencia;
    private String titular;
    private Double saldo;

    public ContaBancaria(Integer numConta, Integer agencia, String titular, Double saldo) {
        this.numConta = numConta;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numConta=" + numConta +
                ", agencia=" + agencia +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
