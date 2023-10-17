package com.unicap.br.lista2;

import java.util.Scanner;

public class Questao2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		float a, b, c;
		double delta, x1, x2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor da variável a: ");
		a = sc.nextFloat();
		System.out.println("Informe o valor da variável b: ");
		b = sc.nextFloat();
		System.out.println("Informe o valor da variável c: ");
		c = sc.nextFloat();
		
		delta = Math.pow(b, 2) - (4*a*c);
		System.out.println("Delta: " + delta);
		
		x1 = (-b - Math.sqrt(delta))/2*a;
		x2 = (-b + Math.sqrt(delta))/2*a;
		
		if (x1 > 0 && x2 > 0) {
			System.out.println("As raízes são: " + x1 + " e " + x2);
		} else if (x1 > 0) {
			System.out.println("Apenas " + x1 + " é uma raíz nos números reais");
		} else if (x2 > 0) {
			System.out.println("Apenas " + x2 + " é uma raíz nos números reais");
		} else {
			System.out.println("A equação não tem solução no conjunto dos reais.");
		}

	}

}
