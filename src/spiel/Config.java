package spiel;

public class Config {
	
	private String[] zeilenArray = new String[20]; 
	
	
	
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
		
		// Anzahl der Elemente im Array
		int l = zeilenArray.length;
				
		// Zeilen durchlaufen
		for (int z = 0; z < l; z++) {
			String zeile = zeilenArray[z];
			
			if (zeile != null) {
				//System.out.println(zeile);
			}
		}
	}
	
	public String get(String key) {
		return "5";
	}
	
	
	
	
	
	
	
	
	
	
	

}
