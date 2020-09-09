package Exercicios_Programa��o_Sequencial;

import java.util.Scanner;

public class ProgramacaoSequencial8 {

	public static void main(String[] args) {
		/*
		 * 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a 
		 * percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
		 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
		 * escrever um sistema que leia o custo de f�brica de um carro e escreva o 
		 * custo ao consumidor.
		 */
		
		final double DISTRIBUIDOR = 0.28;
		final double TAXA= 0.45; 
		double custoFrabrica, custoConsumidor;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the factory cost of the car: ");
		custoFrabrica = kb.nextFloat();
		
		custoConsumidor = (custoFrabrica + (custoFrabrica * DISTRIBUIDOR) + (custoFrabrica * TAXA));
		
		System.out.printf("O custo do carro para o consumidor �: R$ %.2f", custoConsumidor);
		kb.close();
	}

}
