package exercicio2;

import java.util.Scanner;

import exercicio1.Cliente;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 2) Crie uma classe avi�o e apresente os atributos e 
		 * m�todos referentes esta classe, em seguida crie um objeto avi�o, 
		 * defina as instancias deste objeto e apresente as informa��es deste objeto no console.
		 */
		Scanner kb = new Scanner(System.in);
		Aviao aeronave = new Aviao();
			
		System.out.println("Insira o modelo da aeronave:  ");
		aeronave.modeloAviao = kb.next().toUpperCase();
		
		System.out.println("Insira a capacidade de passageiros suportada pela aeronave: ");
		aeronave.capacidadeAviao = kb.nextInt();
		
		System.out.println("Insira o pa�s de origem da campanhia a qual a aeronave pertence: ");
		aeronave.paisOrigemAviao = kb.next().toUpperCase();
		
		aeronave.modelo();
		aeronave.capacidade();
		aeronave.pais();  
	}

}
