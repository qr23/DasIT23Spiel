package io.dialog;
import io.buttons.Button;
import io.dialog.Dialog;

public class TestDialog {
	public static void main(String[] args) {
		Button b = new Button("OK","O");
		b.setName("OKButton");
		
		Button b2 = new Button("Abbrechen", "A");
		b2.setName("AbbrechenButton");
		
		Dialog d = new Dialog();
		d.setTitel("Ein erster Dialogtest");
		d.setInhalt("Inhalt und so");
		d.addButton(b);
		d.addButton(b2);
		Button antwort = d.run();
		
		System.out.println(antwort.getName());
		
		if(antwort.getName().equalsIgnoreCase("OKButton")) {
			System.out.println("Du hast auf OK gedrückt");
		}
	}
	
}
