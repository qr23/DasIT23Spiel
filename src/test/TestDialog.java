package test;

import io.buttons.Button;
import io.dialog.Dialog;
import wesen.charakter.Krieger;

public class TestDialog {
	
	public static void main(String[] args) {
		
		Krieger krieger = new Krieger("Asterix"); 
		
		Button b = new Button("OK","O");
		b.setName("OKButton");
		
		Button b2 = new Button("Abbrechen","A");
		b2.setName("AbbrechenButton");
		
		Dialog d = new Dialog();
		d.setTitel("Ein erster Dialogtest");
		d.setInhalt("Hallo hier kommt ein ganz wichtiger Inhalt rein");
		d.addButton(b);
		d.addButton(b2);
		d.setCharakter(krieger);
		Button antwort = d.run();
		
		//System.out.println(antwort.getName());
		
		if(antwort.getName().equalsIgnoreCase("OKButton")) {
			System.out.println("Du hast auf OK gedrückt");
		}
				
		
	}

}
