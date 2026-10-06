package personnages;

import Objet.Chaudron;

public class Druide {
	private String nom;
	private int force;
	Chaudron chaudron=new Chaudron(0,0);
	
	
	//paroles + identité
	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}
	
	
	
	//actions
	public void fabriquerPotion(int quantite,int forcePotion) {
		chaudron.remplirChaudron(quantite,forcePotion);
		parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de "+ forcePotion + ".");
		
	}
	public void booster(Gaulois gaulois) {
		String nomGaulois=gaulois.getNom();
		int forceP=chaudron.getForcePotionBase();
		if (chaudron.resterPotion()) {
			if (nomGaulois=="Obélix") {
				parler("Non, " + nomGaulois + " Non ! Et tu le sais très bien");
			}
			else {
				chaudron.prendreLouche();
				gaulois.boirePotion(forceP);
				parler("Tiens " + nomGaulois + " un peu de potion magique");
			}
		}
		else {
			parler("Désolé " + nomGaulois + " il n'y a plus une goutte de potion magique");
		}
	}
	public String getNom() {
		return nom;
	}
	
}
