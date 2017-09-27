package test;

import io.buttons.Button;
import io.dialog.JaNeinDialog;

public class Test2 {

	public static void main(String[] args) {
		
		JaNeinDialog d = new JaNeinDialog("Frage", "Willst du einen Döner");
		
		Button b = d.run();
		
		System.out.println("Key: " + b.getKey());
		System.out.println("Name: " + b.getName());
		System.out.println("Text: " + b.getText());
		System.out.println("Titel: " + b.getTitle());

		
		if (b.getKey() == "J") {
			System.out.println("Jahaaa");
		} else {
			System.out.println("Neiheeeein");
		}
	}

}
