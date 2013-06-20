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
			Operations.deleteAllFrom("Geek_Interest","Geek","Interest"),
			// Insertion des données de test
			Operations.insertInto("Geek")
				.columns("id_geek", "Name", "Lastname","Gender")
				.values(1, "Rosset", "Melanie","f")
				.values(2, "Hubert", "Florent","m")
				.values(3, "Landat", "Frederic","m")
				.values(4, "Rabeson", "Luc","m")
				.build(),
			Operations.insertInto("Interest")
				.columns("id_interest","label")
				.values(1,"C++")
				.values(2,"C#")
				.values(3,"Java")
				.build(),
			Operations.insertInto("Geek_Interest")
				.columns("id_geek","id_interest")
				.values(1,2)
				.build()
		);
}
