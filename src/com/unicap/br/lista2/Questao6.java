package com.unicap.br.lista2;

import java.util.Scanner;

public class Questao6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		double precoEtanol = 3.24, precoGasolina = 4.02, litros, valorAbs =0, valorTotal = 0, desconto=0;
		String tipoCombustivel;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tipo do combustível (E-etanol ou G-gasolina): ");
		tipoCombustivel = sc.next();
		System.out.println("Informe a quantidade de combustível: ");
		litros = sc.nextDouble();
		
		if(tipoCombustivel.equals("E")) {
			if(litros <= 20.0) {
				desconto = 0.03 * precoEtanol;
				for(int i=0; i <= litros; i++) {
					valorAbs = precoEtanol - desconto;
					valorTotal += valorAbs;
				}
			} else {
				desconto = 0.05 * precoEtanol;
				for(int i=0; i<=litros; i++) {
					valorAbs = precoEtanol - desconto;
					valorTotal += valorAbs;
				}
			}
		} else {
			if(litros <= 20.0) {
				desconto = 0.04 * precoGasolina;
				for(int i=0; i<=litros; i++) {
					valorAbs = precoGasolina - desconto;
					valorTotal += valorAbs;
				}
			} else {
				desconto = 0.06 * precoGasolina;
				for(int i=0; i<=litros; i++) {
					valorAbs = precoGasolina - desconto;
					valorTotal += valorAbs;
				}
			}
		}
		
		System.out.println("Valor a ser pago: " + valorTotal);
		
	}

}
