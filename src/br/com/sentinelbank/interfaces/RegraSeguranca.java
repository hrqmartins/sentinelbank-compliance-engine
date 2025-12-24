package br.com.sentinelbank.interfaces;

import br.com.sentinelbank.beans.Transacao;

public interface RegraSeguranca {

    // Método para saber se a regra detectou algo errado.
    public boolean verificarTransacao (Transacao transacao);

    // Método para dizer o quanto a regra é importante
    public int pesoRisco ();
}
