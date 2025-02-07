package heranca;

public class Gerente extends Funcionario {
    private String departamento;
    private double bonus;

    public Gerente(String nome, String cpf, double salario, String dataAdmissao, String departamento, double bonus) {
        super(nome, cpf, salario, dataAdmissao);
        this.departamento = departamento;
        this.bonus = bonus;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calcularBonus() {
        return getSalario() + bonus;
    }

    public void gerenciarEquipe() {
        System.out.println("Gerenciando a equipe do departamento: " + departamento);
    }
}