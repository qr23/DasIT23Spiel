package test;

import io.dialog.EingabeDialog;

public class TestKlasse {

	public static void main(String[] args) {
		System.out.println("Jo!");

		EingabeDialog d = new EingabeDialog();
		
		d.setTitel("Name");
		d.setInhalt("Was geht Brudi wie heiﬂt du Digga");
		
		String eingabe = d.run();
		System.out.println("Hallo " + eingabe);
		
	}
	
}
