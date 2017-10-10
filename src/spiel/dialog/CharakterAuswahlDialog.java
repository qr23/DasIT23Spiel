package spiel.dialog;

import io.buttons.Button;
import io.buttons.JaButton;
import io.buttons.NeinButton;
import io.buttons.ZurueckButton;
import io.dialog.Dialog;
import io.konsole.Konsole;
import spiel.Spiel;
import spiel.ablauf.Intro;

public class CharakterAuswahlDialog extends Dialog{

	public CharakterAuswahlDialog() {
		
		String titel = "Auswahl des Charakters";
		String zeile = "";
		
		zeile 	= "R) Ritter (<Angaben der möglichen Charakterwerte>)";
		this.addZeile(zeile);
		
		zeile 	= "M) Magier (<Angaben der möglichen Charakterwerte>)";
		this.addZeile(zeile);
		
		zeile 	= "S) Schurke (<Angaben der möglichen Charakterwerte>)";
		this.addZeile(zeile);
		
		zeile = "Z) Zurück";
		this.addZeile(zeile);
		
		// CharakterButtons erzeugen
		// Aber nicht anzeigen lassen => Unsichtbar
		Button b = new Button("Ritter","R");
		b.setUnsichtbar();
		this.addButton(b);
		
		b = new Button("Magier","M");
		b.setUnsichtbar();
		this.addButton(b);
		
		b = new Button("Schurke","S");
		b.setUnsichtbar();
		this.addButton(b);
		
		b = new Button("Zurück", "Z");
		b.setUnsichtbar();
		this.addButton(b);
				
				
		if(b.is("ZurückButton")) {
			System.out.println("SHIIIIIIT!");
            Intro.run();
		}
		
		this.setTitel(titel);
	}

}
