import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaParaTarefas {
    List<Tarefa> tarefaList;

    public ListaParaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefaParaRemover = new ArrayList<>();
        for(Tarefa noIndex : tarefaList) {
            if(noIndex.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(noIndex);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }
    public int obterNumeroTotalDeTarefas() {
        return tarefaList.size();
    }
}
