package personnages;

import Objet.Equipement;

public class Romain {
	//attributs
	private String nom;
	private int force;
	private Equipement[] equipement=new Equipement[2];
	private int nbEquipement=0;
	
	//constructeur
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
	
	
	
	
	//methods
	
	public void recevoirCoup(int forceCoup) {
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
	
	public void sequiper(Equipement e) {
		switch(nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé");
			break;
		case 1:
			if(e == equipement[0]) {
				System.out.println("Le soldat " + nom + " possède déjà un " + e.toString() + ".");
			}
			else {
				System.out.println("Le soldat " + nom + " s'équipe d'un " + e.toString() + ".");
				equipement[1]=e;
				nbEquipement++;
			}
			break;
		case 0:
			System.out.println("Le soldat " + nom + " s'équipe d'un " + e.toString() + ".");
			equipement[0]=e;
			nbEquipement++;
			break;
		default:
			System.out.println("Nombre d'équipement non-valide");
		}
	}
	
//main

public static void main(String[] args) {
	Romain minus = new Romain("Minus",6);
	assert minus.isInvariantVerified();
	System.out.println(minus);
	for (Equipement e : Equipement.values()) {
		System.out.println(e + " ");
	}
	minus.sequiper(Equipement.CASQUE);
	minus.sequiper(Equipement.CASQUE);
	minus.sequiper(Equipement.BOUCLIER);
	minus.sequiper(Equipement.CASQUE);
}
	
	//invariants

private boolean isInvariantVerified() {
	return force>=0;
}

}
