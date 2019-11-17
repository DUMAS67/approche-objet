package fr.diginamic.banque.entites;

public class Compte {

	public Compte(String numeroCompte, double soldeInitial, int type) {
		super();
		this.numeroCompte = numeroCompte;
		this.soldeInitial = soldeInitial;
		this.type = type;
	}

	private String numeroCompte;
	private double soldeInitial;
	private Operation[] tableauOperation = new Operation[1];
	private int nbOperation = 0;
	private int type;

	public Compte(String numeroCompte, double soldeInitial) {
		this.numeroCompte = numeroCompte;
		this.soldeInitial = soldeInitial;
		this.tableauOperation = tableauOperation;
	}

	public Operation[] getTableauOperation() {
		return tableauOperation;
	}

	public void setTableauOperation(Operation[] tableauOperation) {
		this.tableauOperation = tableauOperation;
	}

	public void ajouterOperation(Operation ope) {
		nbOperation += 1;
		Operation[] tableauTamponOperation = new Operation[nbOperation];
		if (nbOperation == 1) {
			tableauTamponOperation[nbOperation - 1] = ope;

		} else {
			tableauTamponOperation[nbOperation - 1] = ope;
			for (int i = 0; i < nbOperation - 1; i++) {
				tableauTamponOperation[i] = tableauOperation[i];

			}

		}
		tableauOperation = tableauTamponOperation;

	}

	public double getSolde() {

		double soldeOperationTotale = getsoldeInitial();

		for (int i = 0; i < tableauOperation.length; i++) {
			if (tableauOperation[i].getTypeOperation().equals("Credit")) {
				soldeOperationTotale += tableauOperation[i].getMontantOperation();

			} else {
				soldeOperationTotale -= tableauOperation[i].getMontantOperation();
			}
		}

		return soldeOperationTotale;

	}

	public double getSolde(String type) {

		double soldeOperationType = getsoldeInitial();

		for (int i = 0; i < tableauOperation.length - 1; i++) {
			if (tableauOperation[i].getTypeOperation().equals(type)) {
				soldeOperationType += tableauOperation[i].getMontantOperation();
			}
		}
		return soldeOperationType;
	}

	public String toString() {
		return numeroCompte + " " + getSolde() + " pour " + nbOperation + " opération(s)";
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public double getsoldeInitial() {
		return soldeInitial;
	}

	public void setsoldeInitial(double soldeInitial) {
		this.soldeInitial = soldeInitial;
	}

}
