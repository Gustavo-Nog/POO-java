package vendas;

public class Pagamento {
	private String tpPagamento;
	private Pedido nomePedido;
	
	public String getTpPagamento() {
		return tpPagamento;
	}
	public void setTpPagamento(String tpPagamento) {
		this.tpPagamento = tpPagamento;
	}
	public Pedido getNomePedido() {
		return nomePedido;
	}
	public void setNomePedido(Pedido nomePedido) {
		this.nomePedido = nomePedido;
	}
	
	public void imprimirPagamento() {
		System.out.println("Nome do pedido: " + this.nomePedido.getPedido());	
		System.out.println("Tipo de pagamento: " + getTpPagamento());
	}
}