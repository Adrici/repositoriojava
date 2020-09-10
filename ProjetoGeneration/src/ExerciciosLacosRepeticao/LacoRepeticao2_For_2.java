package ExerciciosLacosRepeticao;


public class LacoRepeticao2_For_2 {
	
	public static void main(String[] args) {
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
				
		int x, par=0, impar=0;
		
		for (x = 1 ; x <= 10 ; x++) 
		{
			
			if (x % 2 == 0) 
			{				
				par=par+1;
				System.out.printf("%d ", x);	}			
			 
			else {
				impar=impar+1;
				System.out.printf("\n%d ", x);
			}
		}
	 System.out.printf("\n\nA quantidade de números pares é: %d", par);
	 System.out.printf("\nA quantidade de números ímpares é: %d", impar);
	}
	
}