package br.com.iw.interfaces;

public class Mulher implements PessoaIMC 
{
	private double peso;
	private double altura;
	
	public double getPeso() 
	{
		return peso;
	}
	
	public void setPeso(double peso) 
	{
		this.peso = peso;
	}
	
	public double getAltura() 
	{
		return altura;
	}
	
	public void setAltura(double altura) 
	{
		this.altura = altura;
	}
	
	@Override
	public double calculaIMC(double peso, double altura) {
		return peso/(altura*altura);
	}
	
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
