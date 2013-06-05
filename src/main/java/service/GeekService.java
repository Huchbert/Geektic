package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.GeekDAOInterface;
import model.Geek;

@Service
@Transactional
public class GeekService {
	
	@Autowired
	private GeekDAOInterface geekDAO;
	
	public Geek getGeekById(long id){
		return geekDAO.getGeekById(id);
	}
	
}
