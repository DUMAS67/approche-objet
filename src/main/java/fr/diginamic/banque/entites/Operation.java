package fr.diginamic.banque.entites;

public abstract class Operation {

	private String dateOperation;
	private double montantOperation;
	
	public Operation(String date, double montant) {
		this.dateOperation = date;
		this.montantOperation = montant;
	}
	
	abstract String afficherType();
	abstract String getTypeOperation();
		
	public String toString(){
		return afficherType() +" "+dateOperation+" "+ montantOperation;
	}
	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(double montantOperation) {
		this.montantOperation = montantOperation;
	}
	
	
	
	
	}


