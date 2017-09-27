package test;

import io.buttons.Button;
import io.dialog.Dialog;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Dialog = Interaktion mit User
		Dialog d = new Dialog();
		
		Button okButton = new Button("OK","o");
		
		d.addButton(okButton);
		d.setTitel("ENDE");
		d.setInhalt("Du bist gestorben.");
		
		d.run();

	}

}
