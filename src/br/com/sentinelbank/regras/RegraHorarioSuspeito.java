package br.com.sentinelbank.regras;

import br.com.sentinelbank.modelos.Transacao;
import br.com.sentinelbank.interfaces.RegraSeguranca;

public class RegraHorarioSuspeito implements RegraSeguranca {

    @Override
    public boolean verificarTransacao(Transacao transacao) {
        if (transacao.getHorario().getHour() < 6) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int pesoRisco() {
        return 40;
    }





}
