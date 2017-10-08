package welt.feldtyp;

public class Arktis extends FeldTyp{
	
	public Arktis() {
		this.name = "Arktis";
		
		addModifikator("Magie", -10, -5 );
		addModifikator("Staerke", -5, -2);
		addModifikator("Bewegung", -20, -15);
	}

}
