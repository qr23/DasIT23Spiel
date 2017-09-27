package wesen.monster;

// import wesen.Monster;
import wesen.Wesen;

public class Troll extends Wesen{
	
	// Monsterkonstruktor reinholen
	
	public Troll(String name){ // Konstructormethode
		
		// Bei jedem aufruf passieren soll
		this.name = name;
		this.setLebenspunkte(20);
		this.setMagiepunkte(25);
		this.setErfahrung(20);
		this.setLevel(1);		
		this.setAngriff(10);
		this.setVerteidigung(20);		
		this.setMag_Vert(10);		
		this.setMag_Atk(15);		
		
	}
	
	
	
	
	
	

	
	

}
