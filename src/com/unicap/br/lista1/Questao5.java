package com.unicap.br.lista1;

import java.util.Scanner;

public class Questao5 {
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int numero;
		int operacao;
		
		System.out.println("Informe o valor do número: ");
		Scanner sc = new Scanner(System.in);
		
		numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			operacao = numero + 5;
			System.out.println(numero + " é par! Seu valor, somado a cinco, é: " + operacao);
		}else {
			operacao = numero + 8;
			System.out.println(numero + " é ímpar! Seu valor, somado a oito, é: " + operacao);
		}

	}

}
