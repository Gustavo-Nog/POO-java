package gestaoanimais;

import java.util.*;

public class RelatorioExtincao implements Monitorar {
	
	private List<String> listaEspecie;
	private String dataRelatorio;

	public RelatorioExtincao(String dataRelatorio) {
		this.listaEspecie = new ArrayList<>();
		this.dataRelatorio = dataRelatorio;
	}
	
	public void adicionarEspecie(String nomeEspecie) {
		listaEspecie.add(nomeEspecie);
	}

	public String getDataRelatorio() {
		return dataRelatorio;
	}
	public void setDataRelatorio(String dataRelatorio) {
		this.dataRelatorio = dataRelatorio;
	}
	
	@Override
	public void gerarRelatorio() {
		System.out.println("Data do relatório: " + this.dataRelatorio + ".");
		System.out.println("Especie em extinção monitorada:");
		for (String especie : listaEspecie) {
			System.out.println("- " + especie);
		}
	}

}
