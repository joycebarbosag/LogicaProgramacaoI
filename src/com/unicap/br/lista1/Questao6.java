package com.unicap.br.lista1;

import java.util.Scanner;

public class Questao6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = input.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = input.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int valor3 = input.nextInt();

        int menor, meio, maior;

        if (valor1 <= valor2 && valor1 <= valor3) {
            menor = valor1;
            if (valor2 <= valor3) {
                meio = valor2;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor2;
            }
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            menor = valor2;
            if (valor1 <= valor3) {
                meio = valor1;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor1;
            }
        } else {
            menor = valor3;
            if (valor1 <= valor2) {
                meio = valor1;
                maior = valor2;
            } else {
                meio = valor2;
                maior = valor1;
            }
        }

        System.out.println("Valores em ordem crescente: " + menor + ", " + meio + ", " + maior);
    }
}
