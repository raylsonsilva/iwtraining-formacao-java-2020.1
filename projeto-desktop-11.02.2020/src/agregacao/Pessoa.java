package agregacao;

public class Pessoa 
{
	
	private String nome;
	private int idade;
	private long cpf;
	private Endereco enderecoPessoa;
	
	public Endereco getEnderecoPessoa() 
	{
		return enderecoPessoa;
	}
	
	public void setEnderecoPessoa(Endereco enderecoPessoa) 
	{
		this.enderecoPessoa = enderecoPessoa;
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
	
	public long getCpf() 
	{
		return cpf;
	}
	
	public void setCpf(long cpf) 
	{
		this.cpf = cpf;
	}

}
