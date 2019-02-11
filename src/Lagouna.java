
public class Lagouna extends Vehicule {

	public Lagouna(String puissance, double prix) {
		
		this.puissance = puissance;
		
	}
}

Vehicule lag1 = new Lagouna();
lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
