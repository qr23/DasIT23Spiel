package spiel.ablauf;

import io.buttons.Button;
import io.konsole.Konsole;
import spiel.Spiel;
import spiel.dialog.WillkommenDialog;

public class Intro {
	
	public static void run() {
		// Konsole putzen ;) 
		Konsole.putzen();

		// WillkommensDialog erzeugen und starten
		WillkommenDialog willkommenDialog = new WillkommenDialog();
		Button antwort = willkommenDialog.run();
		
		// Hinweis
		// -------
		// im Button 'antwort' befindet sich der 
		// Button, auf den im Dialogfeld geklickt wurde.
		// Der muss jetzt ausgewertet werden.
				
		// Wenn auf "Beenden" geklickt wurde, beenden.
		if (antwort.is("QuitButton")) { Spiel.stop(); }
		
		// Wenn auf "Neues Spiel" geklickt wurde, soll 
		// die CharakterAuswahl gestartet werden.
		if (antwort.is("NeuButton")) { CharakterAuswahl.run(); }
				
	}

}
