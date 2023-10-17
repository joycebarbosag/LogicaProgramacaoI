package com.unicap.br.lista2;

import java.util.Scanner;

public class Questao5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		double a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		a = sc.nextDouble();
		System.out.println("Informe o segundo número: ");
		b = sc.nextDouble();

		if (a == b) {
			System.out.println("Números iguais.");
		} else if (a > b) {
			System.out.println("O primeiro é maior.");
		} else {
			System.out.println("O segundo é maior.");
		}
	}

}
