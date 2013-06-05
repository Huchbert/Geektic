package service;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.mockito.Mockito.*;
import org.springframework.beans.factory.annotation.Autowired;

import dao.GeekDAOInterface;
import model.Geek;

public class GeekServiceTest {
	
	@Autowired
	private GeekService geekService;
	
	@Test
	public void DataBaseIsEmpty(){
		GeekDAOInterface geekDAOInterface = mock(GeekDAOInterface.class);
		when(geekDAOInterface.getGeekById(0)).thenReturn(null); 
		Geek geek = geekService.getGeekById(0);
		assertNull(geek);
	}
	
}
