package fr.diginamic.banque.entites;



public class Credit extends Operation {

	String dateCredit;
	int montantCredit;
	final String type = "Credit";
	
	public Credit(String dateCredit, int montantCredit){
	super(dateCredit,montantCredit);
	}

	public String getDateCredit() {
		return dateCredit;
		
	}

	public int getMontantCredit() {
		return montantCredit;
	}

	public void setMontantCredit(int montantCredit) {
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
}