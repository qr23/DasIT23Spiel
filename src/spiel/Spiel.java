package spiel;

import welt.Welt;
import wesen.Charakter;

/**
 * Vom Spiel soll es nur EINE Instanz geben. daher sind die Funktionen und 
 * Attribute statisch.
 * 
 *
 * 
 */
public class Spiel {
	
	// Die Welt
	private static Welt welt;
	
	// Der SpielerCharakter
	private static Charakter charakter;
	
	/**
	 * Setzt den Charakter ins Spiel
	 * 
	 * @param charakter
	 */
	public static void setCharakter(Charakter c) {
		charakter = c;
	}
	
	/**
	 * Setzt die Welt ins Spiel
	 * 
	 * @param welt
	 */
	public static void setWelt(Welt w) {
		welt = w;
	}
	
	/**
	 * Liefert den Charakter
	 * 
	 * @return
	 */
	public static Charakter getCharakter() {
		return charakter;
	}
	
	/**
	 * Liefert die Welt
	 * 
	 * @return
	 */
	public static Welt getWelt() {
		return welt;
	}
	
	/**
	 * Erzeugt eine neue Welt mit der Kartengröße Breite x Höhe. 
	 * @param breite
	 * @param hoehe
	 */
	public static void kreiereWelt(int breite, int hoehe) {
		welt = new Welt(breite,hoehe);
	}
	
	/**
	 * Erzeugt eine neue Welt mit der festen Kartengröße 10 x 10.
	 */
	public static void kreiereWelt() {
		kreiereWelt(10, 10);;
	}
	
	/**
	 * Beendet das Spiel sofort.
	 */
	public static void stop() {
		System.exit(0);
	}
	
	/*
	 * ***************************************************
	 *  				DEPRECATED-AREA
	 * *************************************************** 
	 */
	
	// Soll das Spiel gestoppt werden?
	/** @deprecated
	 * 	Wird nicht mehr gebraucht
	 */
	private static boolean stop = false;
	
	
	/**
	 * Setzt das Stop-Flag für das Spiel. Die Methode kann aus anderen Klassen 
	 * aufgerufen werden, um ein Stop-Signal zu setzen, das im Hauptprogramm 
	 * abgeprüft wird. 
	 * 
	 * @deprecated Stattdessen die Methode Spiel.stop() verwenden. Damit wird 
	 * 				das Spiel SOFORT beendet. 
	 */
	public static void setStop() {
		Spiel.stop = true;
	}
	
	/**
	 * Prüft, ob das Stop-Flag für das gesamte Spiel gesetzt wurde.
	 * 
	 * @return
	 * 
	 * @deprecated wird nicht mehr gebraucht. Stattdessen die 
	 *  		   Methode Spiel.stop() verwenden.
	 */
	public static boolean isStoped() {
		return Spiel.stop;
	}

	/**
	 * @deprecated wird nicht mehr gebraucht. Stattdessen die 
	 *  		   Methode Spiel.stop() verwenden.
	 */
	public static boolean laeuft() {
		return !Spiel.stop;
	}
	
	

}
