package br.com.iw.classeabstrata;

public class Mulher extends PessoaIMC 
{

	@Override
	public void resultIMC(double peso, double altura) 
	{
		
		double resultadoIMC = calculaIMC(peso, altura);
		
		if (resultadoIMC > 39) 
		{
			System.out.println("Obesidade Mórbida");
		} else if (resultadoIMC >= 29 & resultadoIMC < 38.9)
		{
			System.out.println("Obesidade Moderada");
		} else if (resultadoIMC >= 24 & resultadoIMC < 28.9)
		{
			System.out.println("Obesidade Leve");
		} else if (resultadoIMC >= 19 & resultadoIMC < 23.9)
		{
			System.out.println("Normal");
		} else if (resultadoIMC < 19)
		{
			System.out.println("Abaixo do Normal");
		}
		
	}
	
}
