package br.com.triway.service;

import java.util.List;

import br.com.triway.dao.LivroDao;
import service.Livro;

public class CatalogoService {
	// implementa��o dos m�todos,
	public List<Livro> consultar(String titulo) {
		if (titulo == null) {
			titulo = "";
		}
		System.out.println("Pesquisa: " + titulo);
		LivroDao dao = new LivroDao();
		List<Livro> livros = dao.consultar(titulo);
		if (livros.size() <= 0) {
			System.out.println("Livro n�o localizado");
		}
		return livros;
	}

	public Livro verLivro(Integer codigo) {
		LivroDao dao = new LivroDao();
		Livro livro = dao.consultar(codigo);
		return livro;
	}
	// OBS: dao.consultar(titulo) e dao.consultar(codigo) s�o m�todos do LivroDao,
	// mas que buscam atributos diferentes
	// (um busca uma lista de livros e outro busca somente um livro).
}
