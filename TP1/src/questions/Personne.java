package questions;

public class Personne {

	protected String nom;
	protected String prenom;
	protected int registreNationnal;
	
	
	public Personne(String nom, String prenom, int registreNationnal) {
		this.nom = nom;
		this.prenom = prenom;
		this.registreNationnal = registreNationnal;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public int getRegistreNationnal() {
		return registreNationnal;
	}


	public void setRegistreNationnal(int registreNationnal) {
		this.registreNationnal = registreNationnal;
	}


	@Override
	public String toString() {
		return "Personne : nom : " + nom + "\n" + "prenom : " + prenom + ", registreNationnal=" + registreNationnal + "]";
	}

	


}
