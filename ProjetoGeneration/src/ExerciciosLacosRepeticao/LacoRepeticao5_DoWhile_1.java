package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class LacoRepeticao5_DoWhile_1 {

	public static void main(String[] args) 
	{
		/*
		 * Crie um programa que leia um número do teclado até que 
		 * encontre um número igual a zero. No final, 
		 * mostre a soma dos números digitados.(DO...WHILE)
		 */
		int num, soma=0;
		Scanner kb = new Scanner (System.in);

		
		do
		{		
			System.out.println("Digite um número: ");
			num= kb.nextInt(); 
			soma = soma + num; 
			
		}while(num!=0);
		
		System.out.printf("A soma dos números digitados é: %d", soma); 
	
		kb.close(); 
	} 

}
