package fr.diginamic.salaire;

public class Salarie extends Intervenant{

	double montantSalaireMensuel;
	
	
	
	
	public Salarie(String nom, String prenom, double montantSalaireMensuel) {
		super(nom, prenom);
		this.montantSalaireMensuel = montantSalaireMensuel;
	}




	@Override
	public double getSalaire() {
		
		return montantSalaireMensuel;
	}




	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Salarie";
	}

}
