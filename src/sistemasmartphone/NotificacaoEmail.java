package sistemasmartphone;

public class NotificacaoEmail extends Notificacao{
	private String remetenteEmail;

	public NotificacaoEmail(String titulo, String mensagem, String remetenteEmail) {
		super(titulo, mensagem);
		this.remetenteEmail = remetenteEmail;
	}
	
	public String getRemetenteEmail() {
		return remetenteEmail;
	}
	public void setRemetenteEmail(String remetenteEmail) {
		this.remetenteEmail = remetenteEmail;
	}

	@Override
	public void exibirNotificacao() {
		System.out.println("E-mail de " + getRemetenteEmail() + "\nTitulo: " + this.titulo + "\n Assunto: " + this.mensagem);
	}

	@Override
	public void emitirSom() {
		System.out.println("Som típico de E-mail...");

	}
}
