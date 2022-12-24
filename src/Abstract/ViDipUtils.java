package Abstract;

import Abstract.VilleException;
import Abstract.DipException;

public class ViDipUtils {
	
	public static void checkville(String ville) throws VilleException {
		if(ville.equals("Nouakchott") || ville.equals("Nouadhibou")) {
			throw new VilleException("Ville " + ville + " n'existe pas !");
		} else{
			System.out.println("Ville " + ville + " OK");
		}
	}
	public static void checkdip( String diplomeEnCours) throws  DipException{
		if(diplomeEnCours.equals("chebcheb")){
			throw new DipException("Diplome  " + diplomeEnCours + "  chebcheb");
		 } else{
			System.out.println("Diplome " + diplomeEnCours + " OK");
		}
		
		

}

}
