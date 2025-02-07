package heranca;

public class Assistente extends Funcionario {
	private String setor;
	private int chSemanal;
	
	public Assistente(String nome, String cpf, double salario, String dataAdmissao, String setor, int chSemanal) {
		super(nome, cpf, salario, dataAdmissao);
		this.setor = setor;
		this.chSemanal = chSemanal;
	}
	
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public int getChSemanal() {
		return chSemanal;
	}
	public void setChSemanal(int chSemanal) {
		this.chSemanal = chSemanal;
	}
	
	@Override
	public double calcularSalario() {
		return (getSalario() * this.chSemanal)/40;
	}

	public void atenderChamada() {
		System.out.println("Atendendo chamadas do setor: " + this.setor + ".");
		
	}
}