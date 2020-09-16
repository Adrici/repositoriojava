package exercicio4;

public class Funcionario 
{
	public String nomeFuncionario; 
	public int registroFuncionario;
	public String statusFuncionario;
	

	public void nome() 
	{
		String nome = nomeFuncionario; 
		System.out.printf("\nFuncionare: %s", nome);
	}
	public void registro() 
	{
		int registro = registroFuncionario;
		System.out.printf("\nCódigo do registro do(a) Funcionare: %d", registro);
	}
	public void status() 
	{
		String status = statusFuncionario; 
		if(status == "sim") 
		{
			System.out.printf("Funcionarie novato(a)");
		}else {
			   System.out.println("\nFuncionare veterano(a)");
			  }
		
	}
}
