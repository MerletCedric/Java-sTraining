
public class Tetard {
	private String nom;
	private String race;
	private String ability;
	
	public Tetard (String nom, String race, String ability) {
		this.nom = nom;
		this.race = race;
		this.ability = ability;
	}
	
	public void tetardPresentation () {
		System.out.println(nom + " : " + "Heyy ! Je m'appelle " + nom + " et je suis un " + race);
	}
	public void PetAbility () {
		System.out.println(nom + " : commence à " + ability);
	}
	public String toString() {
		return nom;
	}
}