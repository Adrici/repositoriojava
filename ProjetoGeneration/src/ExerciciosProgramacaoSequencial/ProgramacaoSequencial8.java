package Exercicios_Programação_Sequencial;

import java.util.Scanner;

public class ProgramacaoSequencial8 {

	public static void main(String[] args) {
		/*
		 * 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a 
		 * percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
		 * escrever um sistema que leia o custo de fábrica de um carro e escreva o 
		 * custo ao consumidor.
		 */
		
		final double DISTRIBUIDOR = 0.28;
		final double TAXA= 0.45; 
		double custoFrabrica, custoConsumidor;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the factory cost of the car: ");
		custoFrabrica = kb.nextFloat();
		
		custoConsumidor = (custoFrabrica + (custoFrabrica * DISTRIBUIDOR) + (custoFrabrica * TAXA));
		
		System.out.printf("O custo do carro para o consumidor é: R$ %.2f", custoConsumidor);
		kb.close();
	}

}
