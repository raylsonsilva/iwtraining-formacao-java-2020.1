package br.com.iw;

public class DemoAluno {

	public static void main(String[] args) {
		
		Aluno novoAluno = new Aluno();
		novoAluno.setNome("Magno");
		novoAluno.setMedia(6);
		novoAluno.verificaMediaOpcao01();
		novoAluno.verificaMediaOpcao02();
		novoAluno.verificaMediaOpcao03(3);
	}

}
