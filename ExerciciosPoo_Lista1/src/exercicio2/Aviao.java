package exercicio2;

public class Aviao {
	public String modeloAviao; 
	public int capacidadeAviao;
	public String paisOrigemAviao;
	

	public void modelo() {
		String modelo = modeloAviao; 
		System.out.printf("\nModelo da aeronave: %s", modelo);
	}
	public void capacidade() {
		int capacidade = capacidadeAviao;
		System.out.printf("\nCapacidade de passageiros suportada pela aeronave: %s", capacidade);
	}
	public void pais() {
		String pais = paisOrigemAviao; 
		System.out.printf("\nEsta aeronave pertence a uma companheia do(a): %s", pais); 
	}
	 
}
