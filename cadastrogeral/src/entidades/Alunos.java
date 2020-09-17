package entidades;
public class Alunos extends Pessoa
{
	public Alunos(String nome, char sexo, int anoNasc, String etnia) {
		super(nome, sexo, anoNasc, etnia);

	}
	private String turma;
	private double notas[] = new double[2];
	public Alunos(String nome, char sexo, int anoNasc, String etnia, String turma )
	{
		super(nome, sexo, anoNasc, etnia);
		this.turma = turma;
		
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
}