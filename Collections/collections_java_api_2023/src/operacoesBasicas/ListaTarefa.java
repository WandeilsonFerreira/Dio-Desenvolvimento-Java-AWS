package operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	private List<Tarefa> tarefaList;

	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
		// TODO Auto-generated constructor stub		
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover  = new ArrayList<>();
		for(Tarefa t : tarefaList) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("O número total de tarefas é de: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.adicionarTarefa("Teste");
		listaTarefa.adicionarTarefa("TEste2");
		listaTarefa.adicionarTarefa("Teste");
		listaTarefa.adicionarTarefa("TEste2");
		
		System.out.println("O número total de tarefas é de: " + listaTarefa.obterNumeroTotalTarefas());
		
		listaTarefa.removerTarefa("TEste2");
		
		listaTarefa.obterDescricoesTarefas();
		
		System.out.println("O número total de tarefas é de: " + listaTarefa.obterNumeroTotalTarefas());
		
		
	}

}
