package Test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		Gaulois obelix = new Gaulois("Obélix",16);
		Romain minus = new Romain("Minus",6);
		Romain brutus = new Romain("Brutus",14);
		Druide panoramix = new Druide("Panoramix",2);
		
		asterix.parler("Bonjour " + obelix.getNom());
		obelix.parler("Bonjour " + asterix.getNom() + ". Ca te dirais d'aller chasser du sanglier ?");
		asterix.parler("Oui très bonne idée");
		System.out.println("Dans la forêt, " + asterix.getNom() + " et " + obelix.getNom() + " tombent nez à nez sur le romain " + minus.getNom()+".");
		while (minus.getForce()>=1) {
			asterix.frapper(minus);
		}
		panoramix.fabriquerPotion(4,3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		while (brutus.getForce()>=1) {
			asterix.frapper(brutus);
		}
	}
}
