package welt;

import gegenstand.Gegenstand;
import gegenstand.Kraut;
import welt.feldtyp.FeldTyp;
import wesen.Monster;

public class Feld {
	
	private Monster monster = null;
	private FeldTyp feldTyp = null;
	private Kraut kraut = null;
	private Gegenstand gegenstand = null;
	
	public Feld() {
	}
	
	public void setMonster(Monster monster) {
		this.monster = monster;
	}
	
	public Monster getMonster() {
		return this.monster;
	}
	
	public void setFeldTyp(FeldTyp feldType) {
		this.feldTyp = feldType;
	}
	
	public FeldTyp getFeldTyp() {
		return this.feldTyp;
	}

	public Kraut getKraut() {
		return kraut;
	}

	public void setKraut(Kraut kraut) {
		this.kraut = kraut;
	}

	public Gegenstand getGegenstand() {
		return gegenstand;
	}

	public void setGegenstand(Gegenstand gegenstand) {
		this.gegenstand = gegenstand;
	}
	
	
	

}
