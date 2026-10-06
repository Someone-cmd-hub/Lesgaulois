package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	
	//methodes identité gaulois
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
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
	
	
	
	
	//main
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix.getNom());
	}
	
}
