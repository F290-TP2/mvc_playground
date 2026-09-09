package model;

import java.util.List;

public interface ContatoDAO {
    void salvar(Contato contato);
    void excluir(Integer id);
    Contato buscar(Integer id);
    Contato atualizar(Contato contato);
    List<Contato> buscarTodos();
}
