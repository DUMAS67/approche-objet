package fr.diginamic.banque.entites;

public abstract class Operation {

	private String dateOperation;
	private int montantOperation;
	
	public Operation(String date, int montant) {
		this.dateOperation = date;
		this.montantOperation = montant;
	}
	
	abstract String afficherType();
		
	public String toString(){
		return afficherType() +" "+dateOperation+" "+ montantOperation;
	}
	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public int getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(int montantOperation) {
		this.montantOperation = montantOperation;
	}
	
	
	
	
	}


