package com.everis.becajava.alicante.course.juego;

public class ConsultaNumResult {

	private int negras;
	private int blancas;

	public ConsultaNumResult(int negras, int blancas) {
		super();
		this.negras = negras;
		this.blancas = blancas;
	}

	public int getNegras() {
		return negras;
	}

	@Override
	public String toString() {
		return "ConsultaNumResult [negras=" + negras + ", blancas=" + blancas + "]";
	}

}
