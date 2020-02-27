package polimorfismo;

public class Presidente extends Diretor {
	
	private String pais;
	private int qtdDiretores;
	
	public Presidente(String nome, int idade, String dataDeNascimento, 
			long cpf, Endereco endereco, int matricula, double salario, 
			String departamento, int senha, int qtdFuncionarios, 
			boolean cartaoCorporativo, int qtdGerentes, String pais,
			int qtdDiretores) 
	{
		
		super(nome, idade, dataDeNascimento, cpf, endereco, matricula, 
				salario, departamento, senha, qtdFuncionarios, 
				cartaoCorporativo, qtdGerentes);
		
		this.pais = pais;
		this.qtdDiretores = qtdDiretores;
	}
	
	public String getPais() 
	{
		return pais;
	}
	
	public void setPais(String pais) 
	{
		this.pais = pais;
	}
	
	public int getQtdDiretores() 
	{
		return qtdDiretores;
	}
	
	public void setQtdDiretores(int qtdDiretores) 
	{
		this.qtdDiretores = qtdDiretores;
	}
	
	public double calculaBonus () {
		return getSalario()*1.8;
	}

}
