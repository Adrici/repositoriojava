package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class LacoCondicional2 {

	public static void main(String[] args) {
		/*
		 * 2-	Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		 */
		
		int num1, num2, num3;
		
		Scanner kb = new Scanner (System.in);
		System.out.println("Digite o 1� n�mero: ");
		num1 = kb.nextInt();
		
		System.out.println("Digite o 2� n�mero: ");
		num2 = kb.nextInt();
		
		System.out.println("Digite o 3� n�mero: ");
		num3 = kb.nextInt();
		
		
		if (num1<num2) {
			if(num2<num3) {
				System.out.printf(" %d - %d - %d", num1, num2, num3);
			}
			else if (num1<num3) {
				System.out.printf(" %d - %d - %d", num1, num3, num2);
			} else {
				System.out.printf(" %d - %d - %d", num3, num1, num2);
			}
		}
			
		
		else if (num2<num3) {
			if (num1<num3) {
				System.out.printf(" %d - %d - %d", num2, num1, num3);
			} else {
				System.out.printf(" %d - %d - %d", num2, num3, num1);
				}
		}else {
			System.out.printf(" %d - %d - %d", num3, num2, num1);
		}
						
		kb.close(); 
	}

}
