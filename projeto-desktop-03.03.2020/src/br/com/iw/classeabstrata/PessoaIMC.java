package br.com.iw.classeabstrata;

public abstract class PessoaIMC 
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
	
	public double calculaIMC(double peso, double altura) 
	{
		return peso/(altura*altura);
	}
	
	public abstract void resultIMC(double peso, double altura);

	@Override
	public String toString() 
	{
		return "PessoaIMC [peso=" + peso + ", altura=" + altura + "]";
	}
	
}
