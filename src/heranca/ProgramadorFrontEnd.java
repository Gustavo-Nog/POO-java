package heranca;

public class ProgramadorFrontEnd extends Programador {
	private String linguagemPreferida;
	private String[] frameworks;
	
	public ProgramadorFrontEnd(String nome, String cpf, double salario, String dataAdmissao, String linguagemPrincipal,
			int projetosEmAndamento, String linguagemPreferida, String[] frameworks) {
		super(nome, cpf, salario, dataAdmissao, linguagemPrincipal, projetosEmAndamento);
		this.linguagemPreferida = linguagemPreferida;
		this.frameworks = frameworks;
	}

	public String getLinguagemPreferida() {
		return linguagemPreferida;
	}
	public void setLinguagemPreferida(String linguagemPreferida) {
		this.linguagemPreferida = linguagemPreferida;
	}

	public String[] getFrameworks() {
		return frameworks;
	}
	public void setFrameworks(String[] frameworks) {
		this.frameworks = frameworks;
	}
	
	public void escreverCodigo() {
		System.out.println("Escrevendo código na linguagem " + getLinguagemPreferida());
	}
	
	public void criarUserInterface() {
		System.out.println(super.getNome() + " está usando o framework " + getFrameworks());
	}

}
