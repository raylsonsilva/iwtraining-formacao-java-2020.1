package br.com.iw.exemploarrays;

public class Principal 
{

	public static void main(String[] args) 
	{
		Aluno aluno01 = new Aluno("Wagner IW", "12/01/1990");
		float[] notasAluno01 = new float[2];
		notasAluno01[0] = 10;
		notasAluno01[1] = 9;		
		aluno01.setNotas(notasAluno01);
		
		Aluno aluno02 = new Aluno("Wagner IW", "12/01/1990");
		float[] notasAluno02 = new float[2];
		notasAluno01[0] = 10;
		notasAluno01[1] = 9;	
		aluno02.setNotas(notasAluno02);
		
		Turma turma01 = new Turma();
		Aluno[] alunos = new Aluno[2];
		alunos[0] = aluno01;
		alunos[1] = aluno02;
		turma01.setAlunos(alunos);
		
	}

}
