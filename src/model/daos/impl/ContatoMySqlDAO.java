package model.daos.impl;

import model.domain.Contato;
import model.daos.ContatoDAO;

import java.util.List;

public class ContatoMySqlDAO implements ContatoDAO {
    @Override
    public void salvar(Contato contato) {
        System.out.println("Salvando contato no MySQL: " + contato);
    }

    @Override
    public void excluir(Integer id) {

    }

    @Override
    public Contato buscar(Integer id) {
        return null;
    }

    @Override
    public Contato atualizar(Contato contato) {
        return null;
    }

    @Override
    public List<Contato> buscarTodos() {
        return List.of();
    }
}
