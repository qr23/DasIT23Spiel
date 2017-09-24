package spiel.dialog;

import io.buttons.Button;
import io.buttons.JaButton;
import io.buttons.NeinButton;
import io.dialog.Dialog;

public class CharakterAuswahlDialog extends Dialog{

	public CharakterAuswahlDialog() {
		String titel = "Auswahl des Charakters";
		String zeile = "";
		
		zeile 	= "R) Ritter (<Angaben der möglichen Charakterwerte>)";
		this.addZeile(zeile);
		
		zeile 	= "M) Magier (<Angaben der möglichen Charakterwerte>)";
		this.addZeile(zeile);
		
		zeile 	= "E) Elf (<Angaben der möglichen Charakterwerte>)";
		this.addZeile(zeile);
		
		zeile 	= "F) Fee (<Angaben der möglichen Charakterwerte>)";
		this.addZeile(zeile);
		
		zeile 	= "H) Hexe (<Angaben der möglichen Charakterwerte>)";
		this.addZeile(zeile);
		
		// CharakterButtons erzeugen
		// Aber nicht anzeigen lassen => Unsichtbar
		Button b = new Button("Ritter","R");
		b.setUnsichtbar();
		this.addButton(b);
		
		b = new Button("Magier","M");
		b.setUnsichtbar();
		this.addButton(b);
		
		b = new Button("Elf","E");
		b.setUnsichtbar();
		this.addButton(b);
		
		b = new Button("Fee","F");
		b.setUnsichtbar();
		this.addButton(b);
		
		
		b = new Button("Hexe","H");
		b.setUnsichtbar();
		this.addButton(b);
		
		
		
		this.setTitel(titel);

	}

}
