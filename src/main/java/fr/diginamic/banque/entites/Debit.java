package fr.diginamic.banque.entites;

public class Debit extends Operation{
	String dateDebit;
	int montantDebit;
	final String type = "Debit";
	
	public Debit(String dateDebit, int montantDebit){
		super(dateDebit,montantDebit);
		
		}

	public String getDateDebit() {
		return dateDebit;
	}

	public void setDateDebit(String dateDebit) {
		this.dateDebit = dateDebit;
	}

	public int getMontantDebit() {
		return montantDebit;
	}

	public void setMontantDebit(int montantDebit) {
		this.montantDebit = montantDebit;
	}

	@Override
	String afficherType() {
		// TODO Auto-generated method stub
		return type;
	}

	

	
}
