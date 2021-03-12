import java.util.ArrayList;
import java.util.List;

public class main {
	public static void main(String[] args) { 
		
		Chien Miguel = new Chien (40, 7, "Miguel", "chihuahua");
		Chien BalaisBrosse = new Chien (105, 9, "BalaisBrosse", "Berger Allemand");
		Chien Tortue = new Chien (20,12,"Tortue", "Reptile");
		Tetard Cheval = new Tetard ("Cheval", "tetard d'eau douce", "faire trempette");

		Etudiant cedric = new Etudiant ("MELRET", "Cédric", 19, "BTSSIO1 option SLAM");
		cedric.ajouterUnChien(Miguel);
		cedric.ajouterUnChien(BalaisBrosse);
		
		cedric.ajouterUnTetard(Cheval);
		
		Etudiant clement = new Etudiant("PERDRIX", "Clément", 18, "BTSSIO1 option SLAM");
		clement.ajouterUnChien(Tortue);
		
		Etudiant Nathan = new Etudiant ("JOUDET","Nathan", 21, "BTSSIO1 option SLAM");
		
		
		Classe BTSSIO = new Classe ("BTSIO1");
		BTSSIO.addEtudiant(clement);
		BTSSIO.addEtudiant(cedric);
		BTSSIO.addEtudiant(Nathan);
		BTSSIO.removeEtudiant(0);
		BTSSIO.presenterClasse();
			}
		}

