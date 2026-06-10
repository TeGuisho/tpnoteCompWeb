package personne;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;


public class Personne {
	private LocalDate DateNaissance;
	private String Nom;
	private boolean EstAdulte;
	
	public Personne(LocalDate DateNaissance, String Nom) {
		this.Nom = Nom;
		this.DateNaissance = DateNaissance;
		if (this.calculateAge(DateNaissance,LocalDate.now()) > 18) {
			this.EstAdulte = true;
		}else {
			this.EstAdulte = false;
		}
	}
	
	private int calculateAge(LocalDate dateNaissance2, LocalDate localDateTime) {
        Period period = Period.between(dateNaissance2, localDateTime);
          return period.getYears();
    }
	
	public int getAge() {
		return this.calculateAge(DateNaissance,LocalDate.now());
	}
	
	public String getNom() {
		return Nom;
	}
	
	

}
