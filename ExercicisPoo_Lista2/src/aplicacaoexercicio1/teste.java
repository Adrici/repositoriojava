package aplicacaoexercicio1;

import entidadeexercicio1.Empregado;
import entidadeexercicio1.Fornecedor;

public class teste {

	public static void main(String[] args) {
		
		Empregado empregadoTeste = new Empregado("Maria","Rua da Lua ", "957102339", 101, 5000, 250);
		System.out.println(empregadoTeste.getNome());
		System.out.println(empregadoTeste.getEndereco());
		System.out.println(empregadoTeste.getTelefone());
		System.out.println(empregadoTeste.getSetor());
		System.out.println(empregadoTeste.calcularSalario());
		empregadoTeste.setNome("Daniel");
		empregadoTeste.setEndereco("Rua do Sol ");
		empregadoTeste.setTelefone("934782211");
		empregadoTeste.setCodigoSetor(111);
		empregadoTeste.setSalarioBase(10000);
		empregadoTeste.setImposto(20);
		System.out.println();
		System.out.println(empregadoTeste.getNome());
		System.out.println(empregadoTeste.getEndereco());
		System.out.println(empregadoTeste.getTelefone());
		System.out.println(empregadoTeste.getSetor());
		System.out.println(empregadoTeste.calcularSalario());
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		Fornecedor fornecedorTeste = new Fornecedor("Maria","Rua da Lua", "5567 9008", 5000, 3500);
		
		System.out.println(fornecedorTeste.getNome());
		System.out.println(fornecedorTeste.getEndereco());
		System.out.println(fornecedorTeste.getTelefone());
		System.out.println(fornecedorTeste.obterSaldo());
		fornecedorTeste.setNome("Daniel");
		fornecedorTeste.setEndereco("Rua do Sol"); 
		fornecedorTeste.setTelefone("934782211");
		fornecedorTeste.setValorCredito(6000);
		fornecedorTeste.setValorDivida(1000);
		System.out.println();
		System.out.println(fornecedorTeste.getNome());
		System.out.println(fornecedorTeste.getEndereco());
		System.out.println(fornecedorTeste.getTelefone());
		System.out.println(fornecedorTeste.obterSaldo());

	}

}
