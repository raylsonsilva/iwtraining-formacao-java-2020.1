package br.com.iw.restaurante;

import java.util.ArrayList;
import java.util.Date;

public class Conta 
{
	private Mesa mesa;
	private Garcom garcom;
	private Date dataHorarioAbertura;
	private Date dataHorarioFechamento;
	private StatusConta status;
	private ArrayList<ItemConta> itens;
	
	public Mesa getMesa() 
	{
		return mesa;
	}
	public void setMesa(Mesa mesa) 
	{
		this.mesa = mesa;
	}
	
	public Garcom getGarcom() 
	{
		return garcom;
	}
	
	public void setGarcom(Garcom garcom) 
	{
		this.garcom = garcom;
	}
			
	public Date getDataHorarioAbertura() 
	{
		return dataHorarioAbertura;
	}
	
	public void setDataHorarioAbertura(Date dataHorarioAbertura) 
	{
		this.dataHorarioAbertura = dataHorarioAbertura;
	}
	
	public Date getDataHorarioFechamento() 
	{
		return dataHorarioFechamento;
	}
	
	public void setDataHorarioFechamento(Date dataHorarioFechamento) 
	{
		this.dataHorarioFechamento = dataHorarioFechamento;
	}
	
	public StatusConta getStatus() 
	{
		return status;
	}
	public ArrayList<ItemConta> getItens() {
		return itens;
	}
	public void setItens(ArrayList<ItemConta> itens) {
		this.itens = itens;
	}
	public void setStatus(StatusConta status) {
		this.status = status;
	}
	
}
