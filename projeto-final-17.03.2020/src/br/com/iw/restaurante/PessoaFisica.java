package br.com.iw.restaurante;

public class PessoaFisica extends Cliente
{
	private String rg;
	private long cpf;
		
	public PessoaFisica(String nome, String estadoCivil, Endereco endereco, String telefone, String rg, long cpf) 
	{
		super(nome, estadoCivil, endereco, telefone);
		this.rg = rg;
		this.cpf = cpf;
	}

	public String getRg() 
	{
		return rg;
	}
	
	public void setRg(String rg) 
	{
		this.rg = rg;
	}
	
	public long getCpf() 
	{
		return cpf;
	}
	
	public void setCpf(long cpf) 
	{
		this.cpf = cpf;
	}
	
	
}
