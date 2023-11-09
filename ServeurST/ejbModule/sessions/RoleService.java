package sessions;

import java.util.List;

import dao.IDao;
import entities.Role;
import jakarta.annotation.security.PermitAll;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class RoleService implements IDao<Role>{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public boolean create(Role o) {
		em.persist(o);
		return true;
	}

	@Override
	public boolean update(Role o) {
		em.merge(o);
		return true;
	}

	@Override
	public boolean delete(Role o) {
		em.remove(o);
		return true;
	}

	@Override
	public Role findById(int id) {
		return em.find(Role.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	@PermitAll
	public List<Role> findAll() {
		jakarta.persistence.Query query = em.createQuery("from Role");
		return query.getResultList();
	}

}
