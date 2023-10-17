package com.unicap.br.atividade1;

import java.util.Scanner;

public class Atividade1 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		int habitantes = 0;
		int filhosHabitante = 0;
		int filhos = 0;
		int rendaAbaixo = 0;
        float rendas = 0;
        float rendaHabitante = 0;
        float rendaMedia = 0;
        float filhosMedia = 0;
        float maiorRenda = 0;
        float porcentRendaAbaixo = 0;
        boolean exibirValores = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o número de habitantes da cidade: ");
        habitantes = sc.nextInt();

        for (int count = 0; count < habitantes; count++) {
            System.out.println("Informe a renda do habitante " + count + " : ");
            rendaHabitante = sc.nextFloat();
            rendas += rendaHabitante;
            
            if (rendaHabitante < 200) {
            	rendaAbaixo += 1;
            }
            
            if (rendaHabitante >  maiorRenda) {
            	maiorRenda = rendaHabitante;
            }
            
            if (rendaHabitante < 0) {
            	exibirValores = true;
                break;
            }
            
            System.out.println("Informe a quantidade de filhos do habitante " + count + " : ");
            filhosHabitante = sc.nextInt();
            filhos += filhosHabitante;
        }

        System.out.println("-------------------------------------------------");

        rendaMedia = rendas / habitantes;
        filhosMedia = filhos / habitantes;
        porcentRendaAbaixo = (rendaAbaixo * 100) / habitantes;
        
        if (exibirValores) {
        	System.out.println("Renda média da população: " + rendaMedia);
            System.out.println("Média de filhos da população: " + filhosMedia);
            System.out.println("Maior renda da população: " + maiorRenda);
            System.out.println("Porcentagem de pessoas com renda abaixo de R$200,00: " + porcentRendaAbaixo +"%");
        }
        
    }

}
