package Abstract;

public class SecÚtaire extends Personee{

	private String numeroBurau;
	static int nbSecretaires=0;

	public SecÚtaire(String nom, String prenom, String rue, String ville, String numeroBurau) {
		super(nom, prenom, rue, ville);
		this.nom=nom;
		this.prenom=prenom;
		this.rue=rue;
		this.ville=ville;
		this.numeroBurau=numeroBurau;
		this.nbSecretaires++;
		
	}

	static int nbSercetaire(){
		return nbSecretaires;
	}
	


	@Override
	public String toString() {
		return "SecÚtaire [numeroBurau=" + numeroBurau + ", nom=" + nom + ", prenom=" + prenom + ", rue=" + rue
				+ ", ville=" + ville + "]";
	}

	@Override
	public void ecrirePrsonne() {
		System.out.println(toString());
	}

}
