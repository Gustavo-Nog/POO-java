package relacionamentoclasse;

public class Editora {
	private String nomeEditora;
	private String localizacao;
	
	public String getNomeEditora() {
		return nomeEditora;
	}
	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public void imprimirEditora() {
		System.out.println("Nome da editora: " + getNomeEditora());
		System.out.println("Endereço da editora: " + getLocalizacao());
	}
}
