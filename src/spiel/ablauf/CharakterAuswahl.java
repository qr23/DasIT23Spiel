package spiel.ablauf;

import io.buttons.Button;
import io.dialog.EingabeDialog;
import io.dialog.JaNeinDialog;
import spiel.dialog.CharakterAuswahlDialog;

public class CharakterAuswahl {
	
	public static void run() {
		Button charakter;
		Button antwort;
		
		do {
			// Welcher Charakter wird gewählt? 
			CharakterAuswahlDialog charAusDialog = new CharakterAuswahlDialog();
			charakter = charAusDialog.run();
		
			String charakterKlasse = "";
			if (charakter.is("Ritter")) {charakterKlasse = "einen Ritter";}
			if (charakter.is("Magier")) {charakterKlasse = "einen Magier";}
			if (charakter.is("Schurke")) {charakterKlasse = "einen Schurken";}
		
			String text = "Du hast Dir " + charakterKlasse + " ausgewählt. "
						+ "Willst Du dabei bleiben?";
			JaNeinDialog frage = new JaNeinDialog("Charakterwahl", text);
			antwort = frage.run();
			
		} while (antwort.is("NeinButton"));
		
		
		EingabeDialog einDialog = new EingabeDialog();
		einDialog.setTitel("Name");
		einDialog.setInhalt("Bitte den Namen für Deinen Charakter festlegen:");
		String name = einDialog.run();
		
		System.out.println("Name: " + name);
		//ToDo: CharakterObjekt zurückgeben!
	}

}
