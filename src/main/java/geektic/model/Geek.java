package geektic.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Geek {
	
	@Id
	@SequenceGenerator(name="SPECTACLE_ID_GENERATOR", initialValue=1, sequenceName="ID_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SPECTACLE_ID_GENERATOR")
	private long id_geek;
	
	private String name;
	
	private String lastname;
	
	private String gender;
	
	@ManyToMany
	@JoinTable(name = "GEEK_INTEREST",
	joinColumns = @JoinColumn(name = "ID_GEEK"),
	inverseJoinColumns = @JoinColumn(name = "ID_INTEREST"))
	private List<Interest> interests;
	
	public long getId() {
		return id_geek;
	}

	public String getName() {
		return name;
	}

	public String getLastname() {
		return lastname;
	}
	
	public String getGender() {
		return gender;
	}
	
	public List<Interest> getInterests() {
		return interests; 
	}
	
}
