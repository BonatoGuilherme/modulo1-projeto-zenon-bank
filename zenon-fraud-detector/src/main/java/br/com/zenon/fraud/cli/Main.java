package br.com.zenon.fraud.cli;

import br.com.zenon.fraud.model.Transaction;
import br.com.zenon.fraud.model.TransactionIngestor;

import java.io.IOException;
import java.util.List;

public class Main {
    void main() throws IOException {
        TransactionIngestor transactionIngestor = new TransactionIngestor();
        List<Transaction> transacoes = transactionIngestor.ingerir("data.csv");

        for (int i = 0; i < 10; i++) {
            IO.println(transacoes.get(i));
        }
    }
}
