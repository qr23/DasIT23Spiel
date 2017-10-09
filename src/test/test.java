package test;

import wesen.Wesen;
import wesen.charakter.Krieger;
import wesen.monster.Ork;

public class test extends Wesen{

	public static void main(String[] args) {
		
		Krieger k = new Krieger("Die legende Hans");	
		Ork o = new Ork("Tom");
		KmapfTest kampf = new KmapfTest();
		
		kampf.kaempfen(k, o);		
		
		System.out.println(kampf.getSeiger());
		
	}

}
