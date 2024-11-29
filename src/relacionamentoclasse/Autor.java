package relacionamentoclasse;

public class Autor {
	private String nomeAutor;
	private Livro[] livrosEscritos;

	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public Livro[] getLivrosEscritos() {
		return livrosEscritos;
	}
	public void setLivrosEscritos(Livro[] livrosEscritos) {
		this.livrosEscritos = livrosEscritos;
	}
	
	public void imprimirAutor() {
		System.out.println("Autor: " + getNomeAutor());
		System.out.println("Obras: ");
		if (livrosEscritos != null && livrosEscritos.length > 0) {
			for (Livro livrosEscritos : livrosEscritos) {
				System.out.println(livrosEscritos.getNomeLivro());
			}
		} else {
			System.out.println("Esse autor não tem livro");
		}
	}
}
