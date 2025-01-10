package com.jean.hexabank.core;

public class Transacao {

    private String numDoc;
    private String naturesa;
    private Double valor;
    private ContaBancaria cOrigem;
    private ContaBancaria cDestino;

    public Transacao(String numDoc, String naturesa, Double valor, ContaBancaria cOrigem, ContaBancaria cDestino) {
        this.numDoc = numDoc;
        this.naturesa = naturesa;
        this.valor = valor;
        this.cOrigem = cOrigem;
        this.cDestino = cDestino;
    }

    public Transacao() {
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getNaturesa() {
        return naturesa;
    }

    public void setNaturesa(String naturesa) {
        this.naturesa = naturesa;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public ContaBancaria getcOrigem() {
        return cOrigem;
    }

    public void setcOrigem(ContaBancaria cOrigem) {
        this.cOrigem = cOrigem;
    }

    public ContaBancaria getcDestino() {
        return cDestino;
    }

    public void setcDestino(ContaBancaria cDestino) {
        this.cDestino = cDestino;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "numDoc='" + numDoc + '\'' +
                ", naturesa='" + naturesa + '\'' +
                ", valor=" + valor +
                ", cOrigem=" + cOrigem +
                ", cDestino=" + cDestino +
                '}';
    }
}
