package entidades;
public class Professor extends Pessoa {
	public Professor(String nome, char sexo, int anoNasc, String etnia) 
	{
		super(nome, sexo, anoNasc, etnia);
	
	}
		private String materiaLecionada;
		
		public String getMateriaLecionada() {
			return materiaLecionada;
		}
		public void setMateriaLecionada(String materiaLecionada) {
			this.materiaLecionada = materiaLecionada;
		} 

}		

	
