package com.unicap.br.lista2;

import java.util.Scanner;

public class Questao3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		double numero1, numero2, operacao = 0;
		String opcao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		numero1 = sc.nextInt();
		System.out.println("Informe o segundo número: ");
		numero2 = sc.nextInt();
		System.out.println("Informe o código da operação a ser feita (de a à g): ");
		opcao = sc.next();
		
		if (opcao.equals("a")) {
			operacao = numero1 + numero2;
		} else if (opcao.equals("b")) {
			operacao = numero1 - numero2;
		} else if (opcao.equals("c")) {
			operacao = numero1 * numero2;
		} else if (opcao.equals("d")) {
			operacao = numero1/numero2;
		} else if (opcao.equals("e")) {
			operacao = numero1% numero2;
		} else if (opcao.equals("f")) {
			operacao = Math.pow(numero1, numero2);
		} else if (opcao.equals("g")) {
			operacao = Math.sqrt(numero2);
		}
		
		System.out.println("Resultado da operação: " + operacao);

	}

}
