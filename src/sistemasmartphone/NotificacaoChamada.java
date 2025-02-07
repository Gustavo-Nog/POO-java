package sistemasmartphone;

public class NotificacaoChamada extends Notificacao{
	private String numeroChamada;

	public NotificacaoChamada(String titulo, String mensagem, String numeroChamada) {
		super(titulo, mensagem);
		this.numeroChamada = numeroChamada;
	}

	public String getNumeroChamada() {
		return numeroChamada;
	}
	public void setNumeroChamada(String numeroChamada) {
		this.numeroChamada = numeroChamada;
	}

	@Override
	public void exibirNotificacao() {
		System.out.println("Chamada perdida de " + getNumeroChamada() + "\nTitulo: " + this.titulo + "\nAssunto: " + this.mensagem);	
	}

	@Override
	public void emitirSom() {
		System.out.println("Som típico de chamada perdida...");
	}
}
