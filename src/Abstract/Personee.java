package Abstract;

public  abstract class Personee {
	protected String nom;
	protected String prenom;
	protected String rue;
	protected String ville;
    static int nbpresonnes;
	
	public Personee(String nom, String prenom, String rue, String ville){
		this.nom=nom;
		this.prenom=prenom;
		this.rue=rue;
		this.ville=ville;
	}

	static void nbPresonnes(){
		nbpresonnes=Sec�taire.nbSercetaire() + Enseignant.nbEnseignants() + Etudiant.nbEtudiants();
		System.out.println("le nombre des personnes :"+Personee.nbpresonnes);
		System.out.println("le nombre des secr�taires :"+Sec�taire.nbSercetaire());
		System.out.println("le nombre d'enseugnants :"+Enseignant.nbEnseignants());
		System.out.println("le nombre d'etudiants :"+Etudiant.nbEtudiants());
		
	}
	
	@Override
	public String toString() {
		return "Personee [nom=" + nom + ", prenom=" + prenom + ", rue=" + rue + ", ville=" + ville + "]";
	}
	
	public String modifierPersonnes(String rue, String ville){
		this.rue=rue;
		this.ville=ville;
		return  "la modification a et� bien effectu�";
	}
	
	public abstract void ecrirePrsonne();

}
