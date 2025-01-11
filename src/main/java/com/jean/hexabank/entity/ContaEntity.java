package com.jean.hexabank.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_conta")
public class ContaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "num_conta")
    private Integer numConta;
    @Column(name = "agencia", nullable = false)
    private Integer agencia;
    @Column(name = "titular", nullable = false, length = 50)
    private String titular;
    @Column(name = "saldo", nullable = false)
    private Double saldo;

    public ContaEntity(Integer numConta, Integer agencia, String titular, Double saldo) {
        this.numConta = numConta;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public ContaEntity() {

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
}
