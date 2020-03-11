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
	
	//Operações Básicas utilizadas em Arrays
	
	//Inserir Número
	public void inserirNumero(int numero) 
	{
		this.numeros.add(numero);
		System.out.println("O número " + numero + " foi inserido com sucesso!");
	}
	
	//Remover Número
	public void removerNumero(int numero)
	{
		this.numeros.remove(numeros.indexOf(numero));
		System.out.println("O número " + numero + " foi removido com sucesso!");
	}
	
	//Buscar Número
	public void buscarNumero(int numero)
	{
		for(Integer num: numeros)
		{
			if (num==numero) 
			{
				System.out.println("O número " + numero + " foi encontrado no vetor!");
				return;
			}
		}
		System.out.println("O " + numero + " não foi encontrado!!!");
	}
	
	//Atualizar Número
	public void atualizaNumero(int numeroAnterior, int numeroAtual)
	{
		int indice;
		for(Integer numero: numeros)
		{
			if (numero==numeroAnterior) 
			{
				indice = numeros.indexOf(numero);
				numeros.set(indice, numeroAtual);
				System.out.println("O número " + numeroAnterior + " foi alterado para " + numeroAtual +" !");
				return;
			}
		}
		System.out.println("O " + numeroAnterior + " não foi encontrado!!!");
	}
	
}
