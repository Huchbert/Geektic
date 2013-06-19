package geektic.dao;
import java.util.List;

import geektic.model.Geek;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

@Repository
public class GeekDAO implements GeekDAOInterface {
	
	@PersistenceContext
	private EntityManager entitymanager;
	
	public GeekDAO(){
		
	}
	
	public GeekDAO(EntityManager entitymanager){
		this.entitymanager = entitymanager;
	}
	
	@Override
	public Geek getGeekById(long id){
		return entitymanager.find(Geek.class, id);
	}
	
	@Override
	public List<Geek> findAll(){
		String jpql ="select g from Geek as g";
		TypedQuery<Geek> query = entitymanager.createQuery(jpql,Geek.class);
		return query.getResultList();			
	}
}
