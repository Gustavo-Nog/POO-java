package gestaoprojetos;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
  private String nomeProjeto;
  private Cliente cliente;
  private List<Tarefa> tarefas;

  public Projeto(String nomeProjeto, Cliente cliente) {
    this.nomeProjeto = nomeProjeto;
    this.cliente = cliente;
    this.tarefas = new ArrayList<>();
  }

  public String getNomeProjeto() {
      return nomeProjeto;
    }

  public void setNomeProjeto(String nomeProjeto) {
      this.nomeProjeto = nomeProjeto;
  }

  public Cliente getCliente() {
      return cliente;
  }

  public List<Tarefa> getTarefas() {
    return tarefas;
  }

    // Modificado para aceitar várias tarefas ao mesmo tempo
  public void adicionarTarefa(Tarefa... tarefas) {
    for (Tarefa tarefa : tarefas) {
      if (tarefa != null) {
        this.tarefas.add(tarefa);
      } else {
        System.out.println("Tarefa inválida. Não foi possível adicioná-la ao projeto.");
      }
    }
  }

  public void listarTarefas() {
    System.out.println("\nTarefas do Projeto " + nomeProjeto + ":");
    for (Tarefa tarefa : tarefas) {
      System.out.println("- " + tarefa.getDescricao());
    }
  }
}