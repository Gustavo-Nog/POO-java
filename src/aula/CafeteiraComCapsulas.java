package aula;

public class CafeteiraComCapsulas implements Cafeteira {
		
	private String tipoCapsulaSelecionada;
	private int nivelAgua;
	
	@Override
	public void selecionarCapsula(String tipoCapsula) {
		this.tipoCapsulaSelecionada = tipoCapsula;
		System.out.println("Cápsula " + tipoCapsula + " selecionada.");
	} @Override
	public void preparaCafe() {
		if(this.tipoCapsulaSelecionada != null && this.nivelAgua >= 50) {
			System.out.println("Preparando o café com cápsula: " + this.tipoCapsulaSelecionada);
			this.nivelAgua -= 50;
		} else if (this.nivelAgua < 50) {
			System.out.println("O nível da água está baixo! Adicione mais água.");
		} else {
			System.out.println("por favor, selecione uma cápsula antes.");
		}
	} @Override
	public void servirCafe() {
		if(this.tipoCapsulaSelecionada != null) {
			System.out.println("Café foi servido! Aproveite o seu " + this.tipoCapsulaSelecionada);
		} else {
			System.out.println("Não há mais café!");
		}
	}
	public int getNivelAgua() {
		return nivelAgua;
	}
	public void setNivelAgua(int nivelAgua) {
		if (this.nivelAgua >= 0 && this.nivelAgua <= 1000) {
			this.nivelAgua = nivelAgua;
			System.out.println("Nível ajustado para " + nivelAgua + "ml");
		} else {
			System.out.println("Quantidade inválida, a quantidade permitida é entre 0 e 1000ml.");
		}
	}
}