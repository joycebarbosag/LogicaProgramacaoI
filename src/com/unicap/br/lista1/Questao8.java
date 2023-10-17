package com.unicap.br.lista1;

import java.util.Scanner;

public class Questao8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		float valorEtiqueta, desconto, acrescimo, valorFinal = 0;
		int codigo;
		
		System.out.println("Informe o valor do produto na etiqueta: ");
		Scanner sc = new Scanner(System.in);
		
		valorEtiqueta = sc.nextFloat();
		System.out.println("Informe o código de pagamento: ");
		codigo = sc.nextInt();
		
		if (codigo == 1) {
			desconto = valorEtiqueta * 10/100;
			valorFinal = valorEtiqueta - desconto;
		}else if(codigo == 2) {
			desconto = valorEtiqueta * 5/100;
			valorFinal = valorEtiqueta - desconto;
		}else if (codigo == 3) {
			valorFinal = valorEtiqueta;
		}else if (codigo == 4) {
			acrescimo = valorEtiqueta * 5.0f/100;;
			valorFinal = valorEtiqueta + acrescimo;
			System.out.println(valorFinal);
		}
		
		System.out.println("Valor a ser pago: " + valorFinal);
	}

}
