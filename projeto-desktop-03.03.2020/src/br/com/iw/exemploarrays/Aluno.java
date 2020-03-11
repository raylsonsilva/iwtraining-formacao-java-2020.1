package br.com.iw.exemploarrays;

public class Aluno 
{
	private String nome;
	private String dataDeNascimento;
	private float[] notas = new float[2];
	
	public Aluno(String nome, String dataDeNascimento) 
	{
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public String getDataDeNascimento() 
	{
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) 
	{
		this.dataDeNascimento = dataDeNascimento;
	}
	public float[] getNotas() 
	{
		return notas;
	}
	
	public void setNotas(float[] notas) 
	{
		this.notas = notas;
	}
	
}
