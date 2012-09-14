package br.com.cinema.padroes;

import br.com.cinema.cinema.Cinema;


public class CinemaSingleton {

	private static CinemaSingleton cinemaSingleton;
        
	private Cinema cinema = new Cinema();        
        
	private CinemaSingleton() {
	}
	
	public static CinemaSingleton getInstancia() {
		if (cinemaSingleton == null) {
			cinemaSingleton = new CinemaSingleton();
		}
		return cinemaSingleton;
	}

	public Cinema getCinema() {
		return cinema;
	}

    
}
