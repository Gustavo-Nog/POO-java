package heranca;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String dataAdmissao;

    public Funcionario(String nome, String cpf, double salario, String dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
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

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double calcularSalario() {
        return salario;
    }
}