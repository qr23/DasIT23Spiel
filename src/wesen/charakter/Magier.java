package wesen.charakter;

import spiel.Dice;
import wesen.Charakter;

public class Magier extends Charakter{
	
	public Magier(String name) {
		this.name = name;
		level = 1;
		erfahrung = 0;
		lebenspunkte = 100;
		magiepunkte = 100;
		staerke = 50;
		beweglichkeit = 50;
		intelligenz = 100;
		magAtk = 10;
		angriff = magAtk + intelligenz;
		verteidigung = 5;
		magVert = intelligenz / 25;
	}
	
	public double feuerball() {
		setMagiepunkte(magiepunkte - 10);
		System.out.println("Magiepunkte übrig: " + getMagiepunkte());
		return angriff * 1.5;
		
	}
	
	public int heilen() {
		Dice d = new Dice();
		return magAtk * Dice.wuerfeln(1, 6) ;
	}
	
	
	
	

}
