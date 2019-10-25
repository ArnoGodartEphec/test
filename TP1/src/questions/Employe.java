package questions;

public class Employe extends Personne {

		protected int salaire;
		protected String employeur;
		
		
		
		public Employe(String nom, String prenom, int registreNationnal, int salaire, String employeur) {
			super(nom, prenom, registreNationnal);
			this.salaire = salaire;
			this.employeur = employeur;
		}



		public int getSalaire() {
			return salaire;
		}



		public void setSalaire(int salaire) {
			this.salaire = salaire;
		}



		public String getEmployeur() {
			return employeur;
		}



		public void setEmployeur(String employeur) {
			this.employeur = employeur;
		}



		@Override
		public String toString() {
			return "Employe [salaire=" + salaire + ", employeur=" + employeur + "]";
		}


		
		
		
		
		
}
