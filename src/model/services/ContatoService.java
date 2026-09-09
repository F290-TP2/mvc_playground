package model.services;

import model.Contato;
import model.ContatoDAO;

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
}
