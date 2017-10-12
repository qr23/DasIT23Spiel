package spiel;

public class Config {
	
	private String[] zeilenArray = new String[20]; 
	private String[] keys  = new String[20];
	private String[] values = new String[20];
	
	
	
	/**
	 * Setze den Inhalt des ConfigFiles
	 * @param zeile
	 */
	public void setZeilen(String[] zeile) {
		this.zeilenArray = zeile;
	}
	
	/**
	 *  Verarbeitet die übergebenen Zeilen des ConfigFiles
	 */
	public void verarbeite() {
		
		// Anzahl der Elemente im Array ermitteln
		int l = zeilenArray.length;
				
		// Zeilen durchlaufen
		for (int z = 0; z < l; z++) {
			String zeile = zeilenArray[z];
			
			if (zeile != null) {
				
				// Leerzeichen am Anfang und Ende weg machen
				zeile = zeile.trim();
				
				// Wenn Zeile mit # beginnt, nimm nächste Zeile
				if (zeile.startsWith("#")) { continue; }
											
				// Position des = ermitteln
				int pos = zeile.indexOf("=");
				
				// Wenn kein = vorhanden, dann Zeile ignorieren und nächste nehmen. 
				if (pos == -1) { continue; }
				
				//System.out.println("Pos: " + pos);
				
				// Alles Links vom =
				String links = zeile.substring(0, pos);
				
				// Ales rechts vom =
				String rechts = zeile.substring(pos + 1, zeile.length());
				
				// Leerzeichen am Anfang und Ende entfernen
				rechts = rechts.trim();
				links = links.trim();
				
				// Key / Schlüssel speichern
				keys[z] = links;
				
				// Value / Wert speichern
				values[z] = rechts;
				
				
				//System.out.println("Links : '" + links +"'");
				//System.out.println("Rechts: '" + rechts +"'");
				
				
			}
		}
	}
	
	public String get(String key) {
		
		String value = "";
		
		// Anzahl der Elemente im Keys-Array ermitteln
		int l = keys.length;
		
		// Keys-Array durchsuchen
		for (int i = 0; i < l; i ++) {
			
			// Lies Key an Position i aus
			String k = keys[i];
			
			//Prüfe, ob k = key
			if (key.equalsIgnoreCase(k)) {
				
				// hole den Wert/Value an der Position i
				value = values[i];
				
				//Brich die for-Schleife ab.
				return value;				
			}
			
		} // End For
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	

}
