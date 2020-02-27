package polimorfismo;

public class DemoBanco {

	public static void main(String[] args) 
	{
		String nome = "Raylson Silva de Lima";
		int idade = 25;
		String dataDeNascimento = "21/03/1994";
		long cpf = 60375890001L;
		Endereco endereco = new Endereco();
		int matricula = 24017;
		double salario = 1000;
		String departamento = "Tecnologia da Informação";
		int senha = 123456;
		int qtdFuncionarios = 20;
		boolean cartaoCorporativo = true;
		int qtdGerentes = 30;
		String pais = "Brasil";
		int qtdDiretores = 15;
		
		Funcionario novoFuncionario = new Funcionario(nome, idade, 
				dataDeNascimento, cpf, endereco, matricula, salario, 
				departamento);
		
		Gerente novoGerente = new Gerente(nome, idade, dataDeNascimento, cpf, endereco, 
				matricula, salario, departamento, senha, qtdFuncionarios);
		
		
		Diretor novoDiretor = new Diretor(nome, idade, dataDeNascimento, cpf, 
				endereco, matricula, salario, departamento, senha, 
				qtdFuncionarios, cartaoCorporativo, qtdGerentes);
		
		Presidente novoPresidente = new Presidente(nome, idade, 
				dataDeNascimento, cpf, endereco, matricula, salario, 
				departamento, senha, qtdFuncionarios, cartaoCorporativo, 
				qtdGerentes, pais, qtdDiretores);
		
		RelatorioBonus resultadoRelatorio = new RelatorioBonus();
		
		resultadoRelatorio.calculaTotalDeBonusFuncionario(novoFuncionario);
		//resultadoRelatorio.calculaTotalDeBonusFuncionario(novoGerente);
		//resultadoRelatorio.calculaTotalDeBonusFuncionario(novoDiretor);
		//resultadoRelatorio.calculaTotalDeBonusFuncionario(novoPresidente);
		System.out.println("Bonus Funcionário: " + resultadoRelatorio.getTotalDeBonusPago());

	}

}
