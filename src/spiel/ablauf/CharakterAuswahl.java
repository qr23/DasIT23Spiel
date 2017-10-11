package spiel.ablauf;

import io.buttons.Button;
import io.buttons.ZurueckButton;
import io.dialog.EingabeDialog;
import io.dialog.JaNeinDialog;
import spiel.dialog.CharakterAuswahlDialog;

public class CharakterAuswahl {
	
	public static void run() {
		Button antwort1;
		Button antwort2;

		do {
			// Welcher Charakter wird gewählt? 
			// Erzeugen und starten des CharakterAuswahlDialogs
			CharakterAuswahlDialog charAusDialog = new CharakterAuswahlDialog();
			antwort1 = charAusDialog.run();
			
			// Hinweis
			// -------
			// im Button 'antwort1' befindet sich der 
			// Button, auf den im Dialogfeld geklickt wurde.
			// Der muss jetzt ausgewertet werden.
			
			// bekommt einen individuellen InfoText zur Anzeige.
			String infoText = "";
			
			// Je nach Auswahl des Charakters den InfoText setzen
			if (antwort1.is("Ritter")) {infoText = "einen Ritter";}
			if (antwort1.is("Magier")) {infoText = "einen Magier";}
			if (antwort1.is("Schurke")) {infoText = "einen Schurken";}
			
			// Ist der ZurückButton gedrückt, Intro starten
			if (antwort1.is("ZurückButton")) {Intro.run();}
			
			// AnzeigeText zusammen bauen.
			String text = "Du hast Dir " + infoText + " ausgewählt. "
						+ "Willst Du dabei bleiben?";
			
			// JaNeinDialog erzeugen und starten.
			JaNeinDialog frage = new JaNeinDialog("Charakterwahl", text);
			antwort2 = frage.run();
			
			// Hinweis
			// -------
			// im Button 'antwort2' befindet sich der 
			// Button, auf den im Dialogfeld geklickt wurde.
			// Der muss jetzt ausgewertet werden.
			// Hier als Bedingung in der While-Schleife.			
			
		} while (antwort2.is("NeinButton"));
		
		
		// Einen EingabeDialog erzeugen ...
		EingabeDialog einDialog = new EingabeDialog();
		
		// ... den Titel setzen ...
		einDialog.setTitel("Name");
		
		// ... den Inhalt setzen ...
		einDialog.setInhalt("Bitte den Namen für Deinen Charakter festlegen:");
		
		// ... und starten.
		String name = einDialog.run();
		
		System.out.println("Name: " + name);
		
		
		//ToDo: CharakterObjekt zurückgeben!
	}

}
