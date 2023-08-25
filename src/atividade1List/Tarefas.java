package atividade1List;

public class Tarefas {

	String tarefa;
	
	

	Tarefas(String tarefas) {
		 this.tarefa = tarefas;
		
	}
	
	protected String getTarefa() {
		return tarefa;
	}

	protected void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}
	
	
	@Override
    public String toString() {
        return getTarefa();
    }
}
	

