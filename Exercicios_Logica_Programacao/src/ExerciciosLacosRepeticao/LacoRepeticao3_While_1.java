package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class LacoRepeticao3_While_1 {

	public static void main(String[] args) 
	{
		/*
		 * Solicitar a idade de várias pessoas e imprimir: 
		 * Total de pessoas com menos de 21 anos. 
		 * Total de pessoas com mais de 50 anos.
		 *  O programa termina quando idade for = 99. (WHILE)
		 */
		int idade, totalA=0, totalB=0;
		
		Scanner kb = new Scanner (System.in);
		System.out.printf("Escreva sua idade: ");
		idade = kb.nextInt();

		
		while (idade>1 && idade<=99) 
		{  	
		
			if(idade==21)
			{
				totalA++;
			}
			if(idade==50)
			{
				totalB++;
			}
			System.out.println("\nInsira sua idade: ");
			idade = kb.nextInt();
			
			
			
		}
		System.out.printf("\n %d pessoas têm 21 anos e %d pessoas têm 50 anos.", totalA, totalB);
		kb.close();	

	}

}
