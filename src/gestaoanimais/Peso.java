package gestaoanimais;

public class Peso implements Monitorar {

	private double peso;
	
	public Peso(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public void gerarRelatorio() {
		System.out.println();
		
	}

}
