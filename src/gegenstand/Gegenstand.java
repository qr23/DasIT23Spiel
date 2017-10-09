package gegenstand;

import spiel.modifikator.Modifikator;
import spiel.modifikator.ModifikatorenListe;

public class Gegenstand {
	
	private String name = "";
	ModifikatorenListe modListe;
	
	public Gegenstand() {
		modListe = new ModifikatorenListe();
	}
	
	public Gegenstand(String name) {
		this.name = name;
		modListe = new ModifikatorenListe();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addModifikator(String ziel, int von, int bis) {
		Modifikator m = new Modifikator(ziel, von, bis);
		modListe.add(m);
	}
	
	public ModifikatorenListe getModifikatoren() {
		return modListe;
	}
	
	

}
