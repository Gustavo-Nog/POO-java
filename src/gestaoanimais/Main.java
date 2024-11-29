package gestaoanimais;

public class Main {

	public static void main(String[] args) {
		Especie especie1 = new Especie("Panthera", 2000, "Vunerável");
		Especie especie2 = new Especie("Leão", 1000, "Perigo");
		Especie especie3 = new Especie("Coala", 100, "Perigo");
		
		especie1.gerarRelatorio();
		System.out.println();
		especie2.gerarRelatorio();
		System.out.println();
		especie3.gerarRelatorio();

		System.out.println("=======================\n");
		
		RelatorioExtincao relatorio = new RelatorioExtincao("19/11/2024");
		relatorio.adicionarEspecie("Panthera");
		relatorio.adicionarEspecie("Leão");
		relatorio.adicionarEspecie("Coala");
		
		relatorio.gerarRelatorio();
		
		System.out.println("=======================\n");
		
		Habitat habitat1 = new Habitat("Savana", 2000.0, 5000);
		Habitat habitat2 = new Habitat("Savana Africana", 2500.1, 800);
		Habitat habitat3 = new Habitat("Mata Atlântica", 5000.0, 75);
		
		habitat1.gerarRelatorio();
		System.out.println();
		habitat2.gerarRelatorio();
		
		System.out.println("=======================\n");
		
		Alimentacao alimentacao1 = new Alimentacao("Carnívoro", 5);
		Alimentacao alimentacao2 = new Alimentacao("Carnívoro", 7);
		Alimentacao alimentacao3 = new Alimentacao("Herbívoro", 2);
		
		alimentacao1.gerarRelatorio();
		System.out.println();
		alimentacao2.gerarRelatorio();
		System.out.println();
		alimentacao3.gerarRelatorio();
	}

}
