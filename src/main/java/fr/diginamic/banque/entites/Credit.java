package fr.diginamic.banque.entites;



public class Credit extends Operation {

	String dateCredit;
	double montantCredit;
	final String type = "Credit";
	
	public Credit(String dateCredit, double montantCredit){
	super(dateCredit,montantCredit);
	}

	public String getDateCredit() {
		return dateCredit;
		
	}

	public double getMontantCredit() {
		return montantCredit;
	}

	public void setMontantCredit(double montantCredit) {
		this.montantCredit = montantCredit;
	}

	public void setDateCredit(String dateCredit) {
		this.dateCredit = dateCredit;
	}

	@Override
	String afficherType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	String getTypeOperation() {
		// TODO Auto-generated method stub
		return "Credit";
	}
}