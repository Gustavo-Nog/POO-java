package relacionamentoclasse;

public class Biblioteca {
	private String nomeBiblioteca;
	private String endereco;
	private Livro[] livros;
	
	public String getNomeBiblioteca(){
	return nomeBiblioteca;
	}
	public void setNomeBiblioteca (String nomeBiblioteca){
		this.nomeBiblioteca = nomeBiblioteca;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Livro[] getLivros() {
		return livros;
	}
	public void setLivros(Livro[] livros) {
		this.livros = livros;
	}
	
	public void imprimirBiblioteca() {
    System.out.println("Biblioteca: " + getNomeBiblioteca());
    System.out.println("Endereço: " + getEndereco());
    if (livros != null && livros.length > 0) {
        System.out.println("Livros disponíveis:");
        for (Livro livro : livros) {
            System.out.println(" - " + livro.getNomeLivro());
        }
    } else {
        System.out.println("Nenhum livro disponível na biblioteca.");
    }
	}
}
