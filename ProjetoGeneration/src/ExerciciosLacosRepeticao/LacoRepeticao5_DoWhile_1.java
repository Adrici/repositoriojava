package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class LacoRepeticao5_DoWhile_1 {

	public static void main(String[] args) 
	{
		/*
		 * Crie um programa que leia um n�mero do teclado at� que 
		 * encontre um n�mero igual a zero. No final, 
		 * mostre a soma dos n�meros digitados.(DO...WHILE)
		 */
		int num, soma=0;
		Scanner kb = new Scanner (System.in);

		
		do
		{		
			System.out.println("Digite um n�mero: ");
			num= kb.nextInt(); 
			soma = soma + num; 
			
		}while(num!=0);
		
		System.out.printf("A soma dos n�meros digitados �: %d", soma); 
	
		kb.close(); 
	} 

}
