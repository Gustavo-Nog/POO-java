package sistemabancario;

public abstract class Conta implements Transacao {
    private int numero;
    private double saldo;
    private Cliente cliente; // Referência ao cliente

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.saldo = 0;
        this.cliente = cliente; // Associa o cliente diretamente
        cliente.adicionarConta(this); // Adiciona a conta ao cliente
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // Método abstrato para imprimir mensagem de saldo atualizado
    public abstract void imprimirMensagemSaldoAtualizado(String tipoTransacao);

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            imprimirMensagemSaldoAtualizado("Depósito");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            imprimirMensagemSaldoAtualizado("Saque");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }
}