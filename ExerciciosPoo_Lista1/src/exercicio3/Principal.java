package exercicio3;

import java.util.Scanner;

import exercicio1.Cliente;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 3) Crie uma classe produto eletrônico e apresente os atributos
		 *  e métodos referentes esta classe, em seguida crie um objeto produto eletrônico, 
		 * defina as instancias deste objeto e apresente as informações deste objeto no console.
		 */
		Scanner kb = new Scanner(System.in);
		ProdutoEletronico produto = new ProdutoEletronico();
			
		System.out.println("Insira o tipo do produto eletrônico: ");
		produto.tipoProduto = kb.next().toUpperCase();
		
		System.out.println("Insira a marca do produto eletrônico: ");
		produto.marcaProduto = kb.next().toUpperCase();
		
		System.out.println("Insira o código do produto eletrônico: ");
		produto.codigoProduto = kb.nextInt();
		
		System.out.println("Insira a linha do produto eletrônico: ");
		produto.linhaProduto = kb.next().charAt(0);
		
		produto.tipo();
		produto.marca();
		produto.codigo();
		produto.linha(); 

	} 
 
}
