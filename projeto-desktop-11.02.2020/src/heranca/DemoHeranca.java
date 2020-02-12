package heranca;

public class DemoHeranca 
{

	public static void main(String[] args) 
	{
		
		Funcionario novoFuncionario = new Funcionario();
		
		novoFuncionario.setNome("Wagner IW");
		novoFuncionario.setIdade(40);
		novoFuncionario.setCpf(60375800301L);
		novoFuncionario.setMatricula(20247);
		
		novoFuncionario.imprimirDados();
		
	}

}
