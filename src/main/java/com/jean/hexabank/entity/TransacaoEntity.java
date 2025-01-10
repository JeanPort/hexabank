package com.jean.hexabank.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_transacao")
public class TransacaoEntity {

    @Id
    @Column(name = "id_transacao")
    private String numDoc;
    @Column(name = "naturesa", length = 50, nullable = false)
    private String naturesa;
    @Column(name = "valor", nullable = false)
    private Double valor;
    @ManyToOne
    @JoinColumn(name = "num_conta_origem")
    private ContaEntity contaOrigem;
    @ManyToOne
    @JoinColumn(name = "num_conta_destino")
    private ContaEntity contaDestino;

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

    public ContaEntity getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(ContaEntity contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public ContaEntity getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(ContaEntity contaDestino) {
        this.contaDestino = contaDestino;
    }
}
