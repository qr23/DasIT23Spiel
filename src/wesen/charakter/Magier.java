package wesen.charakter;

import wesen.Charakter;

public class Magier extends Charakter{
	
	public Magier(String name) {
		level = 1;
		erfahrung = 0;
		lebenspunkte = 100;
		magiepunkte = 100;
		staerke = 50;
		beweglichkeit = 50;
		intelligenz = 100;
		magAtk = 10;
		angriff = magAtk * intelligenz;
		verteidigung = 5;
		magVert = intelligenz / 25;
	}

}
