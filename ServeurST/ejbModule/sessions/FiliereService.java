package sessions;

import java.util.List;

import dao.IDao;
import entities.Filiere;
import jakarta.annotation.security.PermitAll;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class FiliereService implements IDao<Filiere>{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public boolean create(Filiere o) {
		em.persist(o);
		return true;
	}

	@Override
	public boolean update(Filiere o) {
		em.merge(o);
		return true;
	}

	@Override
	public boolean delete(Filiere o) {
		em.remove(o);
		return true;
	}

	@Override
	public Filiere findById(int id) {
		return em.find(Filiere.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	@PermitAll
	public List<Filiere> findAll() {
		jakarta.persistence.Query query = em.createQuery("from Filiere");
		return query.getResultList();
	}

}
