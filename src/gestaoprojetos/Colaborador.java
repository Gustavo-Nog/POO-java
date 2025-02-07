package gestaoprojetos;

import java.util.ArrayList;
import java.util.List;

public class Colaborador {
    private String nomeColaborador;
    private List<Tarefa> tarefas;

    public Colaborador(String nomeColaborador) {
      this.nomeColaborador = nomeColaborador;
      this.tarefas = new ArrayList<>();
    }

    public String getNomeColaborador() {
      return nomeColaborador;
    }

    public void setNomeColaborador(String nomeColaborador) {
      this.nomeColaborador = nomeColaborador;
    }

    public List<Tarefa> getTarefas() {
      return tarefas;
    }

    public void atribuirTarefas(Tarefa... tarefas) {
      for (Tarefa tarefa : tarefas) {
        if (tarefa != null) {
          this.tarefas.add(tarefa);
        }
      }
    }

    public void imprimirInformacoes() {
      System.out.println("\nInformações do Colaborador " + nomeColaborador + ":");
      for (Tarefa tarefa : tarefas) {
        System.out.println("- " + tarefa.getDescricao());
      }
    }
}