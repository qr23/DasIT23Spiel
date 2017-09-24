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
				
		// Wenn auf "Nein" geklickt wurde, beenden
		if (antwort.is("NeinButton")) { Spiel.setStop(); }
				
	}

}
