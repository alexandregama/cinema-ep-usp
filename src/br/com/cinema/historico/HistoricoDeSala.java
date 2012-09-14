/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cinema.historico;

import br.com.cinema.padroes.HistoricoTemplateMethod;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HistoricoDeSala extends HistoricoTemplateMethod {

    private int numeroDaSala; 
    private int quantidadeDeLugares;
    
    public HistoricoDeSala(int numeroDaSala, int quantidadeDeLugares) {
        this.numeroDaSala = numeroDaSala;
        this.quantidadeDeLugares = quantidadeDeLugares;
    }

    @Override
    protected void gravar() {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(getNomeDoArquivo(), true));
            out.write("Data:" + new Date() + " ");
            out.write("Sala: " + numeroDaSala + " ");
            out.write("N° de lugares: " + quantidadeDeLugares + " ");
            out.write("\n");
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(HistoricoDeSala.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(HistoricoDeSala.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public String getNomeDoArquivo() {
       return "C:/cinema/sala.txt";
    }    
    
}
