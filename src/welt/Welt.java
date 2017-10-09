package welt;
import welt.Feld;
import welt.feldtyp.FeldTyp;
import welt.feldtyp.Wald;
import wesen.Monster;
import wesen.monster.Ork;

public class Welt {
	
	int breite;
	int hoehe;
	
	Feld[][] karte;
	
	public Welt (int x, int y) {
		
		
		karte = new Feld[x][y];
		
		for (int i=0; i<x; i++) {
			
			for (int k=0; k<y; k++) {
				Feld f = new Feld();
				
				FeldTyp ftyp = new Wald();
				ftyp.addModifikator("Bewegung", -5, -3);
				ftyp.addModifikator("Verteidigung", 8, 10);
				
				f.setFeldTyp(ftyp);
				
				Monster m = new Ork("Wurgtz");
				f.setMonster(m);
							
				
				karte[i][k] = f;
				
			}
		}
		
	}
	
	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}
	
	public int getHoehe() {
		return hoehe;
	}
	
	public void setBreite(int breite) {
		this.breite = breite;
	}
	
	public int getBreite() {
		return breite;
	}
	
	

	
}
