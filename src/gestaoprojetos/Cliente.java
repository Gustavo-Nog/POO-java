package gestaoprojetos;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
  private String nomeCliente;
  private List<Projeto> projetos;

  public Cliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
    this.projetos = new ArrayList<>();
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public List<Projeto> getProjetos() {
    return projetos;
  }

  public void adicionarProjeto(Projeto projeto) {
    if (projeto != null) {
      this.projetos.add(projeto);
    }
  }

  public void listarProjetos() {
    System.out.println("Projetos do Cliente " + nomeCliente + ":");
    for (Projeto projeto : projetos) {
      System.out.println("- " + projeto.getNomeProjeto());
    }
  }
}