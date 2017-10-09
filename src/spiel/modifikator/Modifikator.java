package spiel.modifikator;

import spiel.Wuerfel;

/**
 * Ein Modifikator enthält Angaben, wie ein Wert modifiziert werden kann.
 * Es gibt diverse Modifikatoren: Staerke, Angriff, Verteidigung, etc.
 * Modifikatoren sind zum Beispiel bei einem Geländetyp, bei Waffen oder 
 * Ausrüstung zu finden.
 * 
 * 	 Jeder Modifikator wird einem Ziel zugewiesen, das er verändern soll.
 *   Das Ziel kann sein:
 *   - Staerke
 *   - Magie
 *   - Angriff
 *   - Verteidigung
 *   - etc.
 * 
 *   Ein Modifikator enthält die Werte:
 *   
 *   Von: Startwert 
 *   Bis: Endwert 
 *   
 *   In diesem Rahmen können sich die Modifizierten Werte bewegen.
 *   Durch den Von-Bis-Bereich kann per Zufall ein konkreter Wert
 *   ermittelt werden. Damit ist ein Modifikator in gewissem Rahmen
 *   (von -> bis) variabel.
 *   
 *   Wenn sich die Werte im Bereich 0 .. 100 bewegen, können die 
 *   Werte als Prozentangabe interpretiert werden. 
 * 
 *
 */
public class Modifikator {
	
	private int von = 0;
	private int bis = 0;
	private String ziel="";
	
	/**
	 * Erzeugt einen Modifikator. Modifikatoren werden anhand ihres Ziels identifiziert.
	 * 
	 * @param ziel Was soll beeinflusst werden? z.B. Staerke, Magie, ChanceAufMonster, etc.
	 * @param von StartWert
	 * @param bis StopWert
	 */
	public Modifikator(String ziel, int von, int bis) {
		this.von = von;
		this.bis = bis;
		this.ziel = ziel;
	}
	
	/**
	 * Prüft, ob ein gegebenes Ziel mit dem internen Ziel des Modifikators übereinstimmt.
	 * 
	 * @param ziel
	 * @return true, wenn das Ziel übereinstimmt
	 */
	public boolean isZiel(String ziel) {
		return this.ziel.equalsIgnoreCase(ziel);
	}
	
	public String getZiel() {
		return ziel;
	}
	
	public float getVon() {
		return von;
	}
	
	public float getBis() {
		return bis;
	}
	
	/**
	 * Liefert eine zufälligen Wert im Bereich Von - Bis.
	 * 
	 * @return
	 */
	public int getWert() { 	
		return Wuerfel.werfen(von, bis);
	}

}
