import java.util.ArrayList;
import java.util.List;

public class Etudiant {
	private String Nom;
	private String Prénom;
	private int age;
	private String classe;
	private List<Chien> chiens;
	private List<Tetard> tetard;
		
	public Etudiant (String Nom, String Prénom, int age, String classe) {	
			this.Nom = Nom;
			this.Prénom = Prénom;
			this.age = age;
			this.chiens = new ArrayList<>();
			this.tetard = new ArrayList<>();
			this.classe = classe;
		}
	
	public void PresenterEtudiant () {
		System.out.println(Prénom +" : " + " Bonjour, je m'appelle " + Nom +" "+ Prénom +" et j'ai "+ age +" ans, de plus je suis en "+ classe+".");
		
		for (int i=0; i<chiens.size(); i++) {
			chiens.get(i).PresenterChien();
		}
		for (int i=0; i<tetard.size(); i++) {
			tetard.get(i).tetardPresentation ();
			tetard.get(i).PetAbility ();
		}
		
	}
	public void ajouterUnChien (Chien p_chien) {
		chiens.add(p_chien);
	}
	public void ajouterUnTetard (Tetard p_tetard) {
		tetard.add(p_tetard);
	}
	public void retirerChien (int r_numeroChien) {
		chiens.remove(r_numeroChien);
	}
	public void retirerTetard(int r_numerotetard) {
		tetard.remove(r_numerotetard);
	}

}

