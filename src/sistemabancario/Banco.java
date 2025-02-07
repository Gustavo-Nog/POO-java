package sistemabancario;

import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }
    
    public String getNome() {
      return nome;
    }
    public void setNome(String nome) {
      this.nome = nome;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void mostrarClientesESaldos() {
        for (Cliente cliente : clientes) {
            System.out.println("Cliente: " + cliente.getNome());
            // Mostrando as contas e os saldos de cada cliente
            for (Conta conta : cliente.getContas()) {
                System.out.println("  Conta " + conta.getNumero() + " | Saldo: " + conta.getSaldo());
            }
        }
    }
}