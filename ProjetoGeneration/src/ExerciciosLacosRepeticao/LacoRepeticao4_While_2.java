package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class LacoRepeticao4_While_2 {

	public static void main(String[] args) {
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as 
		 * características psicológicas dos indivíduos de uma região. Para tanto, 
		 * a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino), 
		 * e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, 
		 * se a pessoa era agressiva). Pede-se para elaborar um sistema que permita ler os 
		 * dados de 150 pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.
*/

		Scanner kb = new Scanner(System.in);
		int idadeEntrevistado, genero, temperamento;
		int pessoas = 0, mulherNervosa = 0, calma = 0, homemAgressivo = 0, pessoaCalma = 0, pessoaNervosa = 0;
		final int LIMITE = 5;
		
		//teste com 3 pessoas
		while (pessoas < LIMITE) {
			System.out.println("Idade do[a] individuo[a]:");
			idadeEntrevistado = kb.nextInt();
			System.out.println("Sexo: \n 1 - Masculino\n2-Feminino :");
			genero = kb.nextInt();
			
			System.out.println("Temperamento da pessoa: \n 1 - Calmo[a] \n 2 - Nervoso[a] \n 3 - Agressivo[a]");
			temperamento = kb.nextInt();
			if(temperamento == 1) {
				calma++;
				if (idadeEntrevistado<18) {
					pessoaCalma++;
				}
			}
			else if(genero ==1 && temperamento == 3) {
				homemAgressivo++;
				
			}
			else if (idadeEntrevistado > 40 && temperamento ==2) {
				pessoaNervosa++;
				if (genero==2) {
					mulherNervosa++;
				}
			}
			pessoas++;
			
		}
		System.out.printf("\nTotal de pessoas pesquisadas: %d", pessoas);
		System.out.printf("\nNumero de pessoas calma: %d", calma);
		System.out.printf("\nMulheres nervosas: %d", mulherNervosa);
		System.out.printf("\nNumeros de homens agressivos: %d",  homemAgressivo);
		System.out.printf("\nNumero de pessoas nervorsas com mais de 40 anos: %d", pessoaNervosa);
		System.out.printf("\nNumero de pessoas calmas menores de 18 anos: %d", pessoaCalma);
		
		kb.close();

	}

}
