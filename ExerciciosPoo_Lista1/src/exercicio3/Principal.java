package exercicio3;

import java.util.Scanner;

import exercicio1.Cliente;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 3) Crie uma classe produto eletr�nico e apresente os atributos
		 *  e m�todos referentes esta classe, em seguida crie um objeto produto eletr�nico, 
		 * defina as instancias deste objeto e apresente as informa��es deste objeto no console.
		 */
		Scanner kb = new Scanner(System.in);
		ProdutoEletronico produto = new ProdutoEletronico();
			
		System.out.println("Insira o tipo do produto eletr�nico: ");
		produto.tipoProduto = kb.next().toUpperCase();
		
		System.out.println("Insira a marca do produto eletr�nico: ");
		produto.marcaProduto = kb.next().toUpperCase();
		
		System.out.println("Insira o c�digo do produto eletr�nico: ");
		produto.codigoProduto = kb.nextInt();
		
		System.out.println("Insira a linha do produto eletr�nico: ");
		produto.linhaProduto = kb.next().charAt(0);
		
		produto.tipo();
		produto.marca();
		produto.codigo();
		produto.linha(); 

	} 
 
}
