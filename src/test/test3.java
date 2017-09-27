package test;

import io.buttons.Button;
import io.dialog.Dialog;

public class Test3 {

	public static void main(String[] args) {
		
		Dialog d = new Dialog();
		
		Button okButton = new Button("Ok", "o");
		
		d.addButton(okButton);
		d.setTitel("ENDE");
		d.setInhalt("Du hast verkackt Heiko!");

		d.run();
	}
	
}
