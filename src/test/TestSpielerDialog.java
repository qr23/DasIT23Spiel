package test;

import io.dialog.Dialog;
import wesen.charakter.Krieger;

public class TestSpielerDialog {

	public static void main(String[] args) {
		
		
		Krieger krieger = new Krieger("Asterix");
				
		Dialog d = new Dialog();
		d.setTitel("Dies ist ein Test");
		d.setCharakter(krieger);
		
		d.run();

	}

}
