package br.com.iw.arrays;

/*
 * Regras de Neg�cio
 * 1. Apenas n�meros naturais
 * 2. Essa estrutura n�o aceita repeti��o de n�meros
*/

public class Numeros 
{
	private int[] numeros;

	public Numeros(int tamanho) 
	{
		this.numeros = new int[tamanho];
	}
	
	public int[] getNumeros() 
	{
		return numeros;
	}

	public void setNumeros(int[] numeros) 
	{
		this.numeros = numeros;
	}
	
	public void inicializaVetor()
	{
		for (int i = 0; i < numeros.length; i++) 
		{
			numeros[i] = -1;
		}
	}
	
	public void imprimirNumeros()
	{
		System.out.print("[ ");
		for (int i = 0; i < numeros.length; i++) 
		{
			System.out.print(numeros[i]+" ");
		}
		System.out.println(" ]");
	}
	
	//Opera��es B�sicas utilizadas em Arrays
	
	//Inserir N�mero
	public void inserirNumero(int numero) 
	{
		for (int i = 0; i < numeros.length; i++) 
		{
			if (numeros[i]==-1) 
			{
				numeros[i] = numero;
				System.out.println("O n�mero " + numero + " foi inserido com sucesso!");
				return;
			}
		}
		System.out.println("Ocorreu um erro ao tentar inserir o n�mero!!!");
	}
	
	//Remover N�mero
	public void removerNumero(int numero)
	{
		for (int i = 0; i < numeros.length; i++) 
		{
			if (numeros[i]==numero) 
			{
				numeros[i] = -1;
				System.out.println("O n�mero " + numero + " foi removido com sucesso!");
				return;
			}
		}
		System.out.println("Ocorreu um erro ao tentar remover o n�mero!!!");
	}
	
	//Buscar N�mero
	public void buscarNumero(int numero)
	{
		for (int i = 0; i < numeros.length; i++) 
		{
			if (numeros[i]==numero) 
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
		for (int i = 0; i < numeros.length; i++) 
		{
			if (numeros[i]==numeroAnterior) 
			{
				numeros[i] = numeroAtual;
				System.out.println("O n�mero " + numeroAnterior + " foi alterado para " + numeroAtual +" !");
				return;
			}
		}
		System.out.println("O " + numeroAnterior + " n�o foi encontrado!!!");
	}
	

}
