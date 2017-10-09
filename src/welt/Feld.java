package welt;

import gegenstand.Kraut;
import welt.feldtyp.FeldTyp;
import wesen.Monster;

public class Feld {
	
	private Monster monster = null;
	private FeldTyp feldTyp = null;
	private Kraut kraut = null;
	
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
	
	
	

}
