package essais;

import entites.*;

public class TestCercle {

	public static void main(String[] args) {
		
		Cercle c1= new Cercle(12.0d);
		Cercle c2 = new Cercle(15.0d);
		
		System.out.println(c1.getInfos());
		System.out.println("Périmètre : " + c1.perimetre());
		System.out.println("Surface : " + c1.surface());
		System.out.println(c2.getInfos());
		System.out.println("Périmètre : " + c2.perimetre());
		System.out.println("Surface : " + c2.surface());
		

	}

}
