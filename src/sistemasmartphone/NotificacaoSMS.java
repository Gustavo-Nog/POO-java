package sistemasmartphone;

public class NotificacaoSMS extends Notificacao{
	private String numeroRemetente;

	public NotificacaoSMS(String titulo, String mensagem, String numeroRemetente) {
		super(titulo, mensagem);
		this.numeroRemetente = numeroRemetente;
	}

	public String getNumeroRemetente() {
		return numeroRemetente;
	}
	public void setNumeroRemetente(String numeroRemetente) {
		this.numeroRemetente = numeroRemetente;
	}

	@Override
	public void exibirNotificacao() {
		System.out.println("Mensagem de " + getNumeroRemetente() + "\nTitulo: " + this.titulo + "\nAssunto: " + this.mensagem);
	}
	@Override
	public void emitirSom() {
		System.out.println("Som típico de SMS...");
	}
}
