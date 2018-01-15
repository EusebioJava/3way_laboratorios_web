package br.com.triway.dao;

import java.util.List;

import service.Livro;

public class Pesquisa {

	public static List<Livro> main(String[] args, List<Livro> livros) {
		String titulo = "CASSINO";
		LivroDao daoo = new LivroDao();
		daoo.consultar(titulo)
		.forEach(
				p -> System.out.println("Desc: " + p.getDescricao() + " Preço:" + p.getPreco())
				);
		if(titulo == null){
			titulo = "";
		}
		
			System.out.println("Pesquisa: "+ titulo);
			LivroDao dao1 = new LivroDao();
			livros = dao1.consultar(titulo);
		if(livros.size() <= 0){
			System.out.println("Livro não localizado");
		} 
			return livros;}

	public Livro verLivro(Integer codigo){
		LivroDao dao2 = new LivroDao();
		Livro livros2 = dao2.consultar(codigo);
		return livros2;
		//OBS: dao.consultar(titulo) e dao.consultar(codigo) são métodos do LivroDao, 
		//mas que buscam atributos diferentes
		//(um busca uma lista de livros e outro busca somente um livro).
	}
}
