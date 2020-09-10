package ExerciciosProgramacaoSequencial;

import java.util.Scanner;

public class ProgramacaoSequencial2 {

	public static void main(String[] args) {
		/*
		 * 2. Faça um sistema que leia a
		 * idade de uma pessoa expressa em dias e
		 * mostre-a expressa em anos, meses e dias.     
		 */
		
		int dias, meses, anos;
		
		Scanner kb = new Scanner (System.in);
		System.out.println("Escreva sua idade em dias: ");
		dias = kb.nextInt ();
		anos = dias/365;
		meses = dias%365/30;
		dias = (dias%365)%30;
		System.out.println("Sua idade é: " + anos + " anos "  + meses  + " meses "  + dias  + " dias ");
		kb.close();
		
	}

}
