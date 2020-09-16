package exercicio1;

public class Cliente 
{
	public String nomeCliente; 
	public String sobreNomeCliente;
	public String pedidoCliente;
	public double valorPedidoCliente;
	
	public void nomeCompleto() {
		String nomeCompleto = nomeCliente + " " + sobreNomeCliente;
		System.out.printf("\nCliente: %s", nomeCompleto);		
	}
	public void pedidoLanche() {
		String pedidoLanche = pedidoCliente; 
		System.out.printf("\nPedido do cliente: %s", pedidoCliente);
	}
	public void custoPedido() {
		double custoPedido = valorPedidoCliente;
		System.out.printf("\nPreço do pedido: R$  %.2f", valorPedidoCliente);
	}
	
	
	

} 

