package questions;

public class Independant extends Personne {

		protected String numeroTva;
		
		
		public Independant(String nom, String prenom, int registreNationnal, String numeroTva) {
			super(nom, prenom, registreNationnal);
			this.numeroTva = numeroTva;
		}


		public String getNumeroTva() {
			return numeroTva;
		}


		public void setNumeroTva(String numeroTva) {
			this.numeroTva = numeroTva;
		}


		@Override
		public String toString() {
			return "Independant [numeroTva=" + numeroTva + "]";
		}
		
		
		
	
}
