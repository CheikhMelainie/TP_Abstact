package Abstract;

public class Test {

	public static void main(String[] args) {
	
		//*******************Cr�er des objets ***********************************
	    Sec�taire s = new Sec�taire("Ahmed", "Ali", "Jemale Abd Nasser", "Nouakchott","12");
	    Sec�taire s1 = new Sec�taire("Fatou", "Sidi", "Teyaret", "Atar","112");
		Enseignant es = new Enseignant("Lolo", "Lili", "koko", "NDB", "Maths");
		Enseignant es2 = new Enseignant("Ahmed", "Ali", "Popo", "Zrtt", "PC");
		Etudiant et = new Etudiant("T'feil", "Moilid", "Hay", "Noukchott", "chebcheb");
	    Etudiant et1 = new Etudiant("Med", "Lemin", "Tarhile", "Noukchott", "Licenec");
		
	    System.out.println("******************** La v�rification *********************\n");
		//*************G�rer les exceptions au nivaux du ville******************
        try {
			ViDipUtils.checkville(s.ville);
		}catch (VilleException e) {
			System.out.println(e.getMessage());
	    }
		
		
		
		//*******************G�rer les exceptions au nivaux du ville********************
	    try {
				ViDipUtils.checkville(s1.ville);
			}catch (VilleException e) {
				System.out.println(e.getMessage());
		    }
		
		
		//***************G�rer les exceptions au nivaux du diplome = chebcheb*********************
		 try {
				ViDipUtils.checkdip(et.getDiplomeEnCours());
			}catch (DipException e) {
				System.out.println(e.getMessage());
		    }
		//***************G�rer les exceptions au nivaux du diplome*********************
		 try {
				ViDipUtils.checkdip(et1.getDiplomeEnCours());
			}catch (DipException e) {
				System.out.println(e.getMessage());
		    }
		
		 System.out.println("******************** Affichage des objets *********************\n");
		//***************Affichage du objets cr�es !*********************
		s1.ecrirePrsonne();
		es.ecrirePrsonne();
		et1.ecrirePrsonne();
		
		System.out.println("******************** Les nombres des personnes detailler *********************\n");
		Personee.nbPresonnes();
		
		//*************La modification******************
		System.out.println("******************** La modification *********************\n");
		s1.modifierPersonnes("Jemal Abd Nasser", "NKTT");
		s1.ecrirePrsonne();
		es.modifierPersonnes("Ould Badou", "Nouakchott");
		es.ecrirePrsonne();
		

	}

}
