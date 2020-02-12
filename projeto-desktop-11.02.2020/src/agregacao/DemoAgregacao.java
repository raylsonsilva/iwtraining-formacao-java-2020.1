package agregacao;

public class DemoAgregacao 
{

	public static void main(String[] args) 
	{
		
		Pessoa novaPessoa = new Pessoa();
		novaPessoa.setNome("Magno Teixeira");
		novaPessoa.setIdade(25);
		novaPessoa.setCpf(02312734362);
		
		Endereco enderecoPessoa = new Endereco();
		enderecoPessoa.setLogradouro("13 de maio");
		enderecoPessoa.setNumero(455);
		enderecoPessoa.setComplemento("A");
		enderecoPessoa.setBairro("Bairro de Fátima");
		enderecoPessoa.setCidade("Fortaleza");
		
		novaPessoa.setEnderecoPessoa(enderecoPessoa);
		
	}

}
