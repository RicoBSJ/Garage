
public class Moteur {

	public enum TypeMoteur {
		Diesel, Electrique, Essence, Hybride
	};

	String cylindre;
	double prix;

	protected Moteur(String cyclindre, double prix) {

	}

	public String toString() {
		
		return cylindre;
	}

	void getPrix() {

	}

}
