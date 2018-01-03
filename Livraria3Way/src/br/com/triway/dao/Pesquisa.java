package br.com.triway.dao;

import service.Livro;

public class Pesquisa {

	public static void main(String[] args) {
		String titulo = "CASSINO";
		LivroDao dao = new LivroDao();
		dao.consultar(titulo).forEach(p -> System.out.println("Desc: " + p.getDescricao() + " Preço:" + p.getPreco()));
		//if(titulo == null){
	//		titulo = "";
	//		} 
	//		System.out.println("Pesquisa: "+ titulo);
		//	LivroDao dao = new LivroDao();
		//	livros = dao.consultar(titulo);
		//	if(livros.size() <= 0){
		//	System.out.println("Livro não localizado");
	//	} return livros;

	//public Livro verLivro(Integer codigo){
		//LivroDao dao = new LivroDao();
	//	livro = dao.consultar(integer codigo);
	//	return livro;
		//OBS: dao.consultar(titulo) e dao.consultar(codigo) são métodos do LivroDao, 
		//mas que buscam atributos diferentes
		//(um busca uma lista de livros e outro busca somente um livro).
	}
}
