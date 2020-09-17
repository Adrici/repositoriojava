package entidadeexercicio1;

public class Proponente {
	private String nome;
	private String endereco;
	private String telefone;

	
	public Proponente(String nome) {

		this.nome = nome;
	}

	public Proponente(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public Proponente(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}

 