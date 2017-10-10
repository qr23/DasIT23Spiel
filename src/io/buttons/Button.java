package io.buttons;

public class Button {
	private String text = "";
	private String key = "";
	private String name ="NoName";
	private boolean sichtbar = true; 
	    
	
	public Button(){		
	}
	
	public Button(String text, String key){
		this.text = text;
	    this.key = key;        
	}
	    
	public String getText(){
		return text;
	} 
	    
	public String getKey(){
		return key;
	}
	    
	public String getTitle(){
		return "[" + key + ") " + text + "]";
	}
	    
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public boolean isName(String name) {
		return name.equalsIgnoreCase(this.name);
	}
	
	/**
	 * Prüft den Namen des Buttons und die Beschriftung (Text)
	 * 
	 * @param name
	 * @return
	 */
	public boolean is(String name) {
		boolean result = false;
		
		// Wenn der Name intern gesetzt ist, den prüfen
		if (!this.name.isEmpty()) {
			result = name.equalsIgnoreCase(this.name);
			// Wenn gleich. dann true zurück geben.
			if (result) { return true; }
		}
		
		// Wenn der Text (Beschriftung) des Buttons gesetzt ist, prüfen
		if (!this.text.isEmpty()) {
			result = name.equalsIgnoreCase(this.text);
			// Wenn gleich. dann true zurück geben.
			if (result) { return true; }
		}
		
		return result;
		
	}
	
	public void setSichtbar() {
		this.sichtbar = true;
	}
	
	public void setUnsichtbar() {
		this.sichtbar = false;
	}
	
	public boolean isUnsichtbar() {
		return !this.sichtbar;
	}
	
	public boolean isSichtbar() {
		return this.sichtbar;
	}
}
