package br.com.alura.loja.dao;

import javax.persistence.EntityManager;

import br.com.alura.loja.modelo.Categoria;

public class CategoriaDao {
	
	private final EntityManager manager;

	public CategoriaDao(EntityManager em) {
		this.manager = em;
	}
	
	public void cadastrar(Categoria categoria) {
		this.manager.persist(categoria);
	}
	
	public void atualizar(Categoria categoria) {
		this.manager.merge(categoria);
	}
	
	public void remover(Categoria categoria) {
		categoria = manager.merge(categoria);
		this.manager.remove(categoria);
	}

}
