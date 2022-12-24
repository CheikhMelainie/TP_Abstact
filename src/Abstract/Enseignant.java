package Abstract;

public class Enseignant extends Personee{

	private String specialite;
	static int nbEnseignant=0;
	public Enseignant(String nom, String prenom, String rue, String ville, String specialite) {
		super(nom, prenom, rue, ville);
		this.nom=nom;
		this.prenom=prenom;
		this.rue=rue;
		this.ville=ville;
		this.specialite=specialite;
		this.nbEnseignant++;
	}
	
	static int nbEnseignants(){
		
		return nbEnseignant;
	}
	

	@Override
	public String toString() {
		return "Enseignant [specialite=" + specialite + ", nom=" + nom + ", prenom=" + prenom + ", rue=" + rue
				+ ", ville=" + ville + "]";
	}

	@Override
	public void ecrirePrsonne() {
		System.out.println(toString());
		
	}

}
