package relacionamentoclasse;

public class Leitor {
	private String nomeLeitor;
	private String enderecoLeitor;
	private String idLeitor;
	private Livro[] livrosEmprestados;
	
	public String getNomeLeitor() {
		return nomeLeitor;
	}
	public void setNomeLeitor(String nomeLeitor) {
		this.nomeLeitor = nomeLeitor;
	}
	public String getEnderecoLeitor() {
		return enderecoLeitor;
	}
	public void setEnderecoLeitor(String enderecoLeitor) {
		this.enderecoLeitor = enderecoLeitor;
	}
	public String getIdLeitor() {
		return idLeitor;
	}
	public void setIdLeitor(String idLeitor) {
		this.idLeitor = idLeitor;
	}
	public Livro[] getLivrosEmprestados() {
		return livrosEmprestados;
	}
	public void setLivrosEmprestados(Livro[] livrosEmprestados) {
		this.livrosEmprestados = livrosEmprestados;
	}
	
	public void imprimirLeitor() {
	System.out.println("Leitor " + getNomeLeitor());
	System.out.println("Endereco: " + getEnderecoLeitor());
	System.out.println("ID: " + getIdLeitor());
	if (livrosEmprestados != null) {
	  for (Livro livrosEmprestados : livrosEmprestados) 
	  System.out.println("na posse dos seguintes livros: " + livrosEmprestados.getNomeLivro());
	} else {
	  System.out.println("Nenhum livro emprestado.");
	}
	}
}
