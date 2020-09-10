package ExerciciosProgramacaoSequencial;

import java.util.Scanner;

public class ProgramacaoSequencial6 {

	public static void main(String[] args) {
		/*6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no
		 *  plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.
		 */
		
		double d, x1, y1, x2, y2;
		Scanner kb = new Scanner(System.in);
		
		System.out.printf("Digite x1: ");
		x1 = kb.nextDouble();
		System.out.printf("Digite y1: ");
		y1 = kb.nextDouble();
		System.out.printf("Digite x2: ");
		x2 = kb.nextDouble();
		System.out.printf("Digite y2: ");
		y2 = kb.nextDouble();
		
		d = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.printf("A distância entre os dois pontos é:  %.2f", d);
		kb.close();
		
	}

}
