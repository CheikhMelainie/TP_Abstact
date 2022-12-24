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
		nbpresonnes=Secétaire.nbSercetaire() + Enseignant.nbEnseignants() + Etudiant.nbEtudiants();
		System.out.println("le nombre des personnes :"+Personee.nbpresonnes);
		System.out.println("le nombre des secrétaires :"+Secétaire.nbSercetaire());
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
		return  "la modification a eté bien effectué";
	}
	
	public abstract void ecrirePrsonne();

}
