package wesen;

public class Wesen {
	
	protected String name;
	protected int lebenspunkte;
	protected int magiepunkte;
	protected int erfahrung;
	protected int level;
	protected int angriff;
	protected int verteidigung;
	protected int magVert;
	protected int magAtk;
	//private Inventar inventar;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLebenspunkte() {
		return lebenspunkte;
	}
	public void setLebenspunkte(int lebenspunkte) {
		this.lebenspunkte = lebenspunkte;
	}
	public int getMagiepunkte() {
		return magiepunkte;
	}
	public void setMagiepunkte(int magiepunkte) {
		this.magiepunkte = magiepunkte;
	}
	public int getErfahrung() {
		return erfahrung;
	}
	public void setErfahrung(int erfahrung) {
		this.erfahrung = erfahrung;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getAngriff() {
		return angriff;
	}
	public void setAngriff(int angriff) {
		this.angriff = angriff;
	}
	public int getVerteidigung() {
		return verteidigung;
	}
	public void setVerteidigung(int verteidigung) {
		this.verteidigung = verteidigung;
	}
	public int getMag_Vert() {
		return magVert;
	}
	public void setMag_Vert(int mag_Vert) {
		this.magVert = mag_Vert;
	}
	public int getMag_Atk() {
		return magAtk;
	}
	public void setMag_Atk(int mag_Atk) {
		this.magAtk = mag_Atk;
	}

}
