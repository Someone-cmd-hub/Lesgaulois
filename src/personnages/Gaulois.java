package personnages;

import villageGaulois.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	private Village villageg;
	
	//methodes identité gaulois
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void setVillage(Village villageg) {
		this.villageg=villageg;
	}
	
	//methodes parole
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}
	
	
	
	//methodes actions
	public void frapper(Romain romain) {
		//String nomRomain = romain.getNom(); pas utile
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		//int forceCoup = force / 3; pas utile, utilisé qu'une fois
		romain.recevoirCoup((force*effetPotion)/3);
		if (effetPotion>1) {
			effetPotion=effetPotion-1;
		}
	}
	public void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
	}
	
	public void sePresenter() {
		System.out.print("Le gaulois ");
		if (villageg!= null && villageg.getChef().getNom()!=nom) {
			System.out.println(nom + ": \"Bonjour, je m'appelle " + nom + " . J'habite le village :"
+ villageg.getNom() + "\"");
			}
		else if(villageg!=null && villageg.getChef().getNom()==nom){
			System.out.println(nom + ": \"Bonjour, je m'appelle " + nom + " . Je suis le chef du village :"
					+ villageg.getNom() + "\"");
		}
		else {
			System.out.println(nom + ": \"Bonjour, je m'appelle " + nom + " . Je voyage de village en village\"");

		}
	}
	
	//main
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix.getNom());
	}
	
}
