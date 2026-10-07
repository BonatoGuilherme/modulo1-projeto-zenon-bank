package br.com.zenon.fraud.cli;

import br.com.zenon.fraud.Transaction;

import java.math.BigDecimal;

import static br.com.zenon.fraud.Transaction.TipoTransacao.*;

public class Main {
    void main() {
        Transaction item1 = new Transaction(743, CASH_OUT, BigDecimal.valueOf(850002.52), "C1280323807", BigDecimal.valueOf(850002.52), BigDecimal.ZERO, "C873221189", BigDecimal.valueOf(6510099.11), BigDecimal.valueOf(7360101.63), true, false);
        IO.println(item1);

    }
}
