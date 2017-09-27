package test;

import io.dialog.Dialog;
import io.dialog.EingabeDialog;
import spiel.dice;
import spiel.dialog.KampfVorschauDialog;
import wesen.Wesen;
import wesen.charakter.Krieger;
import wesen.charakter.Magier;

public class test extends Wesen{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Krieger k = new Krieger("Die legende Hans");
		Magier m = new Magier("Kadghar");
		MonsterTest mt = new MonsterTest("Orc");
		Dialog d = new Dialog();
		EingabeDialog ed = new EingabeDialog();
		
		
		
		
		
		//dice dice = new dice();
		//System.out.println(dice.wuerfeln(1,4));
		
		
		
		
		/*KampfVorschauDialog kvd = new KampfVorschauDialog();
		
		kvd.run();*/
		
		//System.out.println(k.getAngriff());
		//System.out.println(k.getName());
		//System.out.println("-------------------------");
		System.out.println(m.getName());
		System.out.println("Feuerball!!! " + m.feuerball()+ " Schaden zugefügt. ");
		System.out.println("Heil mich um "+ m.heilen());
		
		//System.out.println(mt.getLebenspunkte());
		
	}

}
