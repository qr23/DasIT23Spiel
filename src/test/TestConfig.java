package test;

import spiel.Config;

public class TestConfig {

	public static void main(String[] args) {
		String[] fileline = new String[20];
		
		fileline[0] = 	"# Maximale Breite der Dialogfenster";		
		fileline[1] = 	"MaxDialogBreite = 81";
		fileline[2] = 	"";
		fileline[3] = 	"# Maximale Zahl möglicher Monster pro Feld";
		fileline[4] = 	"MaxMonsterProFeld = 1";
		fileline[5] = 	"";
		fileline[6] = 	"# Maximale Zahl möglicher Kräuter pro Feld";
		fileline[7] = 	"MaxKraeuterProFeld = 1";
		fileline[8] = 	"";
		fileline[9] = 	"# Schwierigkeit des Spiels";
		fileline[10] = 	"# 0: ganz leicht -> kaum Monster";
		fileline[11] = 	"# 1: leicht -> wenig Monster";
		fileline[12] = 	"# 2: normal -> normale Monster";
		fileline[13] = 	"# 3: schwer -> viele Monster";
		fileline[14] = 	"# 4: sehr schwer -> sehr viele Monster";
		fileline[15] = 	"Schwierigkeit = 4";
		
		
		Config config = new Config();
		
		config.setZeilen(fileline);
		config.verarbeite();
		
		String wert = config.get("MaxDialogBreite");
		
		
		System.out.println("Wert: " + wert);
		
		
		
		/* ZIEL
		 * ======================
		 * 
		 * Config config = new Config();
		 * ...
		 * ...
		 * int breite = config.getInt("MaxDialogBreite");
		 * int monsterZahl = config.get("MaxMonsterProfeld");
		 * int schwierigkeit =  config.get("SchwierigkEit");
		 * 
		 * // Gibt 81 aus
		 * System.out.println("Breite Dialog 		: " + breite);
		 * 
		 * // Gibt 1 aus
		 * System.out.println("MaxMonster im Feld 	: " + monsterZahl);
		 * 
		 * // Gibt 4 aus
		 * System.out.println("Schwierigkeit 		: " + schwierigkeit); 
		 * 
		 * 
		 */
		
		

	}

}
