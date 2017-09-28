package test;

import gegenstand.Gegenstand;
import wesen.Inventar;

public class TestInventar {
	
	public static void main(String[] args) {
		
		Inventar inventar = new Inventar(10);
		
		/* Inventar i = new Inventar();
		 * 
		 * i.setMaxPlaetze(10);
		 * 
		 */
		
		// Schwert schwert = new Schwert();
		Gegenstand schwert = new Gegenstand();
		schwert.setName("Excalibur");
		
		// Ring ring = new Ring();
		Gegenstand ring = new Gegenstand();
		ring.setName("Meiiin Schatzzzz");
		
		
		// Prüfe ob noch Platz ist.
		if (inventar.istPlatzFrei()) {
			inventar.packeRein(schwert);
		}
		
		// Prüfe, ob noch Platz ist.
		if (inventar.istPlatzFrei()) {
			inventar.packeRein(ring);
		}
		
		
		
		
		int anzahl = inventar.getAnzahlGegenstaende();		
		    System.out.println("Gegenstände im Inventar :"+ anzahl);
		
		for (int i = 0; i < anzahl; i++) {
			Gegenstand g = inventar.getGegenstand(i);
			System.out.println("Name                    :" + g.getName());
		}
				
	}

}
