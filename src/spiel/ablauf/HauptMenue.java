package spiel.ablauf;

import io.buttons.Button;
import spiel.Spiel;
import spiel.dialog.HauptMenueDialog;

public class HauptMenue {
	
	public static void run() {
		HauptMenueDialog hauptMenueDialog = new HauptMenueDialog();
		Button auswahl;
		
		// Welche Aktion wird gewählt 		
		auswahl = hauptMenueDialog.run();
		System.out.println("Auswahl: " + auswahl.getName());
		if (auswahl.isName("Wandern")) {}
		
		if (auswahl.isName("Beenden")) { Spiel.setStop(); }
	}

}
