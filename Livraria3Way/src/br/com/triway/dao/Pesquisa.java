package br.com.triway.dao;

public class Pesquisa {

	public static void main(String[] args) {
		String titulo = "CASSINO";
		LivroDao dao = new LivroDao();
		dao.consultar(titulo)
		.forEach(
		p -> System.out.println("Desc: "+ p.getDescricao() + " Preço:" + p.getPreco())
		);
	}

}
