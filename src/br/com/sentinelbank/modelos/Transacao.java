package br.com.sentinelbank.modelos;

import java.time.LocalDateTime;

public class Transacao {

    // Visibilidade, tipo e atributo
    private int id;
    private double valor;
    private LocalDateTime horario;
    private String contaOrigem;
    private String contaDestino;

    // Método Construtor
    public Transacao(int id, double valor, LocalDateTime horario, String contaOrigem, String contaDestino) {
        this.id = id;
        this.valor = valor;
        this.horario = horario;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    // Método Getters
    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public String getContaOrigem() {
        return contaOrigem;
    }

    public String getContaDestino() {
        return contaDestino;
    }

    public void exibeTransacao() {
        System.out.println("""
                *********************
                *   SENTINEL BANK   *
                ********************* """);
        System.out.println("\n[TRANSAÇÃO]: ID= " + id
                + "\n[VALOR]: R$" + valor
                + "\n[ORIGEM]: " + contaOrigem);
    }
}
