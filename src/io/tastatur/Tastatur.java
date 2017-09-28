package io.tastatur;

import java.util.Scanner;

public class Tastatur {
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * Fragt die Tastatur ab. Wartet auf das Drücken der Enter-Taste.
	 * 
	 * @return Liefert den eingegebenen Text. 
	 */
    public static String readKey(){
        String key;        
        key = scanner.next();        
        
        return key;        
    }
    
}
