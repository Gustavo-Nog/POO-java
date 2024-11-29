package aula;

public class AulaSete {
	public static void main(String[] args) {
		CafeteiraComCapsulas minhaCafeteira = new CafeteiraComCapsulas();
		
		minhaCafeteira.setNivelAgua(200);
		minhaCafeteira.selecionarCapsula("Espresso");
		minhaCafeteira.preparaCafe();
		minhaCafeteira.preparaCafe();
		minhaCafeteira.servirCafe();
		System.out.println("O nível da água restante é de " + minhaCafeteira.getNivelAgua() + "ml.");
	}
}
