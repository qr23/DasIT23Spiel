package io.dialog;

import io.buttons.Button;
import io.fenster.Fenster;

public class Dialog {
	
	protected Fenster f;
	
	public Dialog() {
		f = new Fenster();		
	}
	
	/**
	 * Setzte die Breite des DialogFensters in <breite> Zeichen.
	 * 
	 * @param breite Anzahl der Zeichen
	 */
	public void setBreite(int breite) {
		f.setBreite(breite);
	}
	
	public void setTitel(String titel) {
		f.setTitel(titel);
	}
	
	/**
	 * Setzt den Text des DialogFensters OHNE Formatierung. Der Text 
	 * wird einfach umgebrochen. Wird eine strukturierte Ausgabe 
	 * benötigt, kann statt dessen die Funktion 
	 * 
	 * addZeile(zeile)
	 * 
	 * verwendet werden.
	 * 
	 * @param inhalt
	 */
	public void setInhalt(String inhalt) {
		f.setText(inhalt);
	}
	
	/**
	 * Fügt den Inhalt des DialogFensters zeilenweise hinzu. Dies kann
	 * für Tabellen oder Auflistungen hilfreich sein. Dabei ist die 
	 * Breite der Zeile / des Fensters zu beachten.
	 * Für einen Fließtext ist die Funktion
	 * 
	 * setInhalt(inhalt)
	 * 
	 * zu verwenden.
	 * 
	 * @param zeile - eine Zeile
	 */
	public void addZeile(String zeile) {
		f.addTextZeile(zeile);
	}
	
	public void addButton(Button b) {
		f.addButton(b);
	}
	
	public Button run() {
		return f.run();
	}
	
	public void anzeigen() {
		f.anzeigen();
	}
	
	public void zeigeStatusLeisteNichtAn() {
		f.setZeigeStatusLeisteNichtAn();
	}

}
