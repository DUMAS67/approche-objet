package entites;

import javax.sound.midi.Synthesizer;

public class Personne {
	
	
	public String nom;
	public String prenom;
	public AdressePostale adressePostale;
	
	public Personne (String nom, String prenom, AdressePostale adressePostale){
		
		this.nom=nom;
		this.prenom = prenom;
		this.adressePostale= adressePostale;
	}
	
	public void afficherIdentite(){
		
		System.out.println(prenom + " " + nom);
	}
	
	public void afficherUpperCaseNom (){
	
	System.out.println(prenom + " " + nom.toUpperCase());
	}
	
	public void changeAdressePostale(AdressePostale adressePostale){
		this.adressePostale= adressePostale;
		System.out.println(this.adressePostale.ville);
		}
	
	public void changerNom(String nom){
		this.nom = nom;
	}
	public void changerPrenom(String nom){
		this.prenom = nom;
	}
	
	
	}


