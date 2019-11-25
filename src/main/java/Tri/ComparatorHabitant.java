package Tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorHabitant implements Comparator<Pays> {

	private boolean sens;

	static final boolean ASC = true;
	static final boolean DESC = false;

	public ComparatorHabitant(boolean sens) {
		super();
		this.sens = sens;
	}

	public int compare(Pays arg0, Pays arg1) {
		if (sens == true) {
			if (arg0.getNbHabitant() > arg1.getNbHabitant()) {
				return 1;
			} else if (arg0.getNbHabitant() < arg1.getNbHabitant()) {
				return -1;
			} else
				return 0;
		} else {
			if (arg0.getNbHabitant() > arg1.getNbHabitant()) {
				return -1;
			} else if (arg0.getNbHabitant() < arg1.getNbHabitant()) {
				return 1;
			} else
				return 0;
		}
	}
}
