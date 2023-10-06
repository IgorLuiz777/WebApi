package br.com.fiap.bo;

import java.util.List;

import br.com.fiap.dao.ContatoDao;
import br.com.fiap.entity.Contato;

public class ContatoBO {
	
	private ContatoDao dao;
	
	public List<Contato> buscarContatos() {
		dao = new ContatoDao();
		return dao.buscarTodosContatos();
	}
	
	public Contato buscarPorId(int id) {
		dao = new ContatoDao();
		return dao.buscarPorId(id);
	}
	
	public void inserir(Contato contato) {
		dao = new ContatoDao();
		dao.inserir(contato);
	}
	
	public void alterar(Contato contato) {
		dao = new ContatoDao();
		dao.alterar(contato);
	}
	
	public void excluir(int id) {
		dao = new ContatoDao();
		dao.remover(id);
	}

}
