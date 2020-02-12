package heranca;

public class Funcionario extends Pessoa 
{
	
	private int matricula;

	public int getMatricula() 
	{
		return matricula;
	}

	public void setMatricula(int matricula) 
	{
		this.matricula = matricula;
	}
	
	public void imprimirDados() 
	{
		System.out.println("Nome: " + this.getNome() + " | Matrícula: " + this.matricula);
	}
	
}
