package villageGaulois;

import personnages.Gaulois;

public class Village {
	private String nomV;
	private int nbVillageois;
	private Gaulois chef;
	private Gaulois[] villageois;
	
	//Constructor
	public Village(String nomV, int nbVillageois, Gaulois chef) {
		this.nomV = nomV;
		this.nbVillageois = nbVillageois;
		this.chef= chef;
		this.villageois= new Gaulois[nbVillageois];

	}
	
	//Getter
	public String getNom() {
		return nomV;
	}
	public Gaulois getChef() {
		return chef;
	}
	
	//Methods
	private int cmpt=0;
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois <0 || numVillageois>cmpt) {
			System.out.println("Il n'a pas autant de villageois !");
			return null;
		}
		return villageois[numVillageois-1];
	
	}
	
	public void ajouterVillageois(Gaulois gaulois) {	
		if (cmpt>=nbVillageois) {
			System.out.println("Le village est plein !");
		}
		else {
			villageois[cmpt]=gaulois;
			gaulois.setVillage(nomV);
			cmpt++;
		}
	}
	public void afficherVillage() {
		System.out.println("Dans le village \"" + nomV+ "\" du chef " + chef.getNom()+ 
" vivent les légendaires gaulois ;") ;
		for (Gaulois gau : villageois) {
				if (gau!=null) {
					System.out.println("- " + gau.getNom() + "\n");
				}
		}
	}
	
	//main
	public static void main (String[] args) {
		//perso et objet
		Gaulois abraracourcix = new Gaulois("Abraracourcix",6);
		Village virred = new Village("Village des irreductibles",30,abraracourcix);
		virred.trouverVillageois(30);
		Gaulois asterix = new Gaulois("Astérix",8);
		virred.ajouterVillageois(asterix);
		Gaulois gaulois = virred.trouverVillageois(1);
		System.out.println(gaulois.getNom());
		gaulois=virred.trouverVillageois(2);
		System.out.println(gaulois);
		virred.afficherVillage();
	}
}
