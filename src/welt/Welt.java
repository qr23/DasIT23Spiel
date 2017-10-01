package welt;

public class Welt {
	
	int breite;
	int hoehe;
	
	Feld[][] karte;
	
	public Welt (int x, int y) {
		
		
		karte = new Feld[x][y];
		
		for (int i=0; i<x; i++) {
			
			for (int k=0; k<y; k++) {
				karte[i][k] = new Feld();
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
