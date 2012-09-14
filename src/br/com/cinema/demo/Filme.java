package br.com.cinema.demo;

public class Filme implements Comparable<Filme> {

    private int codigo;
    
	private String nome;
	
	private String genero;
	
	private int duracaoEmMinutos;

	private int censura;

	@Override
	public int compareTo(Filme filme) {	
		return this.getNome().compareTo(filme.getNome());
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setCensura(int censura) {
		this.censura = censura;
	}

	public int getCensura() {
		return censura;
	}

	@Override
	public String toString() {
		return "Filme [codigo="+ codigo +" nome=" + nome + ", genero=" + genero
				+ ", duracaoEmMinutos=" + duracaoEmMinutos + ", censura="
				+ censura + "]";
	}

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


}
