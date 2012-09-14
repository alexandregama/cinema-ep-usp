package br.com.cinema.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Sessao {

        private List<String> horariosDoFilme;
    
	private final int periodo = 720;	
	@SuppressWarnings("rawtypes")
	Map<Filme, Map<Sala, List>> sessoes = new TreeMap<Filme, Map<Sala, List>>();

	public Map<Filme, Map<Sala, List>> programaSessao(Sala s, Filme f) {           
		horariosDoFilme = new LinkedList<String>();
		int numeroDeExibicoes = (periodo / f.getDuracaoEmMinutos()) + 1;

		for (int i = 0; i < numeroDeExibicoes; i++) {
			String duracao;
			int temp = i * (f.getDuracaoEmMinutos() + 15);
			int horas = (periodo + temp) / 60;
			int minutos = ((periodo + temp) % 60);

			if (horas > 24) {
				horas = horas - 24;
			}

			if (minutos < 10) {
				duracao = Integer.toString(horas) + ":0"
						+ Integer.toString(minutos);
			} else {
				duracao = Integer.toString(horas) + ":"
						+ Integer.toString(minutos);
			}
			horariosDoFilme.add(duracao);
		}
                
                Map<Sala, List> horarios = new TreeMap<Sala, List>();
                horarios.put(s, horariosDoFilme);
		sessoes.put(f, horarios);
                
                return sessoes;
	}   	
        
        public void remove(int codigoDaSala, int codigoDoFilme) {
            Set<Filme> chavesFilme = sessoes.keySet(); 
            
            for (Filme filme : chavesFilme) {                
                if(filme.getCodigo() == codigoDoFilme) {
                    Map<Sala, List> horarios = sessoes.get(filme);
                    Set<Sala> chavesSala = horarios.keySet();
                    for (Sala sala : chavesSala) {
                        if(sala.getNumeroDaSala() == codigoDaSala) {
                            sessoes.remove(filme);
                            return;
                        }
                    }                 
                }
            }
        }
        
	/** Imprime o mapa com as sessoes e os filmes respectivos **/
	public void imprimeSessoes() {		
		System.out.println(sessoes);
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

        public Map<Filme, Map<Sala, List>> getSessoes() {
            return this.sessoes;
        }
}
