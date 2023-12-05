package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel{
//classe especifica o conteúdo de um Objeto
	private String diretor;

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int getClassificacao() {
		// TODO Auto-generated method stub
		return (int) pegaMedia() / 2;
	}

	
}
