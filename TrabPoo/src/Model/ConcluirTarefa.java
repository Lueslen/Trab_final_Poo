package Model;

public class ConcluirTarefa {

    private TarefaDAO dao;

    public ConcluirTarefa(){
        dao = new TarefaDAO();
    }

    public void concluir(Tarefa tarefa) throws Exception {
        if(tarefa.getId() < 1){
            throw  new Exception("Id inválido.");
        }
        if(tarefa.isConcluido()){
            throw  new Exception("Tarefa "+tarefa.getId()+" concluída.");
        }
        tarefa.setConcluido(true);
        dao.atualizar(tarefa);
    }

}
