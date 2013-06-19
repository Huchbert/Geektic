package geektic.dao;

import java.util.List;

import geektic.model.Geek;

public interface GeekDAOInterface {

	public abstract Geek getGeekById(long id);
	
	public abstract List<Geek> findAll();
}