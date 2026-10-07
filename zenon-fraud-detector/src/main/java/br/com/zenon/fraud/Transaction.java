package br.com.zenon.fraud;

import java.math.BigDecimal;

public record Transaction(int etapa, TipoTransacao tipo, BigDecimal valor, String nomeOrigem,
                          BigDecimal saldoAnteriorOrigem, BigDecimal saldoNovoOrigem, String nomeDestino,
                          BigDecimal saldoAnteriorDestino, BigDecimal saldoNovoDestino, boolean eFraude,
                          boolean sinalizadoFraude
) {
    public enum TipoTransacao {CASH_IN, CASH_OUT, DEBIT, PAYMENT, TRANSFER}
}
