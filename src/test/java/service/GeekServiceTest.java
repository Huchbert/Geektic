package service;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import geektic.dao.GeekDAOInterface;
import geektic.model.Geek;
import geektic.service.GeekService;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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
