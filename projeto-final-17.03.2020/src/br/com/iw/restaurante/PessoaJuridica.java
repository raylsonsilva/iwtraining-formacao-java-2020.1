package br.com.iw.restaurante;

public class PessoaJuridica extends Cliente 
{
	private long cnpj;
	
	public PessoaJuridica(String nome, String estadoCivil, Endereco endereco, String telefone) 
	{
		super(nome, estadoCivil, endereco, telefone);
	}

	public long getCnpj() 
	{
		return cnpj;
	}

	public void setCnpj(long cnpj) 
	{
		this.cnpj = cnpj;
	}
	
}
