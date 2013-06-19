package dao;

import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.destination.Destination;
import com.ninja_squad.dbsetup.destination.DriverManagerDestination;
import com.ninja_squad.dbsetup.operation.Operation;

public class TestData {
	public static final Destination TEST_DESTINATION = 
			new DriverManagerDestination("jdbc:hsqldb:hsql://localhost/Geektic", "sa", "");
	
	public static final Operation STANDARD_OPERATION = 
		Operations.sequenceOf(
			//Supression des données antérieures
			Operations.deleteAllFrom("Geek"),
			// Insertion des données
			Operations.insertInto("Geek")
				.columns("id", "Name", "Lastname")
				.values(1, "Rosset", "Melanie")
				.values(2, "Hubert", "Florent")
				.values(3, "Landat", "Frederic")
				.values(4, "Rabeson", "Luc")
				.build()
		);
}
