package questions;

public class Test{

	public static void main(String[] args) {
		
		Personne pers = new Personne("Jules", "Dupont", 123234);
		Personne emp = new Employe("Jules", "Dupont", 123234,  1500, "EPHEC");
		Personne ind = new Independant("Jules", "Dupont", 123234, "BE0123456789");
		System.out.println(pers);
		System.out.println(emp);
		System.out.println(ind);
		}

}
