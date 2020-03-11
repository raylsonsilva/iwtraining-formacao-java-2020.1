package br.com.iw.collections;

public class Main {

	public static void main(String[] args) 
	{
		Numeros vetorDeNumeros = new Numeros();
		
		vetorDeNumeros.imprimirNumeros();
		
		vetorDeNumeros.inserirNumero(6);
		vetorDeNumeros.inserirNumero(10);
		vetorDeNumeros.inserirNumero(3);
		vetorDeNumeros.inserirNumero(11);
		
		vetorDeNumeros.imprimirNumeros();
		
		vetorDeNumeros.removerNumero(10);
		
		vetorDeNumeros.imprimirNumeros();
		
		vetorDeNumeros.buscarNumero(3);
		
		vetorDeNumeros.imprimirNumeros();
		
		vetorDeNumeros.atualizaNumero(3, 9);
		
		vetorDeNumeros.imprimirNumeros();
	}

}
