package test;



import io.buttons.Button;
import io.dialog.JaNeinDialog;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JaNeinDialog d = new JaNeinDialog("Frage","Willst du ein Eis?");
		
		Button b = d.run();

		//System.out.println("Key: " + b.getKey());
		//System.out.println("Name: " + b.getName());
		//System.out.println("Text: " + b.getText());
		//System.out.println("Title: " + b.getTitle());
		
		String key = b.getName();
		
		if (key.equalsIgnoreCase("NeinButton")) {
			System.out.println("Oh, kein Eis?");
		}
		
		if (key.equalsIgnoreCase("JaButton")) {
			System.out.println("Oh, prima!");
		}
	
		
		
		/*
		if (b.getKey() == "J") {
			System.out.println("Jarp");
		} else {
			System.out.println("Nope");
		}*/

	}

}
