package exercicio4;

import java.util.Scanner;

import exercicio2.Aviao;

public class Principal {

	public static void main(String[] args) {
		/*
		 * 4) Crie uma classe funcionário e apresente os atributos e métodos 
		 * referentes esta classe, em seguida crie um objeto funcionário, 
		 * defina as instancias deste objeto e apresente as informações deste objeto no console.
		 */

		Scanner kb = new Scanner(System.in);
		Funcionario pessoa = new Funcionario();
			
		System.out.println("Nome do(a) Funcionare:  ");
		pessoa.nomeFuncionario = kb.next().toUpperCase();
		
		System.out.println("Código de registro do(a) Funcionare: ");
		pessoa.registroFuncionario = kb.nextInt();
		
		System.out.println("Informe se o(a) funcionare é novate na empresa (sim) ou (nao) : ");
		pessoa.statusFuncionario = kb.next().toUpperCase();
		
		pessoa.nome();
		pessoa.registro(); 
		pessoa.status();   
	}

}
