package br.com.iw;

public class DemoLampada 
{

	public static void main(String[] args) 
	{
		Lampada.qtdLampadas = 500;
		
		Lampada novaLampada = new Lampada();
		novaLampada.qtdLampadas+=1;
		Lampada novaLampadaComWatts = new Lampada(220);
		novaLampada.qtdLampadas+=1;
		
		System.out.println("Watts - Lampada 01: " + novaLampada.getWatts());
		System.out.println("Watts - Lampada 02: " + novaLampadaComWatts.getWatts());
		System.out.println("Quantidade de Lampadas: " + novaLampada.qtdLampadas);
	}

}
