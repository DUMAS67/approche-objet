package fr.diginamic.banque.entites;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjetGeometrique [] tab= new ObjetGeometrique[4];

		tab[0]=new Cercle(12.0d);
		tab[1]=new Rectangle(15.0d,18.5d);
		tab[2]=new Cercle(1.20d);
		tab[3]=new Rectangle(25.0d,28.5d);
	for (int i=0; i< tab.length;i++){
		tab[i].getInfos();
		System.out.println("Perimetre de "+tab[i].perimetre());
		System.out.println("Surface de "+tab[i].surface());
	}
	}

}
