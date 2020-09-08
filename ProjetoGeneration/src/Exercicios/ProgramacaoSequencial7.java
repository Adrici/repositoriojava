package Exercicios;
import java.util.Scanner;

public class ProgramacaoSequencial7 {
	public static void main(String[] args) {
		/*
		 * 7. Um sistema de equações lineares do tipo: ax + by = c
		 * 											   dx + ey = f		
		 pode ser resolvido segundo mostrado abaixx:
		 x = ce -bf				y = af - cd
		  	__________			   _________	
		  	ae - bd					ae - bd
		  	
		  	Escreva um sistema que lê os coeficientes
		  	a,b,c,d,e e f e calcula e mostra os valores de x e y.
		 */
		double a, b, c , d, e, f, x, y;
		Scanner kb = new Scanner(System.in);
		
		System.out.printf("Escreva o coeficiente A: ");
		a = kb.nextDouble();
		System.out.printf("Escreva o coeficiente B: ");
		b = kb.nextDouble();
		System.out.printf("Escreva o coeficienteC: ");
		c = kb.nextDouble();
		System.out.printf("Escreva o coeficiente D: ");
		d = kb.nextDouble();
		System.out.printf("Escreva o coeficientet E: ");
		e = kb.nextDouble();
		System.out.printf("Escreva o coeficiente F: ");
		f = kb.nextDouble();
		
		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * f);
		
		System.out.printf("O valor de X é: %f", x);
		System.out.printf("\nO valor de Y é: %f", y);
		
		kb.close(); 
	}
}