package gestaoanimais;

public class Alimentacao implements Monitorar{
	
	private String tipoAlimentacao;
	private double quantidadeAlimentacao;

	public Alimentacao(String tipoAlimentacao, double quantidadeAlimentacao) {
		this.tipoAlimentacao = tipoAlimentacao;
		this.quantidadeAlimentacao = quantidadeAlimentacao;
	}
	
	public String getTipoAlimentacao() {
		return tipoAlimentacao;
	}
	public void setTipoAlimentacao(String tipoAlimentacao) {
		this.tipoAlimentacao = tipoAlimentacao;
	}

	public double getQuantidadeAlimentacao() {
		return quantidadeAlimentacao;
	}

	public void setQuantidadeAlimentacao(double quantidadeAlimentacao) {
		this.quantidadeAlimentacao = quantidadeAlimentacao;
	}


	@Override
	public void gerarRelatorio() {
		System.out.println("Tipo de alimentação: "  + this.tipoAlimentacao);
		System.out.println("Quantidade consumida por dia: " + this.quantidadeAlimentacao + "Kg");
		
	}

}
