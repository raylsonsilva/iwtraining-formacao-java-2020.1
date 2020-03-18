package br.com.iw.restaurante;

public class Produto implements ImpostoProduto
{
	private int codProduto;
	private float preco;
	private String descricao;
	private CategoriaProduto categoria;
	
	public int getCodProduto() 
	{
		return codProduto;
	}
	
	public void setCodProduto(int codProduto) 
	{
		this.codProduto = codProduto;
	}
	
	public float getPreco() 
	{
		return preco;
	}
	
	public void setPreco(float preco) 
	{
		this.preco = preco;
	}
	
	public String getDescricao() 
	{
		return descricao;
	}
	
	public void setDescricao(String descricao) 
	{
		this.descricao = descricao;
	}
	
	public CategoriaProduto getCategoria() 
	{
		return categoria;
	}
	
	@Override
	public double calculaIPI() 
	{
		return this.preco*0.01;	
	}
	
	@Override
	public double calculaICMS() 
	{
		return this.preco*0.023;		
	}
		
	@Override
	public double calculaISS() 
	{
		return this.preco*0.05;
	}
	
}
