
public class Moteur {

	public enum TypeMoteur {
		Diesel, Electrique, Essence, Hybride
	};
	String cylindre;
	double prix;

	public Moteur(String cyclindre, double prix) {

	}

	public String toString() {
		
		return cylindre;
	}

	double getPrix() {
		
		return prix;
	}

}
