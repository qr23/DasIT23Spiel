package welt;
import gegenstand.Gegenstand;
import gegenstand.Kraut;
import gegenstand.kraeuter.Alraune;
import gegenstand.waffe.Schwert;
import welt.Feld;
import welt.feldtyp.FeldTyp;
import welt.feldtyp.Wald;
import wesen.Monster;
import wesen.monster.Ork;

public class Welt {
	
	int breite;
	int hoehe;
	
	Feld[][] karte;
	
	public Welt (int x, int y) {
		
		// Werte im Objekt speichern
		this.breite = x;
		this.hoehe = y;
		
		// Initialisiere die Karte
		karte = new Feld[x][y];
		
		// Durchlaufe alle Zeilen der Karte
		for (int zeile=0; zeile<y; zeile++) {
			
			// Durchlaufe alle Spalten in der Zeile
			for (int spalte=0; spalte<x; spalte++) {
				
				// Erzeugte neues Feld
				Feld f = new Feld();
				
				// Erzeuge neuen FeldTyp - z.B. Wald 
				// DoTo: per Zufall auswählen!
				FeldTyp ftyp = new Wald();
							
				// Den FeldTyp an das Feld hängen
				f.setFeldTyp(ftyp);
				
				// Ein Monster erzeugen. z.B. Ork
				// ToDo: per Zufall auswählen
				// ToDo: Monster mit Wahrscheinlichkeit und in Abhängigkeit
				// vom FeldTyp (Modifikator auslesen!)
				Monster m = new Ork("Wurgtz");
				
				// Monster auf das Feld setzen.
				f.setMonster(m);
				
				// Kraut erschaffen. z.B. Alraune
				// ToDo: per Zufall auswählen und in Abhängigkeit
				//       von dem, was dort wachsen kann.
				// ToDo: nur mit gewisser Wahrscheinlichkeit 
				//       ein Kraut dort anpflanzen
				// ToDo: mehr als ein Kraut anpflanzen können
				Kraut kraut = new Alraune();
				
				// Kraut auf das Feld pflanzen
				f.setKraut(kraut);
				
				
				// Gegenstand zum Finden erschaffen
				// ToDo: per Zufall auswählen und in Abhängigkeit
				//       von dem, was dort zu finden sein kann.
				// ToDo: nur mit gewisser Wahrscheinlichkeit
				//		 einen Gegenstand dort zum Finden hinterlegen.
				// ToDo: mehr als nur einen Gegenstand dort 
				//		 hinterlegen können.
				Gegenstand gegenstand = new Schwert();
				
				// Gegenstand auf dem Feld verstecken
				f.setGegenstand(gegenstand);
				
				// Feld mit allem DrumUndDran (FeldTyp + 
				// Monster + Modifikatoren + Kraut + Gegenstand) 
				// auf die Karte "kleben"
				karte[spalte][zeile] = f;
			
			} // nächste Spalte bearbeiten
		} // nächste Zeile bearbeiten
		
	}
	
	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}
	
	public int getHoehe() {
		return hoehe;
	}
	
	public void setBreite(int breite) {
		this.breite = breite;
	}
	
	public int getBreite() {
		return breite;
	}
	
	/**
	 * Prüft, ob die gegebenen Koordinaten innerhalb der Welt liegen
	 * 
	 * @param x Position in der Breite
	 * @param y Position in der Höhe
	 * @return true, wenn Position in/auf der Karte liegt
	 */
	public boolean istGueltigePosition(int x, int y) {
		 
		if (x > this.breite) {return false; }
		if (x < 0) {return false; }
		
		if (y > this.hoehe) {return false; }
		if (y < 0) {return false; }
		
		return true;
	}
	
	/**
	 * Liefet das Feld an der Position x/y
	 * 
	 * @param x Position in der Breite
	 * @param y Position in der Höhe
	 * @return Feld an der gegebenen Position
	 */
	public Feld getFeld(int x, int y) {
		// Wenn die gegebenen Koordinaten nicht auf der Karte liegen,
		// wird NULL zurück gegeben
		if (!istGueltigePosition(x, y)) { return null; }
		
		return karte[x][y];
	}
	
	
	
}
