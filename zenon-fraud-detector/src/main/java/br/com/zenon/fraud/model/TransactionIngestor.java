package br.com.zenon.fraud.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TransactionIngestor {

    public List<Transaction> ingerir(String nome) throws IOException {
        List<Transaction> transacoes = new ArrayList<>();
        try (BufferedReader leitor = new BufferedReader(new FileReader(nome))) {
            leitor.readLine();
            String linha;
            while ((linha = leitor.readLine()) != null) {
                Transaction transacao = separaLinha(linha);
                transacoes.add(transacao);
            }
        }
        return transacoes;
    }

    private static final String SEPARADOR = ",";

    protected Transaction separaLinha(String linha) {

        String[] partes = linha.split(SEPARADOR);
        int etapa = Integer.parseInt(partes[0]);
        TipoTransacao tipo = TipoTransacao.valueOf(partes[1]);
        BigDecimal valor = new BigDecimal(partes[2]);
        String nomeOrigem = partes[3];
        BigDecimal saldoAnteriorOrigem = new BigDecimal(partes[4]);
        BigDecimal saldoNovoOrigem = new BigDecimal(partes[5]);
        String nomeDestino = partes[6];
        BigDecimal saldoAnteriorDestino = new BigDecimal(partes[7]);
        BigDecimal saldoNovoDestino = new BigDecimal(partes[8]);
        boolean eFraude = partes[9].equals("1");
        boolean sinalizadoFraude = partes[10].trim().equals("1");

        return new Transaction(etapa, tipo, valor, nomeOrigem, saldoAnteriorOrigem, saldoNovoOrigem, nomeDestino, saldoAnteriorDestino, saldoNovoDestino, eFraude, sinalizadoFraude);
    }
}