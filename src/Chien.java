
public class Chien {
	private int taille;
	private int age;
	private String nom;
	private String race;
	
	public Chien (int taille, int age, String nom, String race) {
		this.taille = taille;
		this.age = age;
		this.nom = nom;
		this.race = race;
	}
	
	public void PresenterChien () {
		System.out.println(nom +  " : " + "Wouaf wouaf "+ taille +" wouaf " + age + " wouaf wouaf wouf "+ nom +" wouaf wouf "+ race+ ".");
	}
	public String toString() {
		return nom;
	}
}
