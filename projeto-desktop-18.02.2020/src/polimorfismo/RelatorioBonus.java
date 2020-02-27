package polimorfismo;

public class RelatorioBonus {

	private double totalDeBonusPago;
	
	public void calculaTotalDeBonusFuncionario(Funcionario funcionario)
	{
		this.totalDeBonusPago += funcionario.calculaBonus();
	}

	public double getTotalDeBonusPago() 
	{
		return totalDeBonusPago;
	}

	public void setTotalDeBonusPago(double totalDeBonusPago) 
	{
		this.totalDeBonusPago = totalDeBonusPago;
	}
	
	
}
