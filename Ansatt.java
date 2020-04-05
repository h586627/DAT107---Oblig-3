package no.hvl.dat107;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.NamedQuery;


@Entity 
@Table(name = "ansatt", schema = "oving8jpa")

public class Ansatt {
	
	@Id private String brukernavn;
	private String fornavn;
	private String etternavn;
	private LocalDate ansettelsesdato;
	private String stilling;
	private BigDecimal lonn; 
	
	public Ansatt() {
		
	}
	
	public Ansatt(String brukernavn, String fornavn, String etternavn, LocalDate ansettelsesdato, 
			String stilling, BigDecimal lonn) {
		
		this.brukernavn = brukernavn;
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.ansettelsesdato = ansettelsesdato;
		this.stilling = stilling;
		this.lonn = lonn; 
		
	}
	
	@Override 
	public String toString() {
		return String.format("brukernavn: " + brukernavn + "\n" 
				+ "fornavn: " + fornavn + "\n" 
				+ "etternavn: " + etternavn + "\n" 
				+ "ansettelsesdato: " + ansettelsesdato + "\n" 
				+ "stilling: " + stilling + "\n" 
				+ "lønn: " + lonn);
	}
	
	


	

 
	


	

}
