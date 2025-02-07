package sistemasmartphone;

public abstract class Notificacao {
	protected String titulo;
	protected String mensagem;
	
	public Notificacao(String titulo, String mensagem) {
		this.titulo = titulo;
		this.mensagem = mensagem;
	}
	
	public abstract void exibirNotificacao();
	public abstract	void emitirSom();
}
