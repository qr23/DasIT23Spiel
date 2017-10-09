package welt.feldtyp;

import spiel.modifikator.Modifikator;
import spiel.modifikator.ModifikatorenListe;

public class FeldTyp {
	
	// Name des FeldTyps (Gebirge, Wasser, ...)
	private String name = "";
	
	// Liste von hier heimischen Monstern.
	// Nur diese Monster dürfen hier erscheinen.
	private String listeHeimischerMonster = "";
	
	// Liste von hier wachsenden Kräutern
	// Nur diese Kräuter können hier gefunden werden
	private String listeWachsenderKraeuter = "";
	
	// Liste von hier findbaren Gegenständen
	// Nur diese Gegenstände können hier gefunden werden.
	private String listeFindbarerGegenstaende = ""; 
	
	ModifikatorenListe modListe;
	
	
	public FeldTyp() {
		modListe = new ModifikatorenListe();
		this.setName("None");
	}
	
	public void addModifikator(String ziel, int von, int bis) {
		Modifikator m = new Modifikator(ziel, von, bis);
		modListe.add(m);
	}
	
	public ModifikatorenListe getModifikatoren() {
		return modListe;
	}
	
	public void addHeimischeMonsterListe(String monsterliste) {
		this.listeHeimischerMonster = monsterliste;
	}
	
	public void addWachsendeKraeuterListe(String kraeuterliste) {
		this.listeWachsenderKraeuter = kraeuterliste;
	}

	public void addFindbareGegenstaendeListe(String gegenstandliste) {
		this.listeFindbarerGegenstaende = gegenstandliste; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
