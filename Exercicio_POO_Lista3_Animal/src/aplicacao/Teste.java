package aplicacao;

import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguica;
public class Teste {
	public static void main(String[] args) {
		
		
		Cachorro cachorro = new Cachorro("Fubá" , 2 , "Late", "Corre");
		Cavalo cavalo = new Cavalo ("Alado", 8 , "Relincha", "Trota");
		Preguica preguica = new Preguica ("Penelope" , 18 , "Grita", "Sobe em Árvore");
		
	
		
	cachorro.exibir();
	cavalo.exibir();
	preguica.exibir();
	
		
	}
}
