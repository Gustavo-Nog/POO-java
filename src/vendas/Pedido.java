package vendas;

public class Pedido {
    private String pedido;
    private String valorPedido;
    private Produto[] produtos;
    private Pagamento tipoPagamento;
    private Cliente cliente;

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public String getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(String valorPedido) {
        this.valorPedido = valorPedido;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public Pagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(Pagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void imprimirPedido() {
    System.out.println("Pedido: " + getPedido());
    // Verifica se a lista de produtos não está vazia
    if (produtos != null) {
        System.out.println("Produtos:");
        for (Produto produto : produtos) {
            System.out.println("- " + produto.getProduto());  // Imprime apenas o nome do produto
        }
    } else {
        System.out.println("Nenhum produto encontrado.");
    }
    System.out.println("Valor do Pedido: " + getValorPedido());
    if (cliente != null) {
        System.out.println("Cliente: " + cliente.getNomeCliente());
    }
    if (tipoPagamento != null) {
        System.out.println("Tipo de Pagamento: " + tipoPagamento.getTpPagamento());
    } else {
      System.out.println("Só existe uma forma de pagamento.");
    }
  }  
}