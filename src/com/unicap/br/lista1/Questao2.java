package com.unicap.br.lista1;

import java.util.Scanner;

public class Questao2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int soma = 0;
		
		System.out.println("Informe o valor da variável 'a': ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		System.out.println("Informe o valor da variável 'b': ");
		b = sc.nextInt();
		
		System.out.println("Informe o valor da variável 'c': ");
		c = sc.nextInt();
		
		soma = a+b;
		
		if (soma > c) {
			System.out.println("A soma de 'a' e 'b' é maior do que o valor de 'c': "
					+ a + " + " + b + " = " + soma);
		}

	}

}
