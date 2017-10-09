package welt;
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
		
		// Initialisiere die Karte
		karte = new Feld[x][y];
		
		// Durchlaufe alle Zeilen der Karte
		for (int i=0; i<x; i++) {
			
			// Durchlaufe alle Spalten in der Zeile
			for (int k=0; k<y; k++) {
				
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
				
				// Kraut erstellen
							
				// Feld mit allem DrumUndDran (FeldTyp + 
				// Monster + Modifikatoren) auf die 
				// Karte "kleben"
				karte[i][k] = f;
			
			} // nächste Spalte
		} // nächste Zeile
		
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
	
	

	
}
