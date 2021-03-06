/**
 * 
 */
/**
 * @author eulim
 *Classe Livro
 *1. A classe Livro representa a entidade livro em nosso projeto. Obedecer� o padr�o de projeto VO (Value Object) e
 *conter� os dados de um livro. 
 * */
package service;
	public class Livro {
		//
		private int codigo;
		private String titulo;
		private String autor;
		private double preco;
		private String imagem;
		private String descricao;
		//getter e setters 
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		public String getImagem() {
			return imagem;
		}
		public void setImagem(String imagem) {
			this.imagem = imagem;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
}