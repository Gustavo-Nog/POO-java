package vendas;

public class Produto {

	private String produto;
	private int qtdProdutos;
	private String precoProduto;;
	private Pedido[] localizaPedido;
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQtdProdutos() {
		return qtdProdutos;
	}
	public void setQtdProdutos(int qtdProdutos) {
		this.qtdProdutos = qtdProdutos;
	}
	public String getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProduto(String precoProduto) {
		this.precoProduto = precoProduto;
	}
	public Pedido[] getLocalizaPedido() {
	  return localizaPedido;
	}
	public void setLocalizaPedido(Pedido[] localizaPedido) {
	  this.localizaPedido = localizaPedido;
	}
	
	public void imprimirProduto() {
    System.out.println("- " + getProduto());
    System.out.println("Quantidade: " + getQtdProdutos());
    System.out.println("Preço: " + getPrecoProduto());
    if (localizaPedido != null) {
        for (Pedido pedido : localizaPedido) {
            System.out.println("Está em quais pedidos: " + pedido.getPedido());
        }
    } else {
        System.out.println("Esse produto não está em nenhum pedido.");
    }
  }
}