package desafio.itau.springboot.dto;


import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public class TransactionRequest {


    @NotNull
    private double Valor;

    @NotNull
    private OffsetDateTime  dataHora;

    public double getValor() {

        return Valor;
    }

    public OffsetDateTime getDataHora() {

        return dataHora;
    }
}
