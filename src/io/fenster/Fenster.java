package io.fenster;

import java.util.ArrayList;

import io.buttons.Button;
import io.konsole.Konsole;
import io.konsole.Zeile;
import io.tastatur.Tastatur;

/**
 *  Fenster f = new Fenster();
 *  f.setTitel("Titel");
 *  Button ok = new Button("OK", "ok");
 *  f.addButton(ok);
 *  f.setText("Ein Text ...");
 *  
 *  f.run();
 * 
 */
public class Fenster {
	
	private boolean zeigeStatus = true;
	private String titel = "Kein Titel";
    private String untertitel = "Kein Untertitel";
    private String text = "";
    private ArrayList<String> zeilen;
        
    private int breite = 61;
    private Zeile line = new Zeile();
    
    private ArrayList<Button> buttons;
    

    public Fenster(){
        line.setWidth(breite);
        buttons = new ArrayList<>();
        zeilen = new ArrayList<>();
    }
    
    public void setBreite(int breite) {
    	this.breite = breite;
    	line.setWidth(breite);
    }
    
    public void setTitel(String titel){
        this.titel = titel;
    }
    
    public void setUnterTitel(String text){
        this.untertitel = titel;
    }
    
    public void setText(String text){
        this.text = text;
    }
    
    public void addTextZeile(String text){
        zeilen.add(text);
    }
    
    public void addButton(Button b){
        buttons.add(b);
    }
    
    public Button run(){
        
        Button buttonPressed = null;
        boolean noButtonPressed = true;
        String eingabe = "";
               
        while (noButtonPressed){
            anzeigen();
            eingabe = Tastatur.readKey();
            
            buttonPressed = getButtonGedrueckt(eingabe);
            
            if (buttonPressed != null ) { noButtonPressed = false; }
            
        }
        return buttonPressed;
    }
    
    public void anzeigen(){
        Konsole.putzen();
        zeigeKleineTitelLeiste(titel);
        
        if (text.isEmpty()) {
            //.... die einzelnen Zeilen auslesen und der Reihe nach darstellen ...
            zeigeTextZeilen();
        } else {
            zeigeText(text);
        }
        zeigeButtons();
        zeigeStatusLeiste();       
        line.drawBottomLine();
    }
    
    public void setZeigeStatusLeisteAn() {
    	this.zeigeStatus = true;
    }
    
    public void setZeigeStatusLeisteNichtAn() {
    	this.zeigeStatus = false;
    }
    
    private void zeigeGroßeTitelLeiste(String titel, String untertitel){
        line.drawTopLine();
        line.drawCenterText(titel.toUpperCase());
        line.drawCenterText(untertitel);
        line.drawBoldMiddleLine();
    }

    private void zeigeKleineTitelLeiste(String titel){
        line.drawTopLine();
        line.drawCenterText(titel);
        line.drawBoldMiddleLine();
    }
    
    private void zeigeText(String text){
        line.drawLeftText(text);
    }
    
    private void zeigeTextZeilen(){
        String zeile ="";
        
        int count = zeilen.size();
        
        for (int i=0; i < count; i++){
            zeile = zeilen.get(i);
            if (zeile.equalsIgnoreCase("--")) {
                line.drawMiddleLine();
            } else if (zeile.equalsIgnoreCase("----")) {
                line.drawBoldMiddleLine();
            } else {
                line.drawLeftText(zeile);
            }
        }
        
    }
    
    private void zeigeButtons(){
        
    	// Wenn kein Button zu sehen ist, muss auch nix angezeigt werden.
    	if (isKeinButtonSichtbar()) { return; }
        
    	// Wieviele Buttons gibt es?
        int count = buttons.size();
        
       // Wenn kein Button da ist, dann abbrechen und nix anzeigen. 
        if (count == 0) { return;}
        
        line.drawMiddleLine();
        String buttontext = "";
        for (int i=0; i < count; i++){
            Button b = buttons.get(i);
            
            // Wenn der Button nicht angezeigt werden soll, zum nächsten 
            if (b.isUnsichtbar()) { continue; }
            
            buttontext = buttontext + b.getTitle();
            if (i < count-1) { buttontext = buttontext + "  "; }
        }
        line.drawCenterText(buttontext);
    }
    
    private void zeigeStatusLeiste(){
    	
    	if (!this.zeigeStatus) { return; }
        line.drawMiddleLine();        
    }
    
    private boolean pruefeObButtonGedrueckt(String eingabe){
        
        int count = buttons.size();
        
        for (int i = 0; i < count; i++){
            Button b = buttons.get(i);
            String key = b.getKey();
            if (eingabe.equalsIgnoreCase(key)) {return true; }
        }
        
        return false;
    }
    
    
    private Button getButtonGedrueckt(String eingabe){
        
        int count = buttons.size();
        
        for (int i = 0; i < count; i++){
            Button b = buttons.get(i);
            String key = b.getKey();
            if (eingabe.equalsIgnoreCase(key)) {return b; }
        }
        
        return null;
    }
    
    private boolean isKeinButtonSichtbar() {
    	boolean result = true;
    	int count = buttons.size();
        
        for (int i = 0; i < count; i++){
            Button b = buttons.get(i);
            if (b.isSichtbar()) { return false; } 
        }
        
        return result;
    }
}
