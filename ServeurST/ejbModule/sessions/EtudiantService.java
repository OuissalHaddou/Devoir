package sessions;

import java.util.List;

import dao.IDao;
import entities.Etudiant;
import jakarta.annotation.security.PermitAll;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class EtudiantService implements IDao<Etudiant>{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public boolean create(Etudiant o) {
		em.persist(o);
		return true;
	}
	
	@Override
	public boolean update(Etudiant o) {
		em.merge(o);
		return true;
	}

	@Override
	public boolean delete(Etudiant o) {
		em.remove(o);
		return true;
	}

	@Override
	public Etudiant findById(int id) {
		return em.find(Etudiant.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	@PermitAll
	public List<Etudiant> findAll() {
		jakarta.persistence.Query query = em.createQuery("from Etudiant");
		return query.getResultList();
	}

}
