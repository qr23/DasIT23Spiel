package spiel;


import java.util.Random;

public class Wuerfel {
    

	/**
	 * Würfelt eine Zahl zwischen 0 und Augenzahl.
	 * 
	 * @param augenzahl
	 * @return eine zufällige Zahl
	 */
	public static int werfen(int augenzahl){
		return werfen(0,augenzahl);
	}
  
	/**
	 * Würfelt eine Zahl zwischen <minimum> und <maximum>
	 * 
	 * @param minimum
	 * @param maximum
	 * @return
	 */
    public static int werfen(int minimum, int maximum){
                
        int zahl=-1;
        
        Random r = new Random();
        
        while (zahl < minimum){
            zahl = r.nextInt(maximum+1);
        }
                
        return zahl;
    }	

}
