package com.unicap.br.lista1;

import java.util.Scanner;

public class Questao4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int numero;
		int dobro;
		int triplo;
		
		System.out.println("Informe o valor do número: ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		if(numero > 0) {
			dobro = numero * 2;
			System.out.println("O dobro de " + numero + " é: " + dobro);
		}else {
			triplo = numero * 3;
			System.out.println("O triplo de " + numero + " é: " + triplo);
		}

	}

}
