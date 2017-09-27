package wesen.charakter;

import wesen.Charakter;

public class Schurke extends Charakter{
	
	public Schurke(String name) {
		this.name = name;
		level = 1;
		erfahrung = 0;
		lebenspunkte = 120;
		magiepunkte = 10;
		staerke = 50;
		beweglichkeit = 100;
		intelligenz = 50;
		angriff = beweglichkeit * 2;
		verteidigung = 5;
		magAtk = 0;
		magVert = intelligenz / 25;
	}

}
