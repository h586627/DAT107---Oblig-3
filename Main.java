package no.hvl.dat107;

import java.util.*;
import java.io.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Main {

	public static void main(String[] args) {
		
		boolean ferdig = false;
		
		while (!ferdig) {
			System.out.print("Skriv inn brukernavn: ");
			
			Scanner sc = new Scanner(System.in);
			String bn = sc.nextLine();
			if (bn.equals("ferdig")) { 
				ferdig = true;
				break;
			}
			
			String jpql = "SELECT a from Ansatt a where a.brukernavn LIKE :bn";
			
			EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("ansattPersistenceUnit");
			
			EntityManager em = emf.createEntityManager();
	
			
			System.out.println("Kobler til database.. ");
			
			try {
				TypedQuery<Ansatt> query = em.createQuery(jpql, Ansatt.class);
				query.setParameter("bn", bn);
				Ansatt ansatt = query.getSingleResult();
					 System.out.print(ansatt);
					
				} finally {
			        em.close();
				}
			}
			System.out.println("Ferdig!");
		
		}
	}


//SEELCT BRUKERNAVN FROM ANSATT