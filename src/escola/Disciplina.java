package escola;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nomeDisciplina;
    private Professor professor;
    private List<Aluno> alunos;

    public Disciplina(String nomeDisciplina) {
      this.nomeDisciplina = nomeDisciplina;
      this.alunos = new ArrayList<>();
    }
    
    public String getNomeDisciplina() {
      return nomeDisciplina;
    }
    public void setNomeDisciplina(String nomeDisciplina) {
      if (nomeDisciplina != null && !nomeDisciplina.trim().isEmpty()) {
        this.nomeDisciplina = nomeDisciplina;
      } else {
        System.out.println("Nome inválido. O nome da disciplina não foi alterado.");
      }
    }

    public Professor getProfessor() {
      return professor;
    }

    public List<Aluno> getAlunos() {
      return alunos;
    }

    public void setProfessor(Professor professor) {
      if (professor != null) {
        this.professor = professor;
      } else {
        System.out.println("Professor inválido. Não foi possível atribuí-lo à disciplina.");
      }
    }

    public void matricularAluno(Aluno aluno) {
      if (aluno != null) {
        this.alunos.add(aluno);
      } else {
        System.out.println("Aluno inválido. Não foi possível adicioná-lo à disciplina.");
      }
    }

    public void imprimirInformacoes() {
      System.out.println("\nInformações das Disciplinas:");
      System.out.println("Disciplina: " + nomeDisciplina);
      System.out.println("Professor(a): " + (professor != null ? professor.getNomeProfessor() : "Nenhum professor atribuído"));
      System.out.println("Alunos matriculados:");
      for (Aluno aluno : alunos) {
        System.out.println("- " + aluno.getNomeAluno());
      }
    }
}