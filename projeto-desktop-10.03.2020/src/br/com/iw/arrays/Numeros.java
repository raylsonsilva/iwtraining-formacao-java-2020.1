package br.com.iw.arrays;

/*
 * Regras de Negócio
 * 1. Apenas números naturais
 * 2. Essa estrutura não aceita repetição de números
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
	
	//Operações Básicas utilizadas em Arrays
	
	//Inserir Número
	public void inserirNumero(int numero) 
	{
		for (int i = 0; i < numeros.length; i++) 
		{
			if (numeros[i]==-1) 
			{
				numeros[i] = numero;
				System.out.println("O número " + numero + " foi inserido com sucesso!");
				return;
			}
		}
		System.out.println("Ocorreu um erro ao tentar inserir o número!!!");
	}
	
	//Remover Número
	public void removerNumero(int numero)
	{
		for (int i = 0; i < numeros.length; i++) 
		{
			if (numeros[i]==numero) 
			{
				numeros[i] = -1;
				System.out.println("O número " + numero + " foi removido com sucesso!");
				return;
			}
		}
		System.out.println("Ocorreu um erro ao tentar remover o número!!!");
	}
	
	//Buscar Número
	public void buscarNumero(int numero)
	{
		for (int i = 0; i < numeros.length; i++) 
		{
			if (numeros[i]==numero) 
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
		for (int i = 0; i < numeros.length; i++) 
		{
			if (numeros[i]==numeroAnterior) 
			{
				numeros[i] = numeroAtual;
				System.out.println("O número " + numeroAnterior + " foi alterado para " + numeroAtual +" !");
				return;
			}
		}
		System.out.println("O " + numeroAnterior + " não foi encontrado!!!");
	}
	

}
