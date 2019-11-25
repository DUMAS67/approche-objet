package Tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorPibHabitant implements Comparator<Pays> {

	private boolean tri;
	static final boolean ASC = true;
	static final boolean DSC = false;

	public ComparatorPibHabitant(boolean tri) {

		this.tri = tri;
	}

	@Override
	public int compare(Pays o1, Pays o2) {

		if (tri == true) {
			if ((o1.getPibHabitant()) > (o2.getPibHabitant())) {
				return 1;
			} else if ((o1.getPibHabitant()) < (o2.getPibHabitant())) {
				return -1;
			} else {
				return 0;
			}

		} else if ((o1.getPibHabitant()) < (o2.getPibHabitant())) {
			return 1;
		} else if ((o1.getPibHabitant()) > (o2.getPibHabitant())) {
			return -1;
		} else {
			return 0;
		}
	}

}
