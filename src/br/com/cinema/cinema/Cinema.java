package br.com.cinema.cinema;

import br.com.cinema.demo.Filme;
import br.com.cinema.demo.Sala;
import br.com.cinema.demo.Sessao;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cinema {

	private List<Sala> salas = new ArrayList<Sala>();

	private List<Filme> filmes = new ArrayList<Filme>();
	
	private Sessao sessao = new Sessao();
        
        private int codigoFilme = 0;
	
	private int quantidadeDeSalas;
	
	private int quantidadeDeLugares;
        
        public Filme getFilme(int codigoDoFilme) {
            for (Filme filme : filmes) {
                if(filme.getCodigo() == codigoDoFilme) {
                    return filme;
                }
            }
            return null;
        }

	public void cadastraFilmes(Filme filme) {
                setCodigoFilme(getCodigoFilme() + 1);
                filme.setCodigo(getCodigoFilme());
		filmes.add(filme);		
	}
	
        public void removerFilme(int codigoDoFilme) {
            for (Filme filme : filmes) {
                if(filme.getCodigo() == codigoDoFilme) {
                    filmes.remove(filme);
                    return;
                }
            }
        }
        
        public void removerSessao(int codigoDaSala, int codigoDoFilme) {
            sessao.remove(codigoDaSala, codigoDoFilme);
        } 
        
	public void criaSalas() {
		for (int i = 0; i < quantidadeDeSalas; i++) {
			salas.add(new Sala(this.quantidadeDeLugares, i + 1));
		}
	}
        
	public Map<Filme, Map<Sala, List>> criaSessoes(Sala sala, Filme filme) {	     
		return sessao.programaSessao(sala, filme);
	}
	
	public List<Sala> getSalas() {
		return salas;
	}
	
	public void setQuantidadeDeSalas(int quantidadeDeSalas) {
		this.quantidadeDeSalas = quantidadeDeSalas;
	}

	public int getQuantidadeDeSalas() {
		return quantidadeDeSalas;
	}

	public void setQuantidadeDeLugares(int quantidadeDeLugares) {
		this.quantidadeDeLugares = quantidadeDeLugares;
	}

	public int getQuantidadeDeLugares() {
		return quantidadeDeLugares;
	}

	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setSessao(Sessao sessoes) {
		this.sessao = sessoes;
	}

	public Sessao getSessao() {
		return sessao;
	}

    /**
     * @return the codigoFilme
     */
    public int getCodigoFilme() {
        return codigoFilme;
    }

    /**
     * @param codigoFilme the codigoFilme to set
     */
    public void setCodigoFilme(int codigoFilme) {
        this.codigoFilme = codigoFilme;
    }


}
