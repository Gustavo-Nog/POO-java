package gestaoanimais;

public class Especie implements Monitorar {
	private String nomeCientifico;
	private int populacao;
	private String statusExtincao;
	
	public Especie(String nomeCientifico, int populacao, String statusExtincao) {
		this.nomeCientifico = nomeCientifico;
		this.populacao = populacao;
		this.statusExtincao = statusExtincao;
	}
	
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	public int getPopulacao() {
		return populacao;
	}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	public String getStatusExtincao() {
		return statusExtincao;
	}
	public void setStatusExtincao(String statusExtincao) {
		this.statusExtincao = statusExtincao;
	}

	@Override
	public void gerarRelatorio() {
		System.out.println("Espécie: " + this.nomeCientifico);
		System.out.println("População: " + this.populacao);
		System.out.println("Status Extinção: " + this.statusExtincao);
	}
	
}
