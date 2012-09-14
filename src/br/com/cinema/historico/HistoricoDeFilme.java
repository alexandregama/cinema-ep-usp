/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cinema.historico;

import br.com.cinema.demo.Filme;
import br.com.cinema.enumaration.TipoHistorico;
import br.com.cinema.padroes.HistoricoTemplateMethod;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HistoricoDeFilme extends HistoricoTemplateMethod {

    private Filme filme;
    private TipoHistorico tipo;
    
    public HistoricoDeFilme(Filme filme, TipoHistorico tipo) {
        this.filme = filme;
        this.tipo = tipo;
    }             
    
    @Override
    protected void gravar() {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(getNomeDoArquivo(), true));
            if(tipo.equals(TipoHistorico.CADASTRO)) {
                out.write("Novo cadastro" + " ");
                out.write("Data:" + new Date() + " ");
                out.write("Codigo:" + filme.getCodigo() + " ");
                out.write("Filme: " + filme.getNome() + " ");
                out.write("Genero: " + filme.getGenero() + " ");
                out.write("Censura: " + filme.getCensura() + " ");
                out.write("Duracao: " + filme.getDuracaoEmMinutos() + " ");        
                out.write("\n");
                out.close();
            }
            else if(tipo.equals(TipoHistorico.REMOCAO)) {
                out.write("Remoção");
                out.write("Data:" + new Date() + " ");
                out.write("Filme: " + filme.getNome() + " ");
                out.write("\n");
                out.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(HistoricoDeFilme.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(HistoricoDeFilme.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public String getNomeDoArquivo() {
        return "C:/cinema/filme.txt";
    }
}

