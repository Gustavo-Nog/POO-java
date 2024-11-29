package vendas;

public class Cliente {

	private String nomeCliente;
	private String cpf;
	private Pedido[] pedidos;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Pedido[] getPedidos() {
		return pedidos;
	}
	public void setPedidos(Pedido[] pedidos) {
		this.pedidos = pedidos;
	}

	public void imprimirCliente() {
    System.out.println("Cliente: " + getNomeCliente());
    System.out.println("CPF: " + getCpf());
    
    if (this.pedidos != null) {
        System.out.println("Pedidos:");
        for (Pedido pedido : pedidos) {
            System.out.println("- " + pedido.getPedido());  
        }
    } else {
        System.out.println("Nenhum pedido solicitado.");
    }
  }
}