package sistemasmartphone;

public class TelaNotificacacao {

	public static void main(String[] args) {
		NotificacaoSMS sms = new NotificacaoSMS("Importante", "Aviso de despejo", "(88) 980028922");
		sms.exibirNotificacao();
		sms.emitirSom();
		System.out.println("--------");
		
		
		NotificacaoEmail email = new NotificacaoEmail("Alerta!", "Aviso de evacuação", "ministerio@outlook.com");
		email.exibirNotificacao();
		email.emitirSom();
		System.out.println("--------");
		
		NotificacaoChamada chamada = new NotificacaoChamada("Urgente", "Me ligue de volta.", "(88) 98002-8922");
		chamada.exibirNotificacao();
		chamada.emitirSom();
		System.out.println("--------");
		

	}

}
