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
//OBS: “Resultado” e “Livro” nesse caso são o nome das páginas XHTML relacionadas. No caso, estamos fazendo uma navegação
//dinâmica implícita. Nos próximos passos iremos criar cada uma dessas páginas.
//A anotação @PostConstruct, invoca o método init() logo após o Faces Servlet criar o managed bean, assim sendo, você pode
//usar esse procedimento para inicializar ou realizar qualquer outra operação logo após a criação do bean.