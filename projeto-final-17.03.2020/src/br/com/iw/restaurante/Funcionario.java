package br.com.iw.restaurante;

public abstract class Funcionario extends Pessoa 
{
	private int matricula;
	private double salario;
	private String rg;
	private long cpf;
	
	public Funcionario(String nome, String estadoCivil, Endereco endereco, String telefone, int matricula,
			double salario, String rg, long cpf) 
	{
		super(nome, estadoCivil, endereco, telefone);
		this.matricula = matricula;
		this.salario = salario;
		this.rg = rg;
		this.cpf = cpf;
	}

	public int getMatricula() 
	{
		return matricula;
	}
	
	public void setMatricula(int matricula) 
	{
		this.matricula = matricula;
	}
	
	public double getSalario() 
	{
		return salario;
	}
	
	public void setSalario(double salario) 
	{
		this.salario = salario;
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
