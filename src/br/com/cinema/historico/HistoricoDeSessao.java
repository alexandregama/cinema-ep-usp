/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cinema.historico;

import br.com.cinema.demo.Filme;
import br.com.cinema.demo.Sala;
import br.com.cinema.enumaration.TipoHistorico;
import br.com.cinema.padroes.HistoricoTemplateMethod;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HistoricoDeSessao extends HistoricoTemplateMethod {

    private Map<Filme, Map<Sala, List>> sessoes; 
    private TipoHistorico tipo;
    
    public HistoricoDeSessao(Map<Filme, Map<Sala, List>> sessoes, TipoHistorico tipo) {
        this.sessoes = sessoes;
        this.tipo = tipo;
    }        
    
    @Override
    protected void gravar() {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter(getNomeDoArquivo(), true));
            if(tipo.equals(TipoHistorico.CADASTRO)) {
                out.write("Novo cadastro ");
                out.write("Data:" + new Date() + " ");            
                
                Set<Filme> chavesFilme = sessoes.keySet(); 
                List<String> horariosDoDia = new ArrayList<String>();
                for (Filme filme : chavesFilme) {
                    out.write("Filme:" + filme.getNome() + " ");
                    Map<Sala, List> horarios = sessoes.get(filme);                
                    Set<Sala> chavesSala = horarios.keySet();
                    for (Sala sala : chavesSala) {
                        out.write("Sala:" + sala.getNumeroDaSala()  + " ");
                        List horario = horarios.get(sala);
                        horariosDoDia.add(horario.toString());
                        out.write(horariosDoDia.toString());
                    }
                }                
                
                out.write("\n");
                out.close();
            }
            else if(tipo.equals(TipoHistorico.REMOCAO)) {
                out.write("Remoção");
                out.write("Data:" + new Date() + " ");            
                out.write("\n");
                out.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(HistoricoDeSessao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(HistoricoDeSessao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public String getNomeDoArquivo() {
       return "C:/cinema/sessao.txt";
    }      
    
    public List getHorarios() {
        Set<Filme> chavesFilme = sessoes.keySet(); 
        List<String> horariosDoDia = new ArrayList<String>();
        for (Filme filme : chavesFilme) {
            Map<Sala, List> horarios = sessoes.get(filme);                
            Set<Sala> chavesSala = horarios.keySet();
            for (Sala sala : chavesSala) {
                List horario = horarios.get(sala);
                horariosDoDia.add(horario.toString());
            }
        }
        return horariosDoDia;
    }    
    
}
