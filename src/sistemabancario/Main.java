package sistemabancario;

public class Main {
    public static void main(String[] args) {
        // Criando o banco
        Banco banco = new Banco("Banco XYZ");

        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", "12345678900");
        Cliente cliente2 = new Cliente("Maria Oliveira", "98765432100");

        // Criando contas para o cliente 1 (duas contas)
        ContaCorrente contaCorrenteJoao = new ContaCorrente(1, 1500, cliente1); // Conta Corrente com limite de 1500
        ContaPoupanca contaPoupancaJoao = new ContaPoupanca(2, 0.5, cliente1); // Conta Poupança com saldo de 0 e taxa de 0.5%

        // Criando conta para o cliente 2 (uma conta)
        ContaCorrente contaCorrenteMaria = new ContaCorrente(3, 800, cliente2); // Conta Corrente com limite de 800

        // Adicionando clientes ao banco
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        // Realizando transações para o cliente 1 (João)
        contaCorrenteJoao.depositar(500); // Depósito na Conta Corrente de João
        contaCorrenteJoao.sacar(700);     // Saque na Conta Corrente de João (saldo + limite = 500 + 1500)
        contaCorrenteJoao.sacar(2000);    // Tentativa de saque maior que saldo + limite

        System.out.println("-------------");
        contaPoupancaJoao.depositar(1000); // Depósito na Conta Poupança de João
        contaPoupancaJoao.calcularRendimento(); // Calculando rendimentos da Conta Poupança

        // Realizando transações para o cliente 2 (Maria)
        System.out.println("-------------");
        contaCorrenteMaria.depositar(200); // Depósito na Conta Corrente de Maria
        contaCorrenteMaria.sacar(900);     // Saque na Conta Corrente de Maria (saldo + limite = 200 + 800)

        // Mostrando saldos finais
        System.out.println("-------------");
        System.out.println("\nResumo Final de Clientes e Contas:");
        banco.mostrarClientesESaldos();
    }
}