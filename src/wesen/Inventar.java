package wesen;

import gegenstand.Gegenstand;

public class Inventar {
	
	// Liste aller im Inventar gespeicherten Gegenstände
	Gegenstand[] inventarplatz; 
	
	// Wieviele Gegenstände sind im Inventar?
	// und: welches ist der nächste freie Platz.
	int benutzt = 0;
	int maxPlaetze;
		
		
	/**
	 * Erstellt ein Inventar mit einer gegebenen Zahl von 
	 * Plätzen.
	 * 
	 * @param maxPlaetze die Anzahl der im Inventar 
	 * nutzbaren Plätze.
	 */
	public Inventar(int maxPlaetze) {
		this.setMaxPlaetze(maxPlaetze);		
	}
	
	/**
	 * VORSICHT!! Muss raus!
	 * 
	 * @param maxPlaetze
	 */
	public void setMaxPlaetze(int maxPlaetze) {
		this.maxPlaetze = maxPlaetze;
		inventarplatz = new Gegenstand[maxPlaetze];
	}
	
	
	/**
	 * Fügt einen Gegenstand (Schwert, Blume, Ring, etc.) 
	 * dem Inventar hinzu.
	 * 
	 * @param gegenstand Gegenstand, der ins Inventar aufgenommen
	 * 	werden soll.
	 */
	public void packeRein(Gegenstand gegenstand) {
		int neuerplatz = benutzt;
		inventarplatz[neuerplatz] = gegenstand;
		benutzt = neuerplatz + 1;
	}

	/**
	 * Prüft, ob noch mindestens ein Platz im Inventar frei ist.
	 * 
	 * @return true - wenn Platz frei. false - wenn kein Platz 
	 * mehr frei.
	 */
	public boolean istPlatzFrei() {
				
		if (inventarplatz[maxPlaetze -1] == null) {
			return true;
		}
		
		return false;
	}
	
	
	/**
	 * Löscht einen Gegenstand am einem Platz. Gelöscht wird 
	 * der Gegenstand an der übergebenen Platznummer.  
	 * 
	 * @param platzNummer die Nummer des Platzes (0 .. Max-1)
	 */
	public void leerePlatz(int platzNummer) {
		Gegenstand[] tempInventarPlatz = new Gegenstand[maxPlaetze];
		
		int k = 0;
		for (int i=0; i < benutzt; i++) {
			if (i == platzNummer) { continue; }
			
			tempInventarPlatz[k] = inventarplatz[i];
			k++;
		}
		
		inventarplatz = tempInventarPlatz;
		
	}
	
	/**
	 * Vergrößert das Inventar. Die vorhandenen Gegenstände 
	 * bleiben dabei erhalten.
	 * 
	 * @param maxPlaetze Neue Anzahl der im Inventar 
	 * verfügabren Plätze. 
	 */
	public void setNeueMaxPlaetze(int maxPlaetze) {
		Gegenstand[] tempInventarPlatz = new Gegenstand[maxPlaetze];
		for (int i=0; i < benutzt; i++) {
			tempInventarPlatz[i] = inventarplatz[i];
		}
		
		inventarplatz = tempInventarPlatz;
	}
	
	
	/**
	 * Liefert das Gegenstands-Objekt, das im Inventar
	 * auf dem Platz <platzNummer> gespeichert ist.
	 *     
	 * @param platzNummer PlatzNummer (0 .. Max-1) des 
	 * 		  Gegenstands 
	 * @return Gegenstand
	 */
	public Gegenstand getGegenstand(int platzNummer) {
		return inventarplatz[platzNummer];
	}
	
	/**
	 * Liefert die Zahl der im Inventar belegten Plätze. 
	 * Entspricht der Anzahl der enthaltenen Gegenstände.
	 *  
	 * @return Zahl der belegten Plätze
	 */
	public int getBelegtePlaetze() {
		return benutzt;
	}
	
	/**
	 * Liefert die Anzahl der Gegenstände im Inventar. 
	 * ist ein Alias für die Funktion getBelegtePlaetze().
	 * 
	 * @return Anzahzl der Gegenstände.
	 */
	public int getAnzahlGegenstaende() {
		return getBelegtePlaetze();
	}
	
	/**
	 * Liefert die Größe des Inventars.
	 * 
	 * @return
	 */
	public int getMaxPlaetze() {
		return maxPlaetze;
	}
}
