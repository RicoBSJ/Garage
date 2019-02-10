
public enum Marque {
	
	RENO ("Marque RENO"),
	PIGEOT ("Marque PIGEOT"),
	TROEN ("Marque TROEN");
	
	private String name = "";
	
	//Constructeur
	Marque(String name){
		this.name = name;
	  }
	   
	public String toString(){
		return name;
	  }
}
