package Exercicios;

import java.util.Scanner;

public class ProgramacaoSequencial3 {

	public static void main(String[] args) {
		/*
		 * 
		 * Faça um algoritmo que leia o tempo de duração de um evento em uma
		 * fábrica expressa em segundos e mostre-o expresso em horas, minutos
		 * e segundos, exiba o nome do usuario no momento.
		 */
		
		String nome;
		int segundos, hora, minuto, duracaoSegundos;
		
		Scanner kb = new Scanner (System.in);
		System.out.println("Escreva seu nome: ");
		nome = kb.next();
		System.out.println("Escreva a duração do evento em segundos: ");
		duracaoSegundos = kb.nextInt();
		hora = duracaoSegundos/3600;
		minuto= (duracaoSegundos% 3600) / 60;
		segundos= (duracaoSegundos% 3600)% 60;
		System.out.printf("Olá, %s. A duração do evento é de: %d horas, %d minutos e %d segundos.", nome, hora, minuto, segundos);
			
		kb.close(); 
		

	}

}
