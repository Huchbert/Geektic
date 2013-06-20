package geektic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Interest {
	
	@Id
	@SequenceGenerator(name="SPECTACLE_ID_GENERATOR", initialValue=1, sequenceName="ID_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SPECTACLE_ID_GENERATOR")
	private long id_interest;
	
	private String label;
	
	public long getId() {
		return id_interest;
	}
	
	public String getLabel() {
		return label;
	}
}
