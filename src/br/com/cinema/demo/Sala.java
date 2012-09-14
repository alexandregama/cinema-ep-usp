package br.com.cinema.demo;

public class Sala implements Comparable<Sala> {

	private final int numeroDaSala;
	
	private final int quantidadeDeLugares;

	public Sala(int quantidadeDeLugares, int numeroDaSala) {
		this.quantidadeDeLugares = quantidadeDeLugares;
		this.numeroDaSala = numeroDaSala;
	}

	@Override
	public int compareTo(Sala o) {
		if (this.getNumeroDaSala() < o.getNumeroDaSala()) {
			return -1;
		}
		else if (this.getNumeroDaSala() > o.getNumeroDaSala()) {
			return 1;
		}
		return 0;
	}
	
	public int getNumeroDaSala() {
		return numeroDaSala;
	}

	public int getQuantidadeDeLugares() {
		return quantidadeDeLugares;
	}

        
	@Override
	public String toString() {
		return "Sala [numeroDaSala=" + numeroDaSala + ", quantidadeDeLugares="
				+ quantidadeDeLugares + "]";
	}

}
