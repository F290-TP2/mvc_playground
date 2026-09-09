package model.impl;

import model.Contato;
import model.ContatoDAO;

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
