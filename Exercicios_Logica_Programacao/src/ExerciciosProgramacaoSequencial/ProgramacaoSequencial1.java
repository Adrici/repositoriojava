package ExerciciosProgramacaoSequencial;

import java.util.Scanner;

public class ProgramacaoSequencial1 {

	public static void main(String[] args) {
		/*
		 * 1. Fa�a um sistema que leia a idade de uma 
		 * pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
		 */

		int idade;
		
		Scanner kb = new Scanner (System.in);
		System.out.println("Escreva a sua idade em anos: ");
		idade = kb.nextInt();
		System.out.println("Ol�, sua idade em dias � " + (idade*365) );
		kb.close();		
	}

}
