package fr.diginamic.essais;

import fr.diginamic.formes.*;

public class TestForme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cercle c1 = new Cercle(10.0d);
Cercle c2 = new Cercle(12.0d);
Rectangle r1 = new Rectangle(3.0d,4.0d);
Rectangle r2 = new Rectangle(8.0d,6.0d);
Carre kR = new Carre(5,5);
AffichageForme af = new AffichageForme();

af.afficher(c1);
af.afficher(c2);
af.afficher(r1);
af.afficher(r2);
af.afficher(kR);	
	}

}
