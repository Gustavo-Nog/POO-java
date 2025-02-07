package gestaoprojetos;

import java.util.ArrayList;
import java.util.List;

public class Tarefa {
    private String descricao;
    private String prazo;
    private Projeto projeto;
    private List<Colaborador> colaboradores;

    public Tarefa(String descricao, String prazo, Projeto projeto) {
      this.descricao = descricao;
      this.prazo = prazo;
      this.projeto = projeto;
      this.colaboradores = new ArrayList<>();
    }

    public String getDescricao() {
      return descricao;
    }

    public void setDescricao(String descricao) {
      this.descricao = descricao;
    }

    public String getPrazo() {
      return prazo;
    }

    public void setPrazo(String prazo) {
      this.prazo = prazo;
    }

    public Projeto getProjeto() {
      return projeto;
    }

    public List<Colaborador> getColaboradores() {
      return colaboradores;
    }

    public void atribuirColaboradores(Colaborador... colaboradores) {
        for (Colaborador colaborador : colaboradores) {
          if (colaborador != null) {
            this.colaboradores.add(colaborador);
          }
        }
      }

    public void listarColaboradores() {
      System.out.println("\nColaboradores da Tarefa " + descricao + ":");
      for (Colaborador colaborador : colaboradores) {
        System.out.println("- " + colaborador.getNomeColaborador());
      }
    }
}