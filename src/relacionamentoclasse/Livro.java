package relacionamentoclasse;

public class Livro {
	private String nomeLivro;
	private String editora;
	private String paginas;
	private Autor[] autores;
	private Leitor leitor;
	
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getPaginas() {
		return paginas;
	}
	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}
	public Autor[] getAutores() {
		return autores;
	}
	public void setAutores(Autor[] autores) {
		this.autores = autores;
	}
	public Leitor getLeitor() {
		return leitor;
	}
	public void setLeitor(Leitor leitor) {
		this.leitor = leitor;
	}
	
	public void imprimirLivro() {
		System.out.println("Titulo: " + getNomeLivro());
		System.out.println("Editora: " + getEditora());
		System.out.println("Paginas: " + getPaginas());
		for (Autor autores : autores) {
        System.out.println(autores.getNomeAutor());
      }
  }
}
