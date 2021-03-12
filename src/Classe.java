import java.util.ArrayList;
import java.util.List;

public class Classe {
	private String libelle;
	private List<Etudiant> etudiants;
	
	public Classe(String libelle) {
		this.libelle = libelle;
		this.etudiants = new ArrayList<>();
		
	}
	List<Etudiant>getEtudiant(){
		return etudiants;
	}
	
	public int getEtudiant (int index) {
		return index;
	}

	public void addEtudiant(Etudiant a_etudiants) {
		etudiants.add(a_etudiants);
	}
	public void removeEtudiant (int r_index) {
		etudiants.remove(r_index);
	}
	public void presenterClasse() {
		System.out.println("La classe "+libelle+" se compose de : ");
		
		for (int index=0; index<etudiants.size(); index++) {
		etudiants.get(index).PresenterEtudiant();
	}
}
}
