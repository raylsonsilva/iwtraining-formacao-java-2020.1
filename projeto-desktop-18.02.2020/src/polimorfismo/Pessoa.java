package polimorfismo;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String dataDeNascimento;
	private long cpf;
	private Endereco endereco;
	
	public Pessoa(String nome, int idade, String dataDeNascimento, 
			long cpf, Endereco endereco) 
	{
		this.nome = nome;
		this.idade = idade;
		this.dataDeNascimento = dataDeNascimento;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public int getIdade() 
	{
		return idade;
	}
	
	public void setIdade(int idade) 
	{
		this.idade = idade;
	}
	
	public String getDataDeNascimento() 
	{
		return dataDeNascimento;
	}
	
	public void setDataDeNascimento(String dataDeNascimento) 
	{
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public long getCpf() 
	{
		return cpf;
	}
	
	public void setCpf(long cpf) 
	{
		this.cpf = cpf;
	}
	
	public Endereco getEndereco() 
	{
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) 
	{
		this.endereco = endereco;
	} 
	
}
