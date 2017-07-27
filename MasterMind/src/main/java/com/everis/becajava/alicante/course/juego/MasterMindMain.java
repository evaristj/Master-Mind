package com.everis.becajava.alicante.course.juego;

import java.util.Scanner;

public class MasterMindMain {

	public static void main(String[] args) {
		
//		Scanner intentos = new Scanner(System.in);
//		
//		System.out.println("Bienvenido a Master Mind");
//		Integer numeroInicial =(int) Math.floor(Math.random()*(99999-0+1)+0);
//		System.out.println("*****");
//		System.out.println("Se acaba de crear un número de cinco cifras");
//		MasterMindManager masterMindManager = new MasterMindManager(numeroInicial);
//		System.out.println("Ahora intenta adivinar dicho número");
//		System.out.println("Tienes 10 intentos");
		
		Integer numInicial = 12345;
		MasterMindManager masterMindManager= new MasterMindManager (numInicial);
		ConsultaNumResult result;
		do {
			Integer numeroUsuario = 12345;
			result = masterMindManager.consultaNumResult(numeroUsuario);
			System.out.println(result);
			
		} while (!masterMindManager.haFinalizadoLaPartida(result));
		
		if (masterMindManager.haGanado(result)) {
			System.out.println("Ha ganado");
		} else {
			System.out.println("Ha perdido");
		}
	}

}
