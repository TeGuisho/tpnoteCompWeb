package personne;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Personne {
	private Date DateNaissance;
	private String Nom;
	private boolean EstAdulte;
	
	public Personne(Date DateNaissance, String Nom) {
		this.Nom = Nom;
		this.DateNaissance = DateNaissance;
		if (this.calculateAge(DateNaissance,LocalDateTime.now()) > 18) {
			this.EstAdulte = true;
		}else {
			this.EstAdulte = false;
		}
	}
	
	private int calculateAge(Date dateNaissance2, LocalDateTime localDateTime) {
        Period period = Period.between(dateNaissance2, localDateTime);
          return period.getYears();
    }
	
	public int getAge() {
		return this.calculateAge(DateNaissance,LocalDateTime.now()
	}
	
	public String getNom() {
		return Nom;
	}
	

}
