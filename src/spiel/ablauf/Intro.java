package spiel.ablauf;

import io.buttons.Button;
import io.konsole.Konsole;
import spiel.Spiel;
import spiel.dialog.WillkommenDialog;

public class Intro {
	
	public static void run() {
		// Konsole putzen ;) 
		Konsole.putzen();
				
		WillkommenDialog willkommenDialog = new WillkommenDialog();
		Button antwort = willkommenDialog.run();
				
		// Wenn auf "Beenden" geklickt wurde, beenden
		if (antwort.is("QuitButton")) { Spiel.setStop(); }
		if (antwort.is("NeuButton")) { CharakterAuswahl.run(); }
				
	}

}
