package br.com.iw;

public class Data 
{
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int minuto;
	private int segundo;
	
	public Data() 
	{
		
	}
	public Data(int dia, int mes, int ano) 
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) 
	{
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public int getDia() 
	{
		return dia;
	}
	
	public void setDia(int dia) 
	{
		this.dia = dia;
	}
	
	public int getMes() 
	{
		return mes;
	}
	
	public void setMes(int mes) 
	{
		this.mes = mes;
	}
	
	public int getAno() 
	{
		return ano;
	}
	
	public void setAno(int ano) 
	{
		this.ano = ano;
	}
	
}
