package model.impl;

import model.Contato;
import model.ContatoDAO;

import java.util.List;

public class ContatoMemoriaDAO implements ContatoDAO {

    //TODO: Implementar a lógica para armazenar os contatos em memória (por exemplo, usando uma lista ou mapa)

    @Override
    public void salvar(Contato contato) {
        //TODO: Implementar a lógica para salvar o contato em memória
    }

    @Override
    public void excluir(Integer id) {
        //TODO: Implementar a lógica para excluir o contato em memória
    }

    @Override
    public Contato buscar(Integer id) {
        //TODO: Implementar a lógica para buscar o contato em memória
        return null;
    }

    @Override
    public Contato atualizar(Contato contato) {
        //TODO: Implementar a lógica para atualizar o contato em memória
        return null;
    }

    @Override
    public List<Contato> buscarTodos() {
        //TODO: Implementar a lógica para buscar todos os contatos em memória
        return List.of();
    }
}
