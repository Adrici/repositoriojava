package ExerciciosArray;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) 
	/*/
	 * 2- Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

	 */
	{
		final int INDICE = 6;
		int vetor[] = new int[INDICE];
		int i, soma = 0, contador = 0;
		int neutro=0; 
		
		Scanner kb = new Scanner(System.in);
		
		for(i = 0; i < INDICE; i++) {
			System.out.printf("Insira um número: ");
			vetor[i] = kb.nextInt();
			if(vetor[i] % 2 ==0 ) 
			{
				 soma  =  soma  + vetor[i];
			}
			else {
				contador++;
			}
			if (vetor[i] == 0) {
				neutro++; 
			}
		}
		System.out.printf("\nOs números pares inseridos são: ");
		for(i = 0; i < INDICE; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
			}
		}
		System.out.printf("\nA soma dos números ímpares é: %d",  soma );
		System.out.printf("\nOs números ímpares inseridos são: ");
		for(i = 0; i < INDICE; i++) {
			if(vetor[i] % 2 != 0 ) {
				System.out.printf("%d ", vetor[i]);
			}
		}
		System.out.printf("\nO total %d de números ímpares é", contador);
		System.out.printf("\nZero é neutro. O total de 0s inseridos é: %d", neutro);
		
		kb.close(); 
	}

}
