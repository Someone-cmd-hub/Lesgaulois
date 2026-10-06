package personnages;

public class Romain {
	private String nom;
	private int force;
	
	
	//identité + parole
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}
	public void Parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	private String prendreParole() {
		return "Le Romain " + nom + " : ";
	}
	
	
	
	
	//actions
	void recevoirCoup(int forceCoup) {
		force = force - forceCoup;
		if (force<1) {
			Parler("J'abandonne");
		}
		else {
			Parler("Aïe");
		}
	}
}
