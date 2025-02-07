package heranca;

public class Heranca {

	public static void main(String[] args) {
		Gerente gerente = new Gerente ("Abel", "007.212.562-91", 4000.0, "12/12/2001", "TI", 1000.0);
		System.out.println("Gerente: " + gerente.getNome());
		System.out.println("Salário com bônus: " + gerente.calcularBonus());
		gerente.gerenciarEquipe();
		System.out.println("----------");
		
		Programador programador = new Programador ("Seth", "123.456.789-01", 3500.0, "01/02/2005", "Java", 2);
		System.out.println("");
		System.out.println("Programador: " + programador.getNome());
		programador.escreverCodigo();
		programador.revisarCodigo();
		
		System.out.println("----------");
		
		Assistente assistente = new Assistente ("Caim", "987.654.320-19", 1420.0, "25/03/2019", "Almoxarifado", 48);
		System.out.println("Assistente: " + assistente.getNome());
		System.out.println("Salário do Assistente: " + assistente.calcularSalario());
		assistente.atenderChamada();
		
		System.out.println("----------");
		String[] frameworks = {"React", "Angular"};
		ProgramadorFrontEnd frontend = new ProgramadorFrontEnd ("Abraão", "750.381.243-01", 5500.0, "24/04/2015", "Java", 1, "Ruby", frameworks);
		frontend.escreverCodigo();
		frontend.criarUserInterface();
		
	}
}