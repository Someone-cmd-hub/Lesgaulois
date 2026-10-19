package villageGaulois;

import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois=0;
	private Gaulois chef;
	
	//Constructor
	public Village(String nom, int nbVillageois, Gaulois chef) {
		this.nom = nom;
		this.nbVillageois = nbVillageois;
		this.chef= chef;
	}
	
	//Getter
	public String getNom() {
		return nom;
	}
	public Gaulois getChef() {
		return chef;
	}
	
	//Methods
	private Gaulois villageois[]= new Gaulois[nbVillageois];
	private int cmpt=0;
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois >= nbVillageois || villageois[numVillageois -1]==null) {
			System.out.println("Il n'a pas autant de villageois !");
			return null;
		}
		return villageois[numVillageois];
	
	}
	public void ajouterVillageois(Gaulois gaulois) {
		cmpt++;
		if (cmpt>=nbVillageois) {
			System.out.println("Le village est plein !");
		}
		else {
			villageois[cmpt]=gaulois;
		}
	}
	public void afficherVillage() {
		
	}
	
	//main
	public static void main (String[] args) {
		//perso et objet
		Gaulois abraracourcix = new Gaulois("Abraracourcix",6);
		Village virred = new Village("Village des irreductibles",30,abraracourcix);
		virred.trouverVillageois(29);
	}
}
