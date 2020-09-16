package entidades;

public class Aluno {
	public String nomeAluno;
	public int anoNascimentoAluno;
	public char generoAluno;
	public char turmaAluno;
	public double nota[] = new double[4];
	public double media;
	public double mediaAprovacao;
	
	public double media() {
		return media = (nota[0] + nota[1] + nota[2] + nota[3]) / 4;
	}
	
	public void mostraIdadeAluno() {
		if(generoAluno == 'M') {
			System.out.printf("\nA idade do aluno é %d", 2020 - anoNascimentoAluno);
		}
		else if(generoAluno == 'F') {
			System.out.printf("\nA idade da aluna é %d", 2020 - anoNascimentoAluno);
		}
	}
	public void alunoResultado() {
		double media = media();
		if(media > mediaAprovacao) {
			if(generoAluno == 'M') {
				System.out.printf("\nMédia: é %.2f", media);
				System.out.printf("\nAluno aprovado!");
			}
			else if(generoAluno == 'F') {
				System.out.printf("\nMédia: é %.2f", media);
				System.out.printf("\nAluna está aprovada");
			}
		}
		else {
			if(generoAluno == 'M') {
				System.out.printf("\nMédia: é %.2f", media);
				System.out.printf("\nAluno reprovado!");
			}
			else if(generoAluno == 'F') {
				System.out.printf("\nMédia: %.2f", media);
				System.out.printf("\nAluna reprovada!");
			}
		}
	}	
	
	public void mostra() {
		if(generoAluno == 'M') {
			System.out.printf("\nAluno: %s | Turma: %c", nomeAluno, turmaAluno);
		}
		else if(generoAluno == 'F') {
			System.out.printf("\nAluna: %s |Turma: %c", nomeAluno, turmaAluno);
		}	
	}
}