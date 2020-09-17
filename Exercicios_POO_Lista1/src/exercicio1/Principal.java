package exercicio1;

import java.util.Scanner;
 
public class Principal {

	public static void main(String[] args) {
		/*
		 * 1) Crie uma classe cliente e apresente os atributos 
		 * e métodos referentes esta classe, 
		 * em seguida crie um objeto cliente, 
		 * defina as instancias deste objeto e apresente as 
		 * informações deste objeto no console.
		 */
		
		Scanner kb = new Scanner(System.in);
		Cliente consumidor = new Cliente();
			
		System.out.println("Insira o  nome do cliente: ");
		consumidor.nomeCliente = kb.next().toUpperCase();
		
		System.out.println("Insira o  nome do cliente: ");
		consumidor.sobreNomeCliente = kb.next().toUpperCase();
		
		System.out.println("Insira o Pedido: ");
		consumidor.pedidoCliente = kb.next().toUpperCase();
		
		System.out.println("Insira o custo do pedido do cliente: ");
		consumidor.valorPedidoCliente = kb.nextInt();
		
		consumidor.nomeCompleto();
		consumidor.pedidoLanche(); 
		consumidor.custoPedido();   
		 
 
	}

}
