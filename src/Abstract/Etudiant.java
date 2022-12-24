package Abstract;

public class Etudiant extends Personee{

	private String diplomeEnCours;
	static int nbEtudiants=0;
	public Etudiant(String nom, String prenom, String rue, String ville, String diplomeEncours) {
		super(nom, prenom, rue, ville);
		this.nom=nom;
		this.prenom=prenom;
		this.rue=rue;
		this.ville=ville;
		this.diplomeEnCours=diplomeEncours;
		this.nbEtudiants++;
		
	}
	
	
	
	public String getDiplomeEnCours() {
		return diplomeEnCours;
	}



	public void setDiplomeEnCours(String diplomeEnCours) {
		this.diplomeEnCours = diplomeEnCours;
	}



	static int nbEtudiants(){
		
		return nbEtudiants;
	}
	
	

	@Override
	public String toString() {
		return "Etudiant [diplomeEnCours=" + diplomeEnCours + ", nom=" + nom + ", prenom=" + prenom + ", rue=" + rue
				+ ", ville=" + ville + "]";
	}

	@Override
	public void ecrirePrsonne() {
		System.out.println(toString());
		
	}

}
