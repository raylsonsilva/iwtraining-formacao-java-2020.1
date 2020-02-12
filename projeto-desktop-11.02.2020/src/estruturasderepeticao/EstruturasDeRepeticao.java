package estruturasderepeticao;

public class EstruturasDeRepeticao 
{

	public static void main(String[] args) 
	{
		// Exemplo com a Estrutura FOR
		int numero = 5;
		
		for (int i = 0; i < 10; i++) 
		{
			if (numero%2==0)
			{
				System.out.println(numero + " � par!");
			} else {
				System.out.println(numero + " � impar!");
			}			
		}

		// N�meros pares/�mpares de 0..100
	
		for (int i = 0; i <= 100; i++) 
		{
			if (i%2==0)
			{
				System.out.println(i + " � par!");
			} else {
				System.out.println(i + " � impar!");
			}			
		}
	
		// N�meros multiplos 3 de 0..100
		int i = 0;
		while (i <= 100) 
		{
			if (i%3==0)
			{
				System.out.println(i + " � multiplo de 3!");
			} else {
				System.out.println(i + " n�o � multiplo de 3!");
			}	
			i++;
		}

		// Exemplo com a Estrutura WHILE
		numero = 10;
		i = 0;
	
		while ( i < 10 ) 
		{
			if (numero%2==0)
			{
				System.out.println(numero + " � par!");
			} else {
				System.out.println(numero + " � impar!");
			}	
			i++;
		}
	
		//Exemplo com a Estrutura DO-WHILE
		numero = 15;
		i = 0;
		
		do {
			if (numero%2==0)
			{
				System.out.println(numero + " � par!");
			} else {
				System.out.println(numero + " � impar!");
			}	
			i++;
		} while ( i < 10 );
		
	}

}
