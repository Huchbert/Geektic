package dao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import model.Geek;

@Repository
public class GeekDAO implements GeekDAOInterface {
	
	@PersistenceContext
	private EntityManager entitymanager;
	
	public GeekDAO(EntityManager entitymanager){
		this.entitymanager = entitymanager;
	}
	
	/* (non-Javadoc)
	 * @see dao.GeekDAOInterface#getGeekById(long)
	 */
	@Override
	public Geek getGeekById(long id){
		return entitymanager.find(Geek.class, id);
	}
}
