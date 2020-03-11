package br.com.iw.collections;

import java.util.ArrayList;

public class Numeros 
{
	private ArrayList<Integer> numeros;
	
	public Numeros() 
	{
		this.numeros = new ArrayList<Integer>();
	}

	public ArrayList<Integer> getNumeros() 
	{
		return numeros;
	}

	public void setNumeros(ArrayList<Integer> numeros) 
	{
		this.numeros = numeros;
	}
	
	public void imprimirNumeros()
	{
		System.out.print("[ ");
		for(Integer numero: numeros)
		{
			System.out.print(numero+" ");
		}
		System.out.println("]");
	}
	
	//Opera��es B�sicas utilizadas em Arrays
	
	//Inserir N�mero
	public void inserirNumero(int numero) 
	{
		this.numeros.add(numero);
		System.out.println("O n�mero " + numero + " foi inserido com sucesso!");
	}
	
	//Remover N�mero
	public void removerNumero(int numero)
	{
		this.numeros.remove(numeros.indexOf(numero));
		System.out.println("O n�mero " + numero + " foi removido com sucesso!");
	}
	
	//Buscar N�mero
	public void buscarNumero(int numero)
	{
		for(Integer num: numeros)
		{
			if (num==numero) 
			{
				System.out.println("O n�mero " + numero + " foi encontrado no vetor!");
				return;
			}
		}
		System.out.println("O " + numero + " n�o foi encontrado!!!");
	}
	
	//Atualizar N�mero
	public void atualizaNumero(int numeroAnterior, int numeroAtual)
	{
		int indice;
		for(Integer numero: numeros)
		{
			if (numero==numeroAnterior) 
			{
				indice = numeros.indexOf(numero);
				numeros.set(indice, numeroAtual);
				System.out.println("O n�mero " + numeroAnterior + " foi alterado para " + numeroAtual +" !");
				return;
			}
		}
		System.out.println("O " + numeroAnterior + " n�o foi encontrado!!!");
	}
	
}
