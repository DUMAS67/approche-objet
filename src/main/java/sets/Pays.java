package sets;

public class Pays implements Comparable<Pays> {

	private String nom;
	private int nbHabitant;
	private double pibHabitant;

	public Pays(String nom, int nbHabitant, double pibHabitant) {
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pibHabitant = pibHabitant;
	}

	
	public int compareTo(Pays o) {

		if (this.pibHabitant > o.getPibHabitant()) {
			return 1;
		} else if (this.pibHabitant < o.getPibHabitant()) {
			return -1;
		}
		return 0;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		return nom + " avec " + nbHabitant + " Habitants pour un Pib/Habitant de " + pibHabitant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	public double getPibHabitant() {
		return pibHabitant;
	}

	public void setPibHabitant(double pibHabitant) {
		this.pibHabitant = pibHabitant;
	}

}
