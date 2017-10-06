package br.com.db1.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.db1.model.Uf;

public class UfDao {

	@Inject
	private EntityManager manager;
	
	public List<Uf> listar() {
		Query query = manager.createQuery("Select u from Uf u");
		return query.getResultList();
	}
	
	public void inserir(Uf uf) {
		manager.getTransaction().begin();
		manager.persist(uf);
		manager.getTransaction().commit();
	}
}
