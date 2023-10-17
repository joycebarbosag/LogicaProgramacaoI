package com.unicap.br.lista2;

import java.util.Scanner;

public class Questao4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		double a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		a = sc.nextDouble();
		System.out.println("Informe o segundo valor: ");
		b = sc.nextDouble();
		System.out.println("Informe o terceiro valor: ");
		c = sc.nextDouble();
		
		if(a+b > c || a+c > b || c+b > a) {
			System.out.println("Isso é um triângulo!");
		} else {
			System.out.println("Os valores das medidas não constituem um triângulo.");
		}
	}
}
