package br.com.iw;

public class DemoData 
{

	public static void main(String[] args) 
	{
		Data novaData = new Data(04,02,2020);
		Data novaDataEspecifica = new Data(04,02,2020,20,05,00);
		
		System.out.println("Data atual: " + novaData.getDia()
		+"/"
		+novaData.getMes()
		+"/"
		+novaData.getAno());
		
		System.out.println("Data atual (Completa): " + novaDataEspecifica.getDia()
		+"/"
		+novaDataEspecifica.getMes()
		+"/"
		+novaDataEspecifica.getAno()
		+"-"
		+novaDataEspecifica.getHora()
		+":"
		+novaDataEspecifica.getMinuto()
		+":"
		+novaDataEspecifica.getSegundo());
	}

}
