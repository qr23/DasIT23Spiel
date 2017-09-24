package io.dialog;

import io.tastatur.Tastatur;

public class EingabeDialog{
	
	Dialog dialog;
	
	public EingabeDialog() {
		dialog = new Dialog();
		dialog.zeigeStatusLeisteNichtAn();
	}
	
	public void setTitel(String titel) {
		dialog.setTitel(titel);
	}
	
	public void setInhalt(String inhalt) {
		dialog.setInhalt(inhalt);
	}

	public String run() {
		dialog.anzeigen();
		String eingabe = Tastatur.readKey();
		return eingabe;
	}
}
