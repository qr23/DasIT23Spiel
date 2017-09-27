package system;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class SystemInfos {
	public static void show() throws IOException {
		
		String sonderzeichen = "ÄÖÜßäöü";
		
		String os  			= System.getProperty( "os.name" );
	    String fileenc  	= System.getProperty( "file.encoding" );
	    String consoleenc  	= System.getProperty( "console.encoding" );
	    
	    System.out.println("OS			: " + os);
	    System.out.println("File Encoding		: " + fileenc);
	    System.out.println("Console Encoding	: " + consoleenc);
	    
	    System.out.println("");
	    
	    System.out.println("Sonderzeichen (Ohne)	: " + sonderzeichen);
	    
	    String codepage = "Cp850";
	    PrintWriter pw = new PrintWriter( new OutputStreamWriter( System.out, codepage ) );
	    pw.println( 	   "Sonderzeichen (Cp850)	: " + sonderzeichen );
	    pw.flush();
	    
	    PrintWriter pw2 = new PrintWriter( new OutputStreamWriter( System.out, "UTF8" ) );
	    pw2.println(        "Sonderzeichen (UTF8)	: " + sonderzeichen );
	    pw2.flush();
	    
	    pw2 = new PrintWriter( new OutputStreamWriter( System.out, "Cp1252" ) );
	    pw2.println(        "Sonderzeichen (Cp1252)	: " + sonderzeichen );
	    pw2.flush();
	    
	}
}
