package exercicio3;

public class ProdutoEletronico {
	public String tipoProduto;
	public String marcaProduto; 
	public int codigoProduto;
	public char linhaProduto;

	
	public void tipo() {
		String tipo = tipoProduto; 
		System.out.printf("\nTipo do Produto eletr�nico: %s", tipo);
	}
	public void marca() {
		String marca = marcaProduto; 
		System.out.printf("\nMarca do Produto eletr�nico: %s", marca);
	}
	public void codigo() {
		int codigo = codigoProduto;
		System.out.printf("\nC�digo do produto: %d", codigo);
	}
	public void linha() {
		char linha = linhaProduto; 
		System.out.printf("\nClassifica��o por letra da linha do produto: %c", linha); 
	}
	  



}
