package com.everis.becajava.alicante.course.juego;

import java.util.ArrayList;
import java.util.List;

import javax.crypto.CipherInputStream;

public class MasterMindManager {

	private Integer numInicial;
	private List<Integer> numIntentados = new ArrayList<Integer>();
	private Integer numIntentos;

	public MasterMindManager(Integer numInicial) {
		super();
		this.numInicial = numInicial;
		this.numIntentos = 10;
	}

	public ConsultaNumResult consultaNumResult(Integer numero) {

		if (this.isNumeroValido(numero)) {
			this.numIntentados.add(numero);
			this.numIntentos--;
			int blancas = 0;
			int negras = 0;
			// blancas++
			// negras++
			String numeroPrimero = String.valueOf(numInicial);
			String[] primerNumero = numeroPrimero.split("");
			String numeroIntroducido = String.valueOf(numero);
			String[] numeroIn = numeroIntroducido.split("");

			for (int i = 0; i < primerNumero.length; i++) {
				for (int j = 0; j < numeroIn.length; j++) {
					if (primerNumero[i].equals(numeroIn[j])) {
						if (i == j) {
							negras++;
						} else {
							blancas++;
						}
					}
				}

			}

			return new ConsultaNumResult(negras, blancas);
		}
		return null;
	}

	public boolean haFinalizadoLaPartida(ConsultaNumResult consultaNumResult) {
		return this.numIntentos <= 0 || this.haGanado(consultaNumResult);
	}

	public boolean haGanado(ConsultaNumResult consultaNumResult) {
		return consultaNumResult.getNegras() == 5;
	}

	public boolean isNumeroValido(Integer numero) {
		return numero >= 0 && numero <= 99999;
	}

}
