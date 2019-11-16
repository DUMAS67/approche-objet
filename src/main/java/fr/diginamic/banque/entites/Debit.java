package fr.diginamic.banque.entites;

public class Debit extends Operation{
	String dateDebit;
	double montantDebit;
	final String type = "Debit";
	
	public Debit(String dateDebit, double montantDebit){
		super(dateDebit,montantDebit);
		
		}

	public String getDateDebit() {
		return dateDebit;
	}

	public void setDateDebit(String dateDebit) {
		this.dateDebit = dateDebit;
	}

	public double getMontantDebit() {
		return montantDebit;
	}

	public void setMontantDebit(double montantDebit) {
		this.montantDebit = montantDebit;
	}

	@Override
	String afficherType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	String getTypeOperation() {
		// TODO Auto-generated method stub
		return "Debit";
	}

	

	
}
