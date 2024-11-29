package vendas;

public class Main {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Pagamento pagamento1 = new Pagamento();
        
        // Configuração de produtos
        produto1.setProduto("Abacaxi");
        produto1.setQtdProdutos(5);
        produto1.setPrecoProduto("250");
        produto1.setLocalizaPedido(new Pedido[] {pedido1});
       
        produto2.setProduto("Laranja");
        produto2.setQtdProdutos(3);
        produto2.setPrecoProduto("150");
        produto2.setLocalizaPedido(new Pedido[] {pedido1, pedido2});
        
        // Configuração do pedido
        pedido1.setPedido("Compras");
        pedido1.setCliente(cliente1);
        pedido1.setProdutos(new Produto[] {produto1, produto2});  // Alterado de setProduto para setProdutos
        pedido1.setValorPedido("400");
        pedido1.setTipoPagamento(pagamento1);
     
        pedido2.setPedido("Varejo");
        pedido2.setCliente(cliente2);
        pedido2.setProdutos(new Produto[] {produto2});  // Alterado de setProduto para setProdutos
        pedido2.setValorPedido("150");
        pedido2.setTipoPagamento(pagamento1);
        
        // Configuração de pagamento
        pagamento1.setNomePedido(pedido1);
        pagamento1.setTpPagamento("Débito");
        
        // Configuração do cliente
        cliente1.setNomeCliente("Juan");
        cliente1.setCpf("007.243.689-90");
        cliente1.setPedidos(new Pedido[] {pedido1});  // Alterado para setPedidos
        
        cliente2.setNomeCliente("Carlos");
        cliente2.setCpf("008.342.975-21");
        cliente2.setPedidos(new Pedido[] {pedido2});
        
        // Impressão dos dados
        cliente1.imprimirCliente();
        System.out.println("--------------------");
        cliente2.imprimirCliente();
        System.out.println("--------------------");
        pedido1.imprimirPedido();
        System.out.println("--------------------");
        pedido2.imprimirPedido();
        System.out.println("--------------------");
        produto1.imprimirProduto();
        System.out.println("--------------------");
        produto2.imprimirProduto();
        System.out.println("--------------------");
        pagamento1.imprimirPagamento();  // Certifique-se de que o método imprimirPagamento() existe
        System.out.println("--------------------");
    }
}