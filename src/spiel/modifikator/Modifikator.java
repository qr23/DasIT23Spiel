package spiel.modifikator;

import spiel.Dice;
import spiel.Wuerfel;

/**
 * Ein Modifikator enthält Angaben, wie ein Wert modifiziert werden kann.
 * Es gibt diverse Modifikatoren: Staerke, Angriff, Verteidigung, etc.
 * Modifikatoren sind zum Beispiel bei einem Geländetyp, bei Waffen oder 
 * Ausrüstung zu finden.
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
 *
 */
public class Modifikator {
	
	>>>>>
	Ist ein Modifikator ein fester Wert (7 oder 12, oder 3)?
	Oder geht das ganze Prozentual? (10%)
	>>>>
	
	private float von = 0;
	private float bis = 0;
	private String ziel="";
	
	/**
	 * Erzeugt einen Modifikator. Modifikatoren werden anhand ihres Ziels identifiziert.
	 * 
	 * @param ziel Was soll beeinflusst werden? z.B. Staerke, Magie, ChanceAufMonster, etc.
	 * @param von StartWert
	 * @param bis StopWert
	 */
	public Modifikator(String ziel, float von, float bis) {
		this.von = von;
		this.bis = bis;
		this.ziel = ziel;
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
		>>>>>>>>
		eigentlich werden INTs zum Würfeln gebraucht. 
		aber eigentlich wäre es schön die Modifikatoren in Prozent (0.25) anzugeben
		=> Staerke wird um 25% erhöht.
		>>>>>>>>
		return Wuerfel.werfen(von, bis);
	}

}
