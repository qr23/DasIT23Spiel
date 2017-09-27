package Welt;



public class Feld {
	
	FeldTyp terrain;
	
	boolean hatSpieler;
	boolean hatMonster;
	
	public Feld (boolean p, boolean m, FeldTyp f) {
		
	
		hatSpieler = p;
		hatMonster = m;
		
		terrain = f;
		
	}
	

}
