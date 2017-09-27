package wesen.charakter;

import wesen.Charakter;

public class Krieger extends Charakter{
	
	public Krieger(String name) {
		level = 1;
		erfahrung = 0;
		lebenspunkte = 150;
		magiepunkte = 0;
		staerke = 100;
		beweglichkeit = 50;
		intelligenz = 50;
		angriff = staerke * 2;
		verteidigung = 10;
		magAtk = 0;
		magVert = intelligenz / 25;
	}
	

}
