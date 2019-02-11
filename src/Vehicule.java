import java.util.List;

abstract class Vehicule implements Option {

	double prix;
	String nom;
	List<Option> options;

	public String toString() {

		return nom;
	}

	void addOption(Option opt) {

	}

	public Marque getMarque() {

		return null;
	}

	List<Option> getOptions() {

		return options;
	}

	public double getPrix() {

		return prix;
	}
}

/*
 * lag1.addOption(new SiegeChauffant());
 * 
 * lag1.addOption(new VitreElectrique());
 * 
 * garage.addVoiture(lag1);
 */