package lista02;

public class Aluno {
	
	private String nome;
	private float nota01;
	private float nota02;
	private float media;
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public float getNota01() 
	{
		return nota01;
	}
	
	public void setNota01(float nota01) 
	{
		this.nota01 = nota01;
	}
	public float getNota02() 
	{
		return nota02;
	}
	
	public void setNota02(float nota02) 
	{
		this.nota02 = nota02;
	}
	
	public float getMedia() 
	{
		return media;
	}
	
	public void setMedia(float media) 
	{
		this.media = media;
	}
	
	public void imprimirDados() 
	{
		System.out.println("Nome do Aluno: " + this.nome);
		System.out.println("Nota 01: " + this.nota01);
		System.out.println("Nota 02: " + this.nota02);
		System.out.println("Média: " + this.media);
	}
	
	public void calculaMedia() {
		this.media = ( (this.nota01*2) + (this.nota02*3) ) / 5;
	}
	
	public boolean comparaNotas(float mediaAluno01, float mediaAluno02)
	{
		if (mediaAluno01==mediaAluno02) 
		{
			return true;
		}
		
		return false;
	}

}
