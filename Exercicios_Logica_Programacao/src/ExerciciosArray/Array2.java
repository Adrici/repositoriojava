package ExerciciosArray;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) 
	/*/
	 * 2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.

	 */
	{
		final int INDICE = 6;
		int vetor[] = new int[INDICE];
		int i, soma = 0, contador = 0;
		int neutro=0; 
		
		Scanner kb = new Scanner(System.in);
		
		for(i = 0; i < INDICE; i++) {
			System.out.printf("Insira um n�mero: ");
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
		System.out.printf("\nOs n�meros pares inseridos s�o: ");
		for(i = 0; i < INDICE; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.printf("%d ", vetor[i]);
			}
		}
		System.out.printf("\nA soma dos n�meros �mpares �: %d",  soma );
		System.out.printf("\nOs n�meros �mpares inseridos s�o: ");
		for(i = 0; i < INDICE; i++) {
			if(vetor[i] % 2 != 0 ) {
				System.out.printf("%d ", vetor[i]);
			}
		}
		System.out.printf("\nO total %d de n�meros �mpares �", contador);
		System.out.printf("\nZero � neutro. O total de 0s inseridos �: %d", neutro);
		
		kb.close(); 
	}

}
