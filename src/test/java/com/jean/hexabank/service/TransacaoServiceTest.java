package com.jean.hexabank.service;

import com.jean.hexabank.core.ContaBancaria;
import com.jean.hexabank.core.Transacao;
import com.jean.hexabank.exception.ContaNotFoundException;
import com.jean.hexabank.exception.SaldoInsuficienteException;
import com.jean.hexabank.service.transacao.ITransacaoService;
import com.jean.hexabank.service.transacao.TransacaoImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TransacaoServiceTest {


    private ITransacaoService service;

    ContaBancaria contaOrigemValida;
    ContaBancaria contaDestinoValida;

    @BeforeEach
    public void setup(){
        service = new TransacaoImpl();
        contaOrigemValida = new ContaBancaria(1, 10, "Jean", 1000.0);
        contaDestinoValida = new ContaBancaria(2, 10, "Ana", 500.0);
    }

    @Test
    void fluxoNormal(){
        Transacao transacao = service.efeturarTransacao(contaOrigemValida, contaDestinoValida, 100.0);
        assertTrue(transacao.getNaturesa().equals("TRANSF")
                && transacao.getcOrigem().getSaldo().equals(900.0)
                && transacao.getcDestino().getSaldo().equals(600.0));
    }

    @Test
    void fluxoAlternativo_contaOrigemInvalida(){
        assertThrows(ContaNotFoundException.class, () -> service.efeturarTransacao(contaOrigemValida, null, 100.0));
    }

    @Test
    void fluxoAlternativo_contaDestinoInvalida(){
        assertThrows(ContaNotFoundException.class, () -> service.efeturarTransacao(null, contaDestinoValida, 100.0));
    }

    @Test
    void fluxoAlternativo_contaSaldoInsuficiente(){
        assertThrows(SaldoInsuficienteException.class, () -> service.efeturarTransacao(contaOrigemValida, contaDestinoValida, 2000.0));
    }
}
