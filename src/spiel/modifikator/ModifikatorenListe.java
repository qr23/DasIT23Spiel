package spiel.modifikator;

import java.util.ArrayList;

/**
 * Enthält eine Liste mit Modifikatoren. Jeder Modifikator wird über sein Ziel (Staerke, Magie, Angriff, etc.) identifiziert.
 * In einer Liste kann es nur je Ziel einen Modifikator geben.
 * 
 *
 */
public class ModifikatorenListe {
	
	// Die interne Liste mit möglichen Modifikatoren
	private ArrayList<Modifikator> modifikatoren;
	
	
	/**
	 * Konstruktor
	 */
	public ModifikatorenListe() {
		modifikatoren = new ArrayList<>();
	}
	
	
	/**
	 * Fügt einen Modifikator der Liste hinzu, sofern es diesen nicht schon gibt.
	 * "Diesen" meint: einen mit dem selben Ziel!
	 * 
	 * @param modifikator
	 */
	public void add(Modifikator modifikator) {
		
		// Falls es einen Modifikator mit dem selben Ziel schon gibt, tu nix weiter -> ignorieren.
		if (contains(modifikator)) { return; }
		
		modifikatoren.add(modifikator);
	}
	
	/**
	 * Sucht, ob ein Modifikator schon in der Liste vorhanden ist.
	 * Modifikatoren werden anhand ihres Ziels identifiziert.
	 * 
	 * Gibt es bereits einen Modifikator mit einem gleichen Ziel XY, so sind die beiden Modifikatoren gleich.
	 * Sie meinen inhaltliche das gleiche (Staerke, Magie, etc.) 
	 * In einer Liste kann es nur von jedem Ziel einen Modifiaktor geben.
	 *  
	 * @param modifikator
	 * @return true: Modifikator existiert - false: existiert nicht.
	 */
	public boolean contains(Modifikator modifikator) {
		
		for (int i = 0;i<modifikatoren.size();i++) {
			Modifikator m = modifikatoren.get(i);
			
			if (m.getZiel().equalsIgnoreCase(modifikator.getZiel())) {
				return true;
			}
		}
		
		return false;
	}
	
	/**
	 * Liefert die Anzahl der Elemente in der Liste zurück
	 * @return
	 */
	public int size() {
		return modifikatoren.size();
	}
	
	/**
	 * Liefert den Modifikator an der Position index.
	 * @param index
	 * @return
	 */
	public Modifikator get(int index) {
		return modifikatoren.get(index);
	}
	
	/**
	 * Liefert den Modifikator zu einem gegebenen Ziel (Staerke, Magie, etc.) zurück.
	 * je Ziel kann es nur einen Modifikator geben.
	 * @param ziel
	 * @return
	 */
	public Modifikator get(String ziel) {
		
		for (Modifikator m : modifikatoren) {
			if (m.isZiel(ziel)) { return m; }
		}
		
		return null;
	}

}
