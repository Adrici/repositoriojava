package ExerciciosLacosRepeticao;


public class LacoRepeticao2_For_2 {
	
	public static void main(String[] args) {
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
				
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
	 System.out.printf("\n\nA quantidade de n�meros pares �: %d", par);
	 System.out.printf("\nA quantidade de n�meros �mpares �: %d", impar);
	}
	
}