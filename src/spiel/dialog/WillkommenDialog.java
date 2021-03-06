package spiel.dialog;

import io.buttons.Button;
import io.buttons.JaButton;
import io.buttons.NeinButton;
import io.dialog.Dialog;

public class WillkommenDialog extends Dialog {
	
	public WillkommenDialog() {
		String titel = "Hauptmenu";
		
		Button neuButton = new Button("Neues Spiel", "N");
		neuButton.setName("NeuButton");
		Button menuButton = new Button("Menu", "M");
		menuButton.setName("MenuButton");
		Button quitButton = new Button("Beenden", "Q");
		quitButton.setName("QuitButton");
		this.addButton(neuButton);
		this.addButton(menuButton);
		this.addButton(quitButton);
		
		this.setTitel(titel);
		this.addZeile("");
		this.addZeile("           888888ba                       dP d888888P   d8888b. d8888b.    .d88888b           oo          dP");
		this.addZeile("           88    `8b                      88    88          `88     `88    88.     '                      88");
		this.addZeile("           88     88 .d8888b. .d8888b.    88    88       .aaadP'  aaad8'   `Y88888b. 88d888b. dP .d8888b. 88");
		this.addZeile("           88     88 88'  `88 Y8ooooo.    88    88      88'         `88          `8b 88'  `88 88 88ooood8 88");
		this.addZeile("           88    .8P 88.  .88       88    88    88      88.         .88     d8'  .8P 88.  .88 88 88.  ... 88");
		this.addZeile("           8888888P  `88888P8 `88888P'    dP    dP      Y88888P d88888P     Y88888P  88Y888P' dP `88888P' dP");
		this.addZeile("                                                                                     88                     ");
		this.addZeile("                                                                                     dp                     ");
		this.addZeile("");
	}

}
