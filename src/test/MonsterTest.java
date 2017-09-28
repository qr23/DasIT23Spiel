package test;

import wesen.Wesen;

public class MonsterTest extends Wesen {
	public MonsterTest(String name) {
		this.name = name;
		level = 1;
		erfahrung = 0;
		lebenspunkte = 120;
		magiepunkte = 100;
		magAtk = 10;
		angriff = 30;
		verteidigung = 5;
		magVert = 5;
	}
}
