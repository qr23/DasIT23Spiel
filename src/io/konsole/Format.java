package io.konsole;

public class Format {
	
	/**
	 * Zeigt einen Integerwert als String mit fester Stellen- bzw.
	 * Zeichenzahl an. Benötigt die Zahl weniger als die gegebenen 
	 * Stellen, wird der Rest mit führenden Nullen aufgefüllt.
	 *   
	 * D.h. eine 1 wird unter Umständen zu 001. Oder eine 10 
	 * zu 0010
	 *  
	 * @param zahl Die dargestellt werden soll.
	 * @param count die Anzahl der festen Stellen. (2..4..7)
	 * 
	 * @return der formatierte String
	 */
	public static String show(int zahl, int count) {
		
		String result = "";
		
		int stellenZahl = 0;
		int fehlendeNullen = 0;
		
		if (zahl < 10000000 ) 	{ stellenZahl = 7; }
		if (zahl < 1000000 ) 	{ stellenZahl = 6; }
		if (zahl < 100000 ) 	{ stellenZahl = 5; }
		if (zahl < 10000 ) 		{ stellenZahl = 4; }
		if (zahl < 1000 ) 		{ stellenZahl = 3; }
		if (zahl < 100 ) 		{ stellenZahl = 2; }
		if (zahl < 10 ) 		{ stellenZahl = 1; }
		
		fehlendeNullen = count - stellenZahl;
		if (fehlendeNullen < 0 ) {fehlendeNullen = 0;}
		
		for (int i = 0; i < fehlendeNullen; i++) {
			result = result + " "; 
		}
		
		result = result + zahl;
		
		
		return result;
	}

}
