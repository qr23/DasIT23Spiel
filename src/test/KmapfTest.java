package test;

import spiel.Dice;
import wesen.Charakter;
import wesen.Monster;
import wesen.Wesen;

public class KmapfTest {
	
	Wesen sieger;
	
	public Wesen kaempfen(Wesen w1, Wesen w2) {
		
		while ((w1.getLebenspunkte() > 0) && (w2.getLebenspunkte()) > 0) {
			int w1lp = w1.getLebenspunkte();
			int w2lp = w2.getLebenspunkte();
			int w1atk = w1.getAngriff();
			int w2atk = w2.getAngriff();
			int w1ver = w1.getVerteidigung();
			int w2ver = w2.getVerteidigung();
			Dice w = new Dice();
			int w1z = w.wuerfeln(4, 20);
			int w1sch = w1atk + w1z;
			int w2z = w.wuerfeln(4, 20);
			int w2sch = w2atk + w2z;
			System.out.println(w1sch);
			System.out.println(w2sch);
			
			if (w1sch > w2sch) {
				w2lp = w2lp - (w1sch - w2ver);
				w2.setLebenspunkte(w2lp);
			} else {
				w1lp = w1lp - (w2sch - w1ver);
				w1.setLebenspunkte(w1lp);
			}
			
			System.out.println("Krieger LP: " + w1lp);
			System.out.println("Ork LP: " + w2lp);
		}
		
		if (w1.getLebenspunkte() <= 0) {
			sieger = w2;
		} else {
			sieger = w1;
		}
		
		return sieger;
	}
	
	public void setSieger(Wesen sieger) {

		this.sieger = sieger;
	}
	
	public Wesen getSeiger() {
		return sieger;
	}

}
