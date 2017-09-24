package io.dialog;

import io.buttons.Button;
import io.buttons.JaButton;
import io.buttons.NeinButton;

public class JaNeinDialog extends Dialog {
	
	public JaNeinDialog(String titel, String text) {
				
		// Ja und Nein Buttons zufügen 
		Button ja = new JaButton();
		Button nein = new NeinButton();
		this.addButton(ja);
		this.addButton(nein);
				
		this.setTitel(titel);
		this.setInhalt(text);
	}
}
