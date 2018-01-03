package br.com.triway.controle;

import java.io.Serializable;
import java.util.List;

import br.com.triway.service.CatalogoService;
import service.Livro;

//@ManagedBean //(name = "livroBean")
//@SessionScoped
public class LivroBean implements Serializable {
	//Defina os campos do DIAGRAMA UML
	private String titulo;
	private Livro livro;
	private List<Livro> livros;
	private CatalogoService service;
	private static final String RESULTADO = "Resultado";
	private static final String LIVRO = "Livro";

//	@PostConstruct
		private void init(){
			service = new CatalogoService();
			System.out.println("LivroBean.init()");
		}
		public String pesquisar(){
			livros = service.consultar(titulo);
			return RESULTADO;
		}
		public String verLivro(int codigo){
			livro = service.verLivro(codigo);
			return LIVRO;
		}
		//OBS: �Resultado� e �Livro� nesse caso s�o o nome das p�ginas XHTML relacionadas. No caso, estamos fazendo uma navega��o
		//din�mica impl�cita. Nos pr�ximos passos iremos criar cada uma dessas p�ginas.
		//A anota��o @PostConstruct, invoca o m�todo init() logo ap�s o Faces Servlet criar o managed bean, assim sendo, voc� pode
		//usar esse procedimento para inicializar ou realizar qualquer outra opera��o logo ap�s a cria��o do bean.
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public Livro getLivro() {
			return livro;
		}
		public void setLivro(Livro livro) {
			this.livro = livro;
		}
		public List<Livro> getLivros() {
			return livros;
		}
		public void setLivros(List<Livro> livros) {
			this.livros = livros;
		}
		public CatalogoService getService() {
			return service;
		}
		public void setService(CatalogoService service) {
			this.service = service;
		}

	}

