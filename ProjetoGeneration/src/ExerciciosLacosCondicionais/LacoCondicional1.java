package Exercicios_Lacos_Condicionais;

import java.util.Scanner;

public class LacoCondicional1 {

	public static void main(String[] args) {
		/*
		 * 1-	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		 */
		
		int var1, var2, var3;
		
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Digite o 1� valor desejado: ");
		var1 = kb.nextInt();
		
		System.out.println("Digite o 2� valor desejado: ");
		var2 = kb.nextInt();
		
		System.out.println("Digite o 3� valor desejado: ");
		var3 = kb.nextInt();
		
		if (var1>var2 && var1>var3) {
			System.out.printf("O  maior valor inserido �: %d ", var1);
		}
		if (var2>var1 && var2>var3) {
			System.out.printf("O  maior valor inserido �: %d ", var2);
		}
		if (var3>var1 && var3>var2) {
			System.out.printf("O  maior valor inserido �: %d ", var3);
		}
		
		kb.close(); 
	}

}
