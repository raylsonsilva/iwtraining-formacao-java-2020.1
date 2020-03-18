package br.com.iw.restaurante;

public abstract class Pessoa 
{
	private String nome;
	private String estadoCivil;
	private Endereco endereco;
	private String telefone;
		
	public Pessoa(String nome, String estadoCivil, Endereco endereco, String telefone) 
	{
		this.nome = nome;
		this.estadoCivil = estadoCivil;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getEstadoCivil() 
	{
		return estadoCivil;
	}
	
	public void setEstadoCivil(String estadoCivil) 
	{
		this.estadoCivil = estadoCivil;
	}
	
	public Endereco getEndereco() 
	{
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) 
	{
		this.endereco = endereco;
	}
	
	public String getTelefone() 
	{
		return telefone;
	}
	
	public void setTelefone(String telefone) 
	{
		this.telefone = telefone;
	}
	
	
}
