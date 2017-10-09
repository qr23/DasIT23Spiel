package welt.feldtyp;

public class Arktis extends FeldTyp{
	
	public Arktis() {
		setName("Arktis");
		
		addModifikator("Magie", -10, -5 );
		addModifikator("Staerke", -5, -2);
		addModifikator("Bewegung", -20, -15);
		
		addFindbareGegenstaendeListe("Schwert,Ring,Schild");
		addHeimischeMonsterListe("Schneeti,Ork,Schwarzmagier");
		addWachsendeKraeuterListe("Eisblume");
	}

}
