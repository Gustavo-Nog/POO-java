package gestaoanimais;

public class Habitat implements Monitorar {
	
	private String nomeHabitat;
	private double areaTotal;
	private int populacaoEstimada;

	public Habitat(String nomeHabitat, double areaTotal, int populacaoEstimada) {
		this.nomeHabitat = nomeHabitat;
		this.areaTotal = areaTotal;
		this.populacaoEstimada = populacaoEstimada;
	}

	public String getNomeHabitat() {
		return nomeHabitat;
	}

	public void setNomeHabitat(String nomeHabitat) {
		this.nomeHabitat = nomeHabitat;
	}

	public double getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}

	public int getPopulacaoEstimada() {
		return populacaoEstimada;
	}

	public void setPopulacaoEstimada(int populacaoEstimada) {
		this.populacaoEstimada = populacaoEstimada;
	}

	@Override
	public void gerarRelatorio() {
		System.out.println("Habitat: " + this.nomeHabitat);
		System.out.println("Area total: " + this.areaTotal + "");
		System.out.println("População estimada: " + this.populacaoEstimada);
		
	}

}
