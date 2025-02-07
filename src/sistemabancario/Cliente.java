package sistemabancario;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Conta> contas; // Lista de contas do cliente

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Adiciona uma conta à lista de contas do cliente
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    // Retorna todas as contas do cliente
    public ArrayList<Conta> getContas() {
        return contas;
    }
}