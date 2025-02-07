package escola;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nomeProfessor;
    private List<Disciplina> disciplinas;

    public Professor(String nomeProfessor) {
      this.nomeProfessor = nomeProfessor;
      this.disciplinas = new ArrayList<>();
    }
    
    public String getNomeProfessor() {
      return nomeProfessor;
    }
    public void setNomeProfessor(String nomeProfessor) {
      if (nomeProfessor != null && !nomeProfessor.trim().isEmpty()) {
        this.nomeProfessor = nomeProfessor;
      } else {
        System.out.println("Nome inválido. O nome do professor não foi alterado.");
      }
    }
    
    public List<Disciplina> getDisciplinas() {
      return disciplinas;
    }

    public void atribuirDisciplinas(Disciplina... disciplinas) {
    for (Disciplina disciplina : disciplinas) {
      if (disciplina != null) {
        this.disciplinas.add(disciplina);
        disciplina.setProfessor(this);
      } else {
        System.out.println("Disciplina inválida. Atribuição não realizada.");
      }
    }
}

    public void imprimirInformacoes() {
      System.out.println("\nInformações do Professor(a):");
      System.out.println("Professor(a): " + nomeProfessor);
      System.out.println("Disciplinas ministradas:");
      for (Disciplina disciplina : disciplinas) {
        System.out.println("- " + disciplina.getNomeDisciplina());
      }
    }
}