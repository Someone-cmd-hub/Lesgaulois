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
		assert forceCoup>=0 : "La force doit être positive";
		int temp=forceCoup;
		force = force - forceCoup;
		if (force<1) {
			Parler("J'abandonne");
		}
		else {
			Parler("Aïe");
		}
		assert temp>forceCoup : "La force du romain doit diminué";
	}


//main

public static void main(String[] args) {
	Romain minus = new Romain("Minus",6);
	assert minus.isInvariantVerified();
	System.out.println(minus);
}

//invariants

private boolean isInvariantVerified() {
	return force>=0;
}

}
