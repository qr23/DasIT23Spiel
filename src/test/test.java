package test;

import io.dialog.EingabeDialog;

public class test {

	public static void main(String[] args) {
		System.out.println("HW");
		
		EingabeDialog d = new EingabeDialog();
		
		// Objekt = d
		d.setTitel("Name");
		d.setInhalt("Hallo, wie heiﬂt du?");
		
		String eingabe = d.run();
		System.out.println("Hallo " + eingabe);
		
		

	}

}
