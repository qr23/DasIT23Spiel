package wesen.monster;

import wesen.Monster;

public class Ork extends Monster {
	
	public Ork (String name) {
		this.name = name;
		level = 1;
		erfahrung = 0;
		lebenspunkte = 500;
		magiepunkte = 0;
		angriff =  200;
		verteidigung = 100;
		magAtk = 0;
		magVert = 5;
		
	}
			
}
