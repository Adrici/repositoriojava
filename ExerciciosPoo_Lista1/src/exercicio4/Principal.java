package exercicio4;

import java.util.Scanner;

import exercicio2.Aviao;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 4) Crie uma classe funcion�rio e apresente os atributos e m�todos 
		 * referentes esta classe, em seguida crie um objeto funcion�rio, 
		 * defina as instancias deste objeto e apresente as informa��es deste objeto no console.
		 */

		Scanner kb = new Scanner(System.in);
		Funcionario pessoa = new Funcionario();
			
		System.out.println("Nome do(a) Funcionare:  ");
		pessoa.nomeFuncionario = kb.next().toUpperCase();
		
		System.out.println("C�digo de registro do(a) Funcionare: ");
		pessoa.registroFuncionario = kb.nextInt();
		
		System.out.println("Informe se o(a) funcionare � novate na empresa (sim) ou (nao) : ");
		pessoa.statusFuncionario = kb.next().toUpperCase();
		
		pessoa.nome();
		pessoa.registro(); 
		pessoa.status();   
	}

}
