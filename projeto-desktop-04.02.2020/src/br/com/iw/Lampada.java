package br.com.iw;

public class Lampada 
{
	private int watts;
	public static int qtdLampadas;
	
	public Lampada() 
	{
		this.watts = 60;
	}
	
	public Lampada (int watts) 
	{
		this.watts = watts;
	}

	public int getWatts() 
	{
		return watts;
	}

	public void setWatts(int watts) 
	{
		this.watts = watts;
	}
	
	
}
