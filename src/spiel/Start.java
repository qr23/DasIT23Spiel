package spiel;
import spiel.ablauf.CharakterAuswahl;
import spiel.ablauf.HauptMenue;
import spiel.ablauf.Intro;
import welt.Welt;

/**
 * 
 * Die Start-Klasse. Hier beginnt das Spiel.
 *
 */
public class Start {

	
	public static void main(String[] args) {
		
				
		//System.out.println("OS: " + System.getProperty( "os.name" ));
		// Intro starten
		Intro.run();
		
		
		
		// Welt generieren
		// ToDo: Größe der Welt abfragen
		Spiel.kreiereWelt(20,10);
		
		
		// Haupt-Schleife des Spiels - der große Spielablauf
		do {
			// HauptMenü bearbeiten
			HauptMenue.run();
			
			// weitere Schritte ausführen ...
			
			// weitere Schritte ausführen ...
			
			// Temp. zum Verhindern einer Endlos-Schleife
			//Spiel.setStop();
			
		} while (Spiel.laeuft());
		
		System.out.println("Spiel wurde beendet.");

	}

}
