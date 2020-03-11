package br.com.iw.exemploarrays;

public class Turma 
{
	private String nomeDaTurma;
	private String turno;
	private String horario;
	private Aluno[] alunos;
	
	public String getNomeDaTurma() {
		return nomeDaTurma;
	}
	
	public void setNomeDaTurma(String nomeDaTurma) 
	{
		this.nomeDaTurma = nomeDaTurma;
	}
	
	public String getTurno() 
	{
		return turno;
	}
	
	public void setTurno(String turno) 
	{
		this.turno = turno;
	}
	
	public String getHorario() 
	{
		return horario;
	}
	
	public void setHorario(String horario) 
	{
		this.horario = horario;
	}
	
	public Aluno[] getAlunos() 
	{
		return alunos;
	}
	
	public void setAlunos(Aluno[] alunos) 
	{
		this.alunos = alunos;
	}	

}
