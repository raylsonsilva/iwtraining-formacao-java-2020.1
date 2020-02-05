package br.com.iw;

public class Aluno 
{
	private String nome;
	private float media;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getMedia() {
		return media;
	}
	
	public void setMedia(float media) {
		this.media = media;
	}
	
	public void verificaMediaOpcao01() {
		
		if (this.media >= 7) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno reprovado!");
		}
		
	}
	
	public void verificaMediaOpcao02() {
		String resultado = this.media >= 7 ? "Aluno aprovado!" : "Aluno reprovado!";
		System.out.println(resultado);
	}
	
	public void verificaMediaOpcao03(int media) {
		
		switch (media) {
			case 3:
				System.out.println("Aluno reprovado!");
				break;
			case 6:
				System.out.println("Aluno com pendencia de nota");
				break;
			case 7:
				System.out.println("Aluno aprovado");
				break;
		}
	}
		
}
