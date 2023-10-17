package com.unicap.br.lista1;

import java.util.Scanner;

public class Questao3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		System.out.println("Informe o valor da variável 'a': ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		System.out.println("Indorme o valor da variável 'b': ");
		b = sc.nextInt();
		
		if(a == b) {
			c=a+b;
			System.out.println("O valor de 'c' é: " + c);
		}else {
			c=a*b;
			System.out.println("O valor de 'c' é: " + c);
		}
		

	}

}
