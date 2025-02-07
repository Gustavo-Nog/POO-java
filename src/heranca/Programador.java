package heranca;

public class Programador extends Funcionario {
    private String linguagemPrincipal;
    private int projetosEmAndamento;

    public Programador(String nome, String cpf, double salario, String dataAdmissao, String linguagemPrincipal, int projetosEmAndamento) {
        super(nome, cpf, salario, dataAdmissao);
        this.linguagemPrincipal = linguagemPrincipal;
        this.projetosEmAndamento = projetosEmAndamento;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }
    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public int getProjetosEmAndamento() {
        return projetosEmAndamento;
    }
    public void setProjetosEmAndamento(int projetosEmAndamento) {
        this.projetosEmAndamento = projetosEmAndamento;
    }

    public void escreverCodigo() {
        System.out.println("Escrevendo código em: " + linguagemPrincipal);
    }
    public void revisarCodigo() {
        System.out.println("Revisando código de " + projetosEmAndamento + " projeto(s)");
    }
}