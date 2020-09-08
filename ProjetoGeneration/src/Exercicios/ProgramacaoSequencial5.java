package Exercicios;

import java.util.Scanner;

public class ProgramacaoSequencial5 {

	public static void main(String[] args) {
		/*
		 * 5. Faça um sistema que leia as 3 notas de um aluno e calcule 
		 * a média final deste aluno. Considerar que a média é ponderada e 
		 * que o peso das notas é: 2,3 e 5, respectivamente. 
		 */
		
		double nota1, nota2, nota3, pond1, pond2, pond3, pondTotal;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Digite a 1ª nota: ");
		nota1= kb.nextDouble(); 
		pond1=(nota1*2/10);


		System.out.println("Digite a 2ª nota: ");
		nota2= kb.nextDouble();
		pond2=(nota2*3/10);


		System.out.println("Digite a 3ª nota: ");
		nota3= kb.nextDouble(); 
		pond3=(nota3*5/10);


		pondTotal= pond1+pond2+pond3;
		System.out.printf(" A média final do aluno(a) é:  %.2f ", pondTotal);
		
		kb.close(); 
		

	}

}
