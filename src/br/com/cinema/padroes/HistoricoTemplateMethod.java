/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cinema.padroes;

import java.io.File;
import java.io.IOException;

public abstract class HistoricoTemplateMethod {
  
    public void gravarHistorico() throws IOException {
        String nomeDoArquivo = getNomeDoArquivo();
        File file = new File(nomeDoArquivo);
		
        if (!file.exists()) {
            file.createNewFile();
        }        
        
        gravar();
    }
    
    public abstract String getNomeDoArquivo();
    protected abstract void gravar();
}
