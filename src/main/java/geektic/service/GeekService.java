package geektic.service;

import geektic.dao.GeekDAO;
import geektic.model.Geek;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class GeekService {
	
	@Autowired
	private GeekDAO geekDAO;
	
	public Geek getGeekById(long id){
		return geekDAO.getGeekById(id);
	}
	
	public List<Geek> findAll(){
		return geekDAO.findAll();
	}
	
}
