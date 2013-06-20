package dao;

import static org.junit.Assert.assertEquals;
import geektic.dao.GeekDAO;
import geektic.model.Geek;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ninja_squad.dbsetup.DbSetup;


public class GeekDaoTest {

		private static EntityManagerFactory emFactory;
		private EntityManager em;
		private GeekDAO dao;
		
		@BeforeClass
		public static void setUpBeforeClass() throws Exception {
			emFactory = Persistence.createEntityManagerFactory("Geektic");
		}

		@AfterClass
		public static void tearDownAfterClass() throws Exception {
			emFactory.close();
		}

		@Before
		public void setUp() throws Exception {
			em = emFactory.createEntityManager();
			dao = new GeekDAO(em);
			loadTestData();
			em.getTransaction().begin();
		}
		
		private void loadTestData() {
			DbSetup dbSetup = new DbSetup(TestData.TEST_DESTINATION, 
					                      TestData.STANDARD_OPERATION);
			dbSetup.launch();
		}
		
		@After
		public void tearDown() throws Exception {
			em.getTransaction().commit();
			em.close();
		}
		
		@Test
		public void TestGeekDAOfindById() {
			Geek geek = this.dao.getGeekById(1);
			assertEquals("Rosset",geek.getName());
			assertEquals("Melanie",geek.getLastname());
			assertEquals("f",geek.getGender());
		}
		
		@Test
		public void GeekHasOneInterest() {
			Geek geek = this.dao.getGeekById(1);
			assertEquals("C#",geek.getInterests().get(0).getLabel());
		}
}
