package test;

public class TestArray {

	public static void main(String[] args) {
		
		String[] arr = new String[5];
		int[] zahlen = new int[50000];
		
		
		
		
		for (int n = 1; n <= 50000; n++) {
			zahlen[n] = n;
		}

		for (int n = 1; n <= 50000; n++) {
			System.out.println(zahlen[n]);
		}
		
		System.exit(0);
		
		arr[0] = "Gelb";
		arr[1] = "Grün";
		arr[2] = "Grau";
		arr[3] = "Rot";
		arr[4] = "Blau";
		
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("i:" + i);
			System.out.println("Wert: " +arr[i]);
		}
		

	}

}

