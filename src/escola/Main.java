package escola;

public class Main {

	public static void main(String[] args) {
		Escola escola = new Escola("Instituto Federal");

	      Professor professor1 = new Professor("Prof. José");
	      Professor professor2 = new Professor("Prof. Maria");

	      Aluno aluno1 = new Aluno("Gustavo");
	      Aluno aluno2 = new Aluno("Joel");

	      Disciplina disciplina1 = new Disciplina("POO");
	      Disciplina disciplina2 = new Disciplina("Cálculo");
	      Disciplina disciplina3 = new Disciplina("Lógica");

	      professor1.atribuirDisciplinas(disciplina1, disciplina3);
	      professor2.atribuirDisciplinas(disciplina2);

	      aluno1.matricularDisciplina(disciplina1);
	      aluno2.matricularDisciplina(disciplina1);
	      aluno2.matricularDisciplina(disciplina2); 

	      aluno1.matricularDisciplina(null);

	      escola.adicionarProfessor(professor1);
	      escola.adicionarProfessor(professor2);
	      escola.adicionarAluno(aluno1);
	      escola.adicionarAluno(aluno2);

	      escola.adicionarProfessor(null); // Não deve adicionar
	      escola.adicionarAluno(null); // Não deve adicionar

	      // Imprimindo informações da escola, professores, alunos e disciplinas
	      System.out.println("-------------");
	      escola.imprimirInformacoes();
	      System.out.println("-------------");
	      professor1.imprimirInformacoes();
	      professor2.imprimirInformacoes();
	      System.out.println("-------------");
	      aluno1.imprimirInformacoes();
	      aluno2.imprimirInformacoes();
	      System.out.println("-------------");
	      disciplina1.imprimirInformacoes();
	      disciplina2.imprimirInformacoes();

	}

}
