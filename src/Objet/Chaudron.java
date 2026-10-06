package Objet;

public class Chaudron {
	private int quantitePotion;
	private int forcePotionBase;
	public Chaudron(int quantitePotion, int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotionBase = forcePotionBase;
	}
	
	public int getForcePotionBase() {
		return forcePotionBase;
	}



	public void remplirChaudron(int quantite,int forcePotion) {
		quantitePotion = quantite;
		forcePotionBase = forcePotion;
	}
	public boolean resterPotion() {
		if (quantitePotion==0) {
			return false;
		}
		else {
			return true;
		}
	}
	public int prendreLouche() {
		quantitePotion=quantitePotion-1;
		if (quantitePotion==0){
			forcePotionBase=0;
		}
		return forcePotionBase;
	}
}
