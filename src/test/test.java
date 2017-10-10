package test;

import io.buttons.Button;
import io.dialog.Dialog;
import wesen.Wesen;
import wesen.charakter.Krieger;
import wesen.monster.Ork;

public class test extends Wesen{

	public static void main(String[] args) {
		
		Button b = new Button("OK", "O");
		b.setName("OK");
		
		Button b2 = new Button("Abbrechen", "Q");
		b2.setName("OK");
		
		Dialog d = new Dialog();
		d.setTitel("Ein Test");
		d.setInhalt("Hier steht jetzt richtig viel Inhalt!");
		d.addButton(b);
		d.addButton(b2);
		Button antwort = d.run();
		
		System.out.println(antwort.getName());
		
		Krieger k = new Krieger("Die legende Hans");	
		Ork o = new Ork("Tom");
		KmapfTest kampf = new KmapfTest();
		
		kampf.kaempfen(k, o);		
		
		System.out.println(kampf.getSeiger());
		
	}

}
