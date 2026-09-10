package model.services;

import model.domain.Contato;
import model.daos.ContatoDAO;

public class ContatoService {
    private final ContatoDAO dao;

    public ContatoService(ContatoDAO dao) {
        this.dao = dao;
    }

    public void salvar(Contato contato) {
        if (contato.getId() != null) {
            throw new IllegalArgumentException("O ID do contato deve ser maior que zero.");
        }
        dao.salvar(contato);
    }

    //TODO: Implementar os metodos de validação para os métodos de excluir, buscar, atualizar e buscarTodos

    //TODO: Implementar os métodos de excluir, buscar, atualizar e buscarTodos com validações necessárias

}
