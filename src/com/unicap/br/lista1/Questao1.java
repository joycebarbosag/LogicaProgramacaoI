package com.unicap.br.lista1;

import java.util.Scanner;

public class Questao1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int numero;
		
		System.out.println("Informe um número: ");
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número é ímpar");
		}
	}

}
