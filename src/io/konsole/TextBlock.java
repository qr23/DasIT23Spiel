package io.konsole;


import java.util.ArrayList;

/**
 * Ist ein Text, der zeilenweise durchlaufen werden kann. Kurze Zeilen werden 
 * auf die volle Zeilenlänge mit Space aufgefüllt.
 * 
 */
public class TextBlock {
    
    private String text;
    private int lineWidth;
    private ArrayList<String> zeilen;
    private int currentLineNr = 0;
    
    public TextBlock(String text, int lineWidth){
        this.text = text;
        this.lineWidth = lineWidth;
        
        zeilen = new ArrayList<>();
        splitText();
    }
    
    public boolean hasNextLine(){
        int len = zeilen.size();
        if (len > currentLineNr) { return true; }
        return false;
    }
    
    public String nextLine(){
        String zeile =  zeilen.get(currentLineNr);
        currentLineNr++;
        return zeile;
    }
    
    /**
     * Zerteilt den großen Text in einzelne Zeilen der gegebenen Zeilenlänge/breite. 
     * Die einzelnen Zeilen werden im Array "zeilen" gespeichert.
     */
    private void splitText(){
        
        // Wie lang ist der gesamte Text?
        int len = this.text.length();
        
        // ist der Text evtl. gar kleiner als die Zeilenlänge?
        // Wenn ja, dann muss der Text mit Leerzeichen aufgefüllt werden.
        if (len < this.lineWidth) {
            // Die Differenz aus Zeilenbreite (Länge) und Länge des ganzen Textes
            // ergibt die Zahl der fehlenden Zeichen.
            int count = this.lineWidth - len;
            
            // Füge dem Text Leerzeichen hinzu.
            this.text = addSpaces(this.text,count);
            
            // aktuele Länge
            len = this.text.length();
        }
        
        // Erfüllte Bedingung: 
        // der Text ist mindestens eine VOLLE Zeile lang. 
        // Also:  text.lenght() >= lineWidth
        
        
        // aktuelle Zeilennummer, die gerade bearbeiet wird. Beginn bei 1.
        int currentLine = 1;
        
        // Trenne den Text alle X Zeichen auf und speichere diese in den einzelnen
        // feldern eines Arrays (zeilen). X ist gegeben über die Zeilenlänge (Breite).
        
        // Vars werden in der Abbruchbedingung der kommenden Schleife benötigt. 
        // Daher hierdraußen definieren.
        int startPos;
        int endPos;
        
        do {
            // StartPosition der aktuellen Zeile
            startPos = (currentLine-1) * lineWidth;
            
            // EndPosition der aktuellen Zeile
            endPos = currentLine * lineWidth;
            
            
            // Achtung!
            // Ist die endPos größer als die gesamte Textlänge des Ursprungtextes?
            // Falls Ja, dann den Text um ein paar Leerzeichen ergänzen.
            if (endPos>len) { 
                // Die Differenz aus Zeilenbreite (Länge) und Länge des ganzen Textes
                // ergibt die Zahl der fehlenden Zeichen.
                int count = endPos - len;
            
                // Füge dem Text Leerzeichen hinzu.
                this.text = addSpaces(this.text,count);
            }
            
            // Hole die aktuelle Zeile
            String zeile = this.text.substring(startPos, endPos);
            
            // Speichere die aktuelle Zeile im Array
            this.zeilen.add(zeile);
        
            currentLine++;
            
            len = this.text.length();
            
        } while (startPos + lineWidth < len);
        // Solange, startPos <= text.length
        // startPos + lineWidth <= text.length
        
        
        
        
    }
    
    
    
    
    private String addSpaces(String text, int count){
        String newtext = text;
        
        for (int i=0; i < count; i++){
            newtext = newtext + " ";
        }
        
        return newtext;
    }
    
    
}

