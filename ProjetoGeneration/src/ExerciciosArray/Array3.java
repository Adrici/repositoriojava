package ExerciciosArray;

/*3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
*/

import java.util.Random;

public class Array3 
{
	
	public static void main(String[] args) 
	{
		
		final int matriz[][]= new int[3][3];
		final int SORTEIO = 16, MAXIMO = 10;
		int l, c, contador = 0;
		Random rd = new Random();

		System.out.println("The matrix is: ");
		for(l = 0; l < 3; l++) {
			for(c = 0; c < 3; c++) 
			{
				matriz[l][c] = rd.nextInt(SORTEIO);
				System.out.printf("[%d]", matriz[l][c]);
				
			if(matriz[l][c] > MAXIMO) 
			{
				contador++; 
			}
			}
			System.out.println();
		}
		System.out.printf("\n A matriz possui  %d maiores que  %d .", contador, MAXIMO);
	}
}