package escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nomeAluno;
    private List<Disciplina> disciplinas;

    public Aluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
        this.disciplinas = new ArrayList<>();
    }

    public void matricularDisciplina(Disciplina disciplina) {
      
      if (disciplina != null) {
        this.disciplinas.add(disciplina);
        disciplina.matricularAluno(this);
      } else {
        System.out.println("Disciplina inválida. Matrícula não realizada.");
      }
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
      if (nomeAluno != null && !nomeAluno.isEmpty()) {
        this.nomeAluno = nomeAluno;
      } else {
        System.out.println("Nome inválido. O nome do aluno não foi alterado.");
      }
    }

    public List<Disciplina> getDisciplinas() {
      return disciplinas;
    }

    public void imprimirInformacoes() {
      System.out.println("\nInformações do Aluno(a):");
      System.out.println("Aluno(a): " + nomeAluno);
      System.out.println("Disciplinas:");
      for (Disciplina disciplina : disciplinas) {
        System.out.println("- " + disciplina.getNomeDisciplina());
      }
    }
}