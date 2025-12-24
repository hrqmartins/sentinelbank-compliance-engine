package br.com.sentinelbank.main;

import br.com.sentinelbank.modelos.AntiFraude;
import br.com.sentinelbank.modelos.Transacao;
import br.com.sentinelbank.regras.RegraHorarioSuspeito;
import br.com.sentinelbank.regras.RegraLimiteValor;

import java.time.LocalDateTime;

public class TesteSistema {
    static void main() {

        // Criando uma Transação
        Transacao transacao = new Transacao(1, 15000.0, LocalDateTime.now(), "123-123", "321-321");

        // Instanciar AntiFraude
        AntiFraude antiFraude = new AntiFraude();

        // Adicionando as Regras
        antiFraude.adicionarRegra(new RegraLimiteValor());
        antiFraude.adicionarRegra(new RegraHorarioSuspeito());

        // Executando a Análise
        antiFraude.analisar(transacao);

        System.out.println("\n**************************\n");

        // Transação 2
        Transacao transacao2 = new Transacao(2, 15000.0, LocalDateTime.now(), "22-221", "21-222");

        antiFraude.analisar(transacao2);

    }
}
