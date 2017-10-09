package spiel.dialog;

import io.buttons.Button;
import io.dialog.Dialog;

public class KampfVorschauDialog extends Dialog{
	public KampfVorschauDialog() {
		String titel = "Auswahl des Charakters";
		String zeile = "";
		
		zeile 	= "F) Fliehen ";
		this.addZeile(zeile);
		
		zeile 	= "K) Kämpfen ";
		this.addZeile(zeile);
		
		
		
		
		// CharakterButtons erzeugen
		// Aber nicht anzeigen lassen => Unsichtbar
		Button b = new Button("Kämpfen","K");
		b.setUnsichtbar();
		this.addButton(b);
		
		b = new Button("Fliehen","F");
		b.setUnsichtbar();
		this.addButton(b);
		
		this.setTitel(titel);
	}
}
