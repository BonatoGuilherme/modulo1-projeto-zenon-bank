package br.com.zenon.fraud.cli;

import br.com.zenon.fraud.model.Transaction;
import br.com.zenon.fraud.model.TransactionIngestor;

import java.io.IOException;
import java.util.List;

public class Main {
    void main() throws IOException {
        TransactionIngestor transactionIngestor = new TransactionIngestor();
        String nome = IO.readln("Escreva o nome de um arquivo com o .CSV no final: ");
        List<Transaction> transacoes = transactionIngestor.ingerir(nome);

        for (int i = 0; i < 10; i++) {
            IO.println(transacoes.get(i));
        }
    }
}
