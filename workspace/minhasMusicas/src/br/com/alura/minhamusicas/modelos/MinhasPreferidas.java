package br.com.alura.minhamusicas.modelos;

public class MinhasPreferidas {
	
	public void inclui(Audio audio) {
		if(audio.getClassificacao() >= 9) {
			System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos!");
		}else {
			System.out.println(audio.getTitulo() + " é também é uma dos que todo mundo está curtindo");
		}
	}

}
