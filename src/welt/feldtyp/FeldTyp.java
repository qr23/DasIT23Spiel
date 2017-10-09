package welt.feldtyp;

import spiel.modifikator.Modifikator;
import spiel.modifikator.ModifikatorenListe;

public class FeldTyp {
	
	// Name des FeldTyps (Gebirge, Wasser, ...)
	protected String name = "";
	
	ModifikatorenListe modListe;
	
	
	public FeldTyp() {
		modListe = new ModifikatorenListe();
		this.name = "None";
	}
	
	public void addModifikator(String ziel, int von, int bis) {
		Modifikator m = new Modifikator(ziel, von, bis);
		modListe.add(m);
	}
	
	public ModifikatorenListe getModifikatoren() {
		return modListe;
	}

}
