package ExerciciosLacosCondicionais;

import java.util.Scanner;

public class LacoCondicional4 {

	public static void main(String[] args) {
		/*
		 * 4-	Fa�a um programa em que permita a entrada de um n�mero qualquer e 
		 * exiba se este n�mero � par ou �mpar. Se for par 
		 * exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba 
		 * o n�mero elevado ao quadrado.
		 */
		
		int numero;
		boolean verdadeiro=true; 
		
		Scanner kb = new Scanner (System.in);
		
		System.out.println("Insira um n�mero inteiro qualquer: ");
		numero = kb.nextInt(); 
		
		if(numero % 2 == 0 || numero %-2 == 0){

			System.out.println("Este n�mero � par.");
			if(verdadeiro) {
				System.out.println("A ra�z quadrada deste n�mero �: " + Math.sqrt(numero));
			}
		}else {
			System.out.println("Este n�mero � impar.");
			if(verdadeiro) {
				System.out.println("Este n�mero ao quadrado �: " + Math.pow(numero,2));
			}
		} 
		kb.close();
		

	}

}
