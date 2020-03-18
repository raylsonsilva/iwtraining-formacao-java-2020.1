package br.com.iw.restaurante;

public class Proprietario extends Gerente
{

	public Proprietario(String nome, String estadoCivil, Endereco endereco, String telefone, int matricula,
			double salario, String rg, long cpf) 
	{
		super(nome, estadoCivil, endereco, telefone, matricula, salario, rg, cpf);
	}

}
