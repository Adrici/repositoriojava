package exercicio2;

import java.util.Scanner;

import exercicio1.Cliente;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 2) Crie uma classe avião e apresente os atributos e 
		 * métodos referentes esta classe, em seguida crie um objeto avião, 
		 * defina as instancias deste objeto e apresente as informações deste objeto no console.
		 */
		Scanner kb = new Scanner(System.in);
		Aviao aeronave = new Aviao();
			
		System.out.println("Insira o modelo da aeronave:  ");
		aeronave.modeloAviao = kb.next().toUpperCase();
		
		System.out.println("Insira a capacidade de passageiros suportada pela aeronave: ");
		aeronave.capacidadeAviao = kb.nextInt();
		
		System.out.println("Insira o país de origem da campanhia a qual a aeronave pertence: ");
		aeronave.paisOrigemAviao = kb.next().toUpperCase();
		
		aeronave.modelo();
		aeronave.capacidade();
		aeronave.pais();  
	}

}
