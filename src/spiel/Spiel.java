package spiel;

/**
 * Vom Spiel soll es nur EINE Instanz geben. daher sind die Funktionen und 
 * Attribute statisch.
 * 
 * 
 */
public class Spiel {
	
	// Soll das Spiel gestoppt werden?
	private static boolean stop = false;
	
	/**
	 * Setzt das Stop-Flag für das Spiel. Die Methode kann aus anderen Klassen 
	 * aufgerufen werden, um ein Stop-Signal zu setzen, das im Hauptprogramm 
	 * abgeprüft wird. 
	 */
	public static void setStop() {
		Spiel.stop = true;
	}
	
	/**
	 * Prüft, ob das Stop-Flag für das gesamte Spiel gesetzt wurde.
	 * 
	 * @return
	 */
	public static boolean isStoped() {
		return Spiel.stop;
	}

	public static boolean laeuft() {
		return !Spiel.stop;
	}

}
