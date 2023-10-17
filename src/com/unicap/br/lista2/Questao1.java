package com.unicap.br.lista2;

import java.util.Scanner;

public class Questao1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		long id;
		float nota1, nota2, nota3, mediaExercicios, mediaAproveitamento;
		String conceito = null, msg = null;
		
		System.out.println("Informe o número de identificação do discente: ");
		Scanner sc = new Scanner(System.in);
		
		id = sc.nextLong();
		System.out.println("Informe a primeira nota: ");
		nota1 = sc.nextFloat();
		System.out.println("Informe a segunda nota: ");
		nota2 = sc.nextFloat();
		System.out.println("Informe a terceira nota: ");
		nota3 = sc.nextFloat();
		System.out.println("Informe a média dos exercícios: ");
		mediaExercicios = sc.nextFloat();
		
		mediaAproveitamento = (nota1 + 2 * nota2 + 3 * nota3 + mediaExercicios)/7;
		if (mediaAproveitamento >= 9 && mediaAproveitamento <= 10) {
			conceito = "A";
			msg = "Aprovado";
		}else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9) {
			conceito = "B";
			msg = "Aprovado";
		}else if (mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
			conceito = "C";
			msg = "Aprovado";
		}else if (mediaAproveitamento >= 4 && mediaAproveitamento < 6) {
			conceito = "D";
			msg = "Recuperação";
		}else if (mediaAproveitamento < 4) {
			conceito = "E";
			msg = "Reprovado";
		}
		
		System.out.println("-----------------------------------");
		System.out.println("Id do estudante: " + id);
		System.out.println("Notas do estudante: " + nota1 + ", " + nota2 + ", " + nota3);
		System.out.println("Média dos exercícios: " + mediaExercicios);
		System.out.println("Média de aproveitamento: " + mediaAproveitamento + " de conceito " + conceito);
		System.out.println("Situação: " + msg);
	}

}
