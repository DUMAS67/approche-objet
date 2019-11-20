

package fr.diginamic.banque.entites;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Compte {

	String numeroCompte;
	double soldeInitial;
	int type;
	Operation[] tableauOperation;
	int nbOperation = 0;

	@Override
	public boolean equals(Object arg0) {
if (!(arg0 instanceof Compte)) {
	return false;
	}
		Compte test = (Compte) arg0;
		/*boolean testCompte = (this.numeroCompte == test.getNumeroCompte()) && (this.soldeInitial == test.getsoldeInitial());
		if (testCompte) {
			return true;
		} else
			return false;*/
		boolean eq1 = new EqualsBuilder().append(this.numeroCompte, test.getNumeroCompte()).isEquals();
		
		boolean eq2 = new EqualsBuilder().append(this.soldeInitial, test.getsoldeInitial()).isEquals();
		boolean eq3 = new EqualsBuilder().append(eq1, eq2).isEquals();
		return (eq3);
		
	}

	public Compte(String numeroCompte, double soldeInitial, int type) {
		this.numeroCompte = numeroCompte;
		this.soldeInitial = soldeInitial;
		this.type = type;
	}

	public Compte(String numeroCompte, double soldeInitial) {
		this.numeroCompte = numeroCompte;
		this.soldeInitial = soldeInitial;
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
			if (tableauOperation[i].getTypeOperation()=="Credit") {
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
