package welt;

import welt.feldtyp.FeldTyp;
import wesen.Monster;

public class Feld {
	
	private Monster monster = null;
	private FeldTyp feldTyp = null;
	
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
	
	
	

}
