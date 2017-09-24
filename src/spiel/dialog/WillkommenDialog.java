package spiel.dialog;

import io.buttons.Button;
import io.buttons.JaButton;
import io.buttons.NeinButton;
import io.dialog.Dialog;

public class WillkommenDialog extends Dialog {
	
	public WillkommenDialog() {
		String titel = "Willkommen";
		String inhalt = "Dies ist das Spiel der IT23. Ein kleines, "
				+ "rundenbasiertes Spiel. Hier treten Ritter, Magier "
				+ "und Elfen gegen Wölfe, Trolle und andere Unholde an."
				+ "Möchtest Du dieses Spiel spielen?";
		
		// Ja und Nein Buttons zufügen 
		Button ja = new JaButton();
		Button nein = new NeinButton();
		this.addButton(ja);
		this.addButton(nein);
		
		this.setTitel(titel);
		this.setInhalt(inhalt);
	}

}
