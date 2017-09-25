package io.konsole;

public class Zeile {
   
    private int width = 61;
    
    /* @ToDo CodePage/Encoding Windows/Linux */ 
    //private final String topLineChar= Character.toString ((char) 193 );
    //http://www.torsten-horn.de/techdocs/encoding.htm#Codepage-Konsolenausgabe
    
    // System.getProperty( "os.name" ) => Linux
    
    private String topLineChar="━";
    private String middleLineChar="─";
    private String bottomLineChar="━";
    private String leftChar="┃";
    private String rightChar="┃";
    private String topLeft="┏";
    private String topRight="┓";
    private String bottomLeft="┗";
    private String bottomRight="┛";
    private String leftCrossChar="┠";
    private String rightCrossChar="┨";
    
    
    public Zeile() {
    	String os = System.getProperty( "os.name" );
    	
    	if (!os.equalsIgnoreCase("Linux")) {
    		topLineChar="=";
    	    middleLineChar="-";
    	    bottomLineChar="=";
    	    leftChar="|";
    	    rightChar="|";
    	    topLeft="#";
    	    topRight="#";
    	    bottomLeft="#";
    	    bottomRight="#";
    	    leftCrossChar="+";
    	    rightCrossChar="+";
    	}
    }
    
    public void setWidth(int width){
        this.width = width;
    }
    
    public void drawLeftText(String text){
        
        TextBlock textblock = new TextBlock(text, width);
        
           
        // 
        while (textblock.hasNextLine()) {
            
            String zeile = textblock.nextLine();
            
            System.out.print(leftChar);
            System.out.print(zeile);
            System.out.println(rightChar);
            
            
        }
    }
    
    public void drawCenterText(String text){
        
        int len = text.length();
        
        if (len >= width) { 
            text = text.substring(width); 
            len = width;
        }
        
        int rest = width - len;
        int left = rest/2;
        int right = left;
        
        if (left*2 < rest) { right = left+1; }
        
        System.out.print(leftChar);
        for (int i = 0; i < left; i++){
            System.out.print(" ");
        }
        
        System.out.print(text);
        
        for (int i = 0; i < right; i++){
            System.out.print(" ");
        }
        System.out.println(rightChar);
        
    }
    
    public void drawTopLine(){       
        drawLine(topLeft,topLineChar,topRight);
    }
    
    public void drawBottomLine(){        
        drawLine(bottomLeft,bottomLineChar,bottomRight);
    }
    
    public void drawMiddleLine(){        
        drawLine(leftCrossChar,middleLineChar,rightCrossChar);
    }
    
    public void drawBoldMiddleLine(){        
        drawLine(leftCrossChar,topLineChar,rightCrossChar);
    }
    
    private void drawLine(String left, String middle, String right){
        System.out.print(left);
        for (int i=0; i<width ;i++){
            System.out.print(middle);
        }
        System.out.println(right);
    }
    
	
	
}
