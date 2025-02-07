package gestaoprojetos;

public class Main {
	public static void main(String[] args) {
	 Cliente cliente = new Cliente("Brasil");

	 Projeto projeto1 = new Projeto("Desenvolvimento de Software", cliente);

	 cliente.adicionarProjeto(projeto1);
	 cliente.adicionarProjeto(projeto1);

	 Tarefa tarefa1 = new Tarefa("Analisar requisitos", "01/11/2024", projeto1);
	 Tarefa tarefa2 = new Tarefa("Desenvolver Frontend", "01/12/2024", projeto1);
	 Tarefa tarefa3 = new Tarefa("Depuração", " 25/12/2024", projeto1);

	 projeto1.adicionarTarefa(tarefa1, tarefa2, tarefa3);


	 Colaborador colaborador1 = new Colaborador("João");
	 Colaborador colaborador2 = new Colaborador("Maria");

	 tarefa1.atribuirColaboradores(colaborador1);
	 tarefa2.atribuirColaboradores(colaborador2);
	 tarefa3.atribuirColaboradores(colaborador2);

	 cliente.listarProjetos();
	 projeto1.listarTarefas();
	 tarefa1.listarColaboradores();
	 tarefa2.listarColaboradores();
	 tarefa3.listarColaboradores();
	 }
}
