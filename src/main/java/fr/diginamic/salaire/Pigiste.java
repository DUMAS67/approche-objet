package fr.diginamic.salaire;

public class Pigiste extends Intervenant{

	int nbJoursTravailles;
	double montantJournalier;
	
	
	public Pigiste(String nom, String prenom, int nbJoursTravailles, double montantJournalier) {
		super(nom, prenom);
		this.nbJoursTravailles = nbJoursTravailles;
		this.montantJournalier = montantJournalier;
	}


	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return nbJoursTravailles*montantJournalier;
	}


	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Pigiste";
	}

}
