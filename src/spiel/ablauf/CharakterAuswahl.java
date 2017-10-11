package spiel.ablauf;

import io.buttons.Button;
import io.dialog.EingabeDialog;
import io.dialog.JaNeinDialog;
import spiel.Spiel;
import spiel.dialog.CharakterAuswahlDialog;
import wesen.Charakter;
import wesen.charakter.Krieger;
import wesen.charakter.Magier;
import wesen.charakter.Schurke;

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
		
		Charakter charakter = null;
		
		//Je nach Auswahl ein CharakterObjekt erstellen ... 
		if (antwort1.is("Ritter")) { charakter = new Krieger(name); }
		if (antwort1.is("Magier")) { charakter = new Magier(name); }
		if (antwort1.is("Schurke")) { charakter = new Schurke(name); }
		
		// ... und speichern
		Spiel.setCharakter(charakter);
		
		
	}
	
	private static void charakterDialogAnzeigen() {
		Button antwort;		

		do {
			// Welcher Charakter wird gewählt? 
			// Erzeugen und starten des CharakterAuswahlDialogs
			CharakterAuswahlDialog charAusDialog = new CharakterAuswahlDialog();
			antwort = charAusDialog.run();
			
			// Hinweis
			// -------
			// im Button 'antwort1' befindet sich der 
			// Button, auf den im Dialogfeld geklickt wurde.
			// Der muss jetzt ausgewertet werden.
			
			// bekommt einen individuellen InfoText zur Anzeige.
			String infoText = "";
			
			// Je nach Auswahl des Charakters den InfoText setzen
			if (antwort.is("Ritter")) {infoText = "einen Ritter";}
			if (antwort.is("Magier")) {infoText = "einen Magier";}
			if (antwort.is("Schurke")) {infoText = "einen Schurken";}
			
			// Ist der ZurückButton gedrückt, Intro starten
			if (antwort.is("ZurückButton")) {Intro.run();}
		
			dialog02();
			
		} while ();
	}
	
	private static void dialog02() {
		// AnzeigeText zusammen bauen.
		String text = "Du hast Dir " + infoText + " ausgewählt. "
					+ "Willst Du dabei bleiben?";
					
		// JaNeinDialog erzeugen und starten.
		JaNeinDialog frage = new JaNeinDialog("Charakterwahl", text);
		antwort2 = frage.run();
		
	}

}
