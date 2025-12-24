package br.com.sentinelbank.modelos;

import br.com.sentinelbank.interfaces.RegraSeguranca;
import java.util.ArrayList;
import java.util.List;

public class AntiFraude {

    private List<RegraSeguranca> regras = new ArrayList<>();

    public void adicionarRegra(RegraSeguranca regra){
        this.regras.add(regra);
    }

    public void analisar(Transacao transacao){
        int scoreFinal = 0;

        System.out.println("Iniciando análise da transação ID: " + transacao.getId());

        for (RegraSeguranca regra : regras){

            // Se retornar true, houve suspeita.
            if (regra.verificarTransacao(transacao)) {
                System.out.println("Regra violada! Somando " + regra.pesoRisco() + " pontos.");
                scoreFinal += regra.pesoRisco(); // Soma o peso da regra ao total
            }
        }

        exibirResultado(scoreFinal);
    }

    private void exibirResultado(int score) {
        System.out.println("Score Final de Risco: " + score);
        if (score > 60) {
            System.out.println("STATUS: [BLOQUEADA] - Risco de fraude muito alto.");
        } else if (score > 0) {
            System.out.println("STATUS: [EM ANÁLISE] - Requer validação humana.");
        } else {
            System.out.println("STATUS: [AUTORIZADA] - Transação segura.");
        }
    }
}