package welt.feldtyp;

public class Wald extends FeldTyp{

	public Wald() {
		addModifikator("Verteidigung", 5, 12);
		addModifikator("Bewegung", -10, -5);
		
		addFindbareGegenstaendeListe("Schwert,Ring,Schild");
		addHeimischeMonsterListe("Troll,Ork,Hexe");
		addWachsendeKraeuterListe("Alraune,Pusteblume,Schneckenwurz");
	}
	
	
}
