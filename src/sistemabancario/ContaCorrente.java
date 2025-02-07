package sistemabancario;

public class ContaCorrente extends Conta {
    private double limite; // Limite especial para saques

    public ContaCorrente(int numero, double limite, Cliente cliente) {
        super(numero, cliente); // Passa o cliente para o construtor da superclasse
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void imprimirMensagemSaldoAtualizado(String tipoTransacao) {
        System.out.println("Cliente: " + getCliente().getNome() + 
                           " | " + tipoTransacao + " na Conta Corrente | Saldo atualizado: " + getSaldo());
    }

    @Override
    public void sacar(double valor) {
        // Verifica se o valor solicitado para saque é válido
        if (valor > 0 && valor <= getSaldo() + limite) {
            setSaldo(getSaldo() - valor); // Atualiza o saldo da conta
            imprimirMensagemSaldoAtualizado("Saque");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido! Limite disponível: " + limite);
        }
    }
}