package escola;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String nome;
    private List<Professor> professores;
    private List<Aluno> alunos;

    public Escola(String nome) {
      this.nome = nome;
      this.professores = new ArrayList<>();
      this.alunos = new ArrayList<>();
    }
    
    public String getNome() {
      return nome;
    }
    public void setNome(String nome) {
      if (nome != null && !nome.isEmpty()) {
        this.nome = nome;
      } else {
        System.out.println("Nome inválido. O nome da escola não foi alterado.");
      }
    }
    
    public List<Professor> getProfessores() {
      return professores;
    }
    public List<Aluno> getAlunos() {
      return alunos;
    }

    public void adicionarProfessor(Professor professor) {
      if (professor != null) {
        this.professores.add(professor);
      } else {
        System.out.println("Professor inválido. Não foi possível adicioná-lo à escola.");
      }
    }
    

    public void adicionarAluno(Aluno aluno) {
      if (aluno != null) {
        this.alunos.add(aluno);
      } else {
        System.out.println("Aluno inválido. Não foi possível adicioná-lo à escola.");
      }
    }
    
    public void imprimirInformacoes() {
      System.out.println("Escola: " + nome);
      System.out.println("Professores:");
      for (Professor professor : professores) {
          System.out.println("- " + professor.getNomeProfessor());
      }
      System.out.println("Alunos:");
      for (Aluno aluno : alunos) {
          System.out.println("- " + aluno.getNomeAluno());
      }
    }
}