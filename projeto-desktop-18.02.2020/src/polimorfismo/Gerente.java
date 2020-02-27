package polimorfismo;

public class Gerente extends Funcionario {

	private int senha;
	private int qtdFuncionarios;
	
	public Gerente(String nome, int idade, String dataDeNascimento, 
			long cpf, Endereco endereco, int matricula, double salario, 
			String departamento, int senha, int qtdFuncionarios) {
		
		super(nome, idade, dataDeNascimento, cpf, endereco, 
				matricula, salario, departamento);
		this.senha = senha;
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
	public int getSenha() 
	{
		return senha;
	}
	
	public void setSenha(int senha) 
	{
		this.senha = senha;
	}
	
	public int getQtdFuncionario() 
	{
		return qtdFuncionarios;
	}
	
	public void setQtdFuncionario(int qtdFuncionarios) 
	{
		this.qtdFuncionarios = qtdFuncionarios;
	}
	
	public double calculaBonus () {
		return getSalario()*1.3;
	}
	
}
