package br.com.iw;

import java.util.Scanner;

public class DemoEndereco 
{

	public static void main(String[] args) 
	{
		Scanner inputData = new Scanner(System.in);
		Endereco enderecoNovo = new Endereco();
		
		System.out.println("Digite o logradouro: ");
		enderecoNovo.setLogradouro(inputData.nextLine());
		
		System.out.println("Digite o número: ");
		enderecoNovo.setNumero(inputData.nextInt());
		//Inserir a linha abaixo para fazer a limpeza do buffer
		//OBS: Apenas quando a leitura de um número anteceder a leitura de uma String
		inputData.nextLine();
		
		System.out.println("Digite o complemento: ");
		enderecoNovo.setComplemento(inputData.nextLine());
		
		System.out.println("Digite o CEP: ");
		enderecoNovo.setCep(inputData.nextLine());
		
		System.out.println("Digite o bairro: ");
		enderecoNovo.setBairro(inputData.nextLine());
		
		System.out.println("Digite a cidade: ");
		enderecoNovo.setCidade(inputData.nextLine());
		
		System.out.println("Digite o UF: ");
		enderecoNovo.setUf(inputData.nextLine());
		
		System.out.println("Logradouro: " + enderecoNovo.getLogradouro());
		System.out.println("Número: " + enderecoNovo.getNumero());
		System.out.println("Complemento: " + enderecoNovo.getComplemento());
		System.out.println("CEP: " + enderecoNovo.getCep());
		System.out.println("Bairro: " + enderecoNovo.getBairro());
		System.out.println("Cidade: " + enderecoNovo.getCidade());
		System.out.println("UF: " + enderecoNovo.getUf());
		
		inputData.close();
	}

}
