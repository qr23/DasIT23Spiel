package spiel.modifikator;

import java.util.ArrayList;

public class ModifikatorenListe {
	
	private ArrayList<Modifikator> modifikatoren;
	
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
		
		// Falls so ein Modifikator schon gibt, tu nix weiter -> ignorieren.
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
	
	public Modifikator get(int index) {
		return modifikatoren.get(index);
	}

}
