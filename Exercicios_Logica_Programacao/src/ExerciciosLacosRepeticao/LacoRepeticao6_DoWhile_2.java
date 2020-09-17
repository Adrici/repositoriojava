package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class LacoRepeticao6_DoWhile_2 
{

	public static void main(String[] args) 
	{
		/*
		 * Escrever um programa que receba vários números inteiros no teclado. 
		 * E no final imprimir a média dos números múltiplos de 3. 
		 * Para sair digitar 0(zero).(DO...WHILE)
		 */
		
		double numero, media, soma=0;
		int c=0;
		Scanner kb = new Scanner (System.in);
		
		
		do 
		{
			System.out.println("Insira um número qualquer: ");
			numero = kb.nextInt(); 
				if (numero!=0 && numero%3==0 || numero!=0 && numero%-3==0);
				{
					soma = soma + numero; 
					c++;
					
				}
					
		}while(numero!=0); 
		
		media = soma/(c-1);
		
		System.out.printf("A média  dos números múltiplos de 3 é: %f", media); 
		
		kb.close(); 
	}

}  
