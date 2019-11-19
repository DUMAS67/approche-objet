package maps;

// Création d'une classe Executable qui crée une Map
import java.util.HashMap;
import java.util.Map;

public class CreationMap {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Map <String, Double> mapSalaires =  new HashMap<>();
		
		mapSalaires.put("Paul",1750.0d);
		mapSalaires.put("Hicham",1825.0d);
		mapSalaires.put("Yu",2250.0d);
		mapSalaires.put("Ingrid",2015.0d);
		mapSalaires.put("Chantal",2418.0d);
	
		System.out.println("Taille de la Map : "+ mapSalaires.size());
		
	}

}
