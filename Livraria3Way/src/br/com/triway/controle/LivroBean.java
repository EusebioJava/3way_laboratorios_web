package br.com.triway.controle;

import java.io.Serializable;

@ManagedBean //(name = "livroBean")
@SessionScoped
public class LivroBean implements Serializable {
	private static final String RESULTADO = "Resultado";
	private static final String LIVRO = "Livro";
	//Defina os campos do DIAGRAMA UML
	@PostConstruct
		private void init(){
			service = new CatalogoService();
			System.out.println("LivroBean.init()");
		}
		public String pesquisar(){
			livros = service.consultar(titulo);
			return RESULTADO;
		}
		public String verLivro(){
			livro = service.verLivro(codigo);
			return LIVRO;
	}
}
//OBS: �Resultado� e �Livro� nesse caso s�o o nome das p�ginas XHTML relacionadas. No caso, estamos fazendo uma navega��o
//din�mica impl�cita. Nos pr�ximos passos iremos criar cada uma dessas p�ginas.
//A anota��o @PostConstruct, invoca o m�todo init() logo ap�s o Faces Servlet criar o managed bean, assim sendo, voc� pode
//usar esse procedimento para inicializar ou realizar qualquer outra opera��o logo ap�s a cria��o do bean.