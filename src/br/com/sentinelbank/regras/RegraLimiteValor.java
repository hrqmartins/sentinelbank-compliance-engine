package br.com.sentinelbank.regras;

import br.com.sentinelbank.beans.Transacao;
import br.com.sentinelbank.interfaces.RegraSeguranca;

public class RegraLimiteValor implements RegraSeguranca {

    // Método para saber se a regra detectou algo errado.
    @Override
    public boolean verificarTransacao(Transacao transacao) {
        if (transacao.getValor() > 10000) { // Se for maior que 10k, retorna true e a verificação acontece.
            return true;
        } else {
            return false;
        }
    }

    // Método que mostra o peso desse risco.
    @Override
    public int pesoRisco() {
        return 30;
    }
}
