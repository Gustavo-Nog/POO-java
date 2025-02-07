package sistemabancario;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(int numero, double taxaJuros, Cliente cliente) {
        super(numero, cliente);
        this.taxaJuros = taxaJuros;
    }
    
    public double getTaxaJuros() {
        return taxaJuros;
    }
    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void calcularRendimento() {
        double rendimento = getSaldo() * (taxaJuros / 100);
        depositar(rendimento); // Deposita o rendimento na conta
        System.out.println("Rendimento aplicado! Saldo atualizado: " + getSaldo());
    }

    @Override
    public void imprimirMensagemSaldoAtualizado(String tipoTransacao) {
        System.out.println("Cliente: " + getCliente().getNome() + 
                           " | " + tipoTransacao + " na Conta Poupança | Saldo atualizado: " + getSaldo());
    }
}