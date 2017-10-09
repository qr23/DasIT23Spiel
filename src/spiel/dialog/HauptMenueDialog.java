package spiel.dialog;

import io.buttons.Button;
import io.dialog.Dialog;

public class HauptMenueDialog extends Dialog{
	
	public HauptMenueDialog() {
		
		String titel = "Hauptmenü";
		String zeile = "";
		
		zeile 	= "C) Charakterbogen anzeigen";
		this.addZeile(zeile);
		
		zeile 	= "W) Wandern";
		this.addZeile(zeile);
		
		zeile 	= "------------------------";
		this.addZeile(zeile);
		
		zeile 	= "B) Spiel beenden";
		this.addZeile(zeile);
		
		// Buttons erzeugen
		// Aber nicht anzeigen lassen => Unsichtbar
		Button b = new Button("Charakterbogen","C");
		b.setUnsichtbar();
		this.addButton(b);
		
		b = new Button("Wandern","W");
		b.setUnsichtbar();
		this.addButton(b);
		
		b = new Button("Beenden","B");
		b.setUnsichtbar();
		this.addButton(b);
		
		this.setTitel(titel);
	}

}
