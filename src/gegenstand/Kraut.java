package gegenstand;

public class Kraut {
	
	private int heilpunkte;
	private int magiepunkte;
	private int staerkepunkte;
	private String name="";
	
	public Kraut() {
		
	}
	
	public Kraut(String name, int heilpunkte, int staerkepunkte, int magiepunkte) {
		this.setName(name);
		this.setMagiepunkte(magiepunkte);
		this.setHeilpunkte(heilpunkte);
		this.setStaerkepunkte(staerkepunkte);
	}

	public int getHeilpunkte() {
		return heilpunkte;
	}

	public void setHeilpunkte(int heilpunkte) {
		this.heilpunkte = heilpunkte;
	}

	public int getMagiepunkte() {
		return magiepunkte;
	}

	public void setMagiepunkte(int magiepunkte) {
		this.magiepunkte = magiepunkte;
	}

	public int getStaerkepunkte() {
		return staerkepunkte;
	}

	public void setStaerkepunkte(int staerkepunkte) {
		//this.staerkepunkte = staerkepunkte;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
