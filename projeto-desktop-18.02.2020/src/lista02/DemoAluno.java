package lista02;

public class DemoAluno {

	public static void main(String[] args) 
	{
		Aluno aluno01 = new Aluno();
		Aluno aluno02 = new Aluno();
		
		aluno01.setNome("Magno IW");
		aluno01.setNota01(10);
		aluno01.setNota02(9);
		aluno01.calculaMedia();
		aluno01.imprimirDados();
		
		aluno02.setNome("Jonatas IW");
		aluno02.setNota01(10);
		aluno02.setNota02(9);
		aluno02.calculaMedia();
		aluno02.imprimirDados();
		
		if (aluno01.comparaNotas(aluno01.getMedia(), aluno02.getMedia())) 
		{
			System.out.println("As médias são iguais");
		} else 
		{
			System.out.println("As médias são diferentes");
		}
	}

}
