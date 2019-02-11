
public enum TypeMoteur {

	Diesel("Moteur DIESEL"), Electrique("Moteur ELECTRIQUE"), Essence("Moteur ESSENCE"), Hybride("Moteur HYBRIDE");

	private String name = "";

	// Constructeur
	private TypeMoteur(String name) {
		this.name = name;
	}

	public String toString() {

		return name;
	}
}