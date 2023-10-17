package com.unicap.br.lista1;

import java.util.Scanner;

public class Questão7 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		boolean a, b;

        System.out.println("Informe o primeiro valor: ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextBoolean();
        System.out.println("Informe o segundo valor: ");
        b = sc.nextBoolean();

        if (a && b) {
            System.out.println("Ambos os valores são verdadeiros.");
        } else if (!a && !b) {
            System.out.println("Ambos os valores são falsos.");
        } else {
            System.out.println("Os dois valores não são iguais em verdade."
                    + " O primeiro é " + a + " e o segundo é " + b);
        }
    }
}
