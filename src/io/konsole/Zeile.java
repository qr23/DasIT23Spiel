package io.konsole;

public class Zeile {
   
    private int width = 61;
    private final String topLineChar="━";
    private final String middleLineChar="─";
    private final String bottomLineChar="━";
    private final String leftChar="┃";
    private final String rightChar="┃";
    private final String topLeft="┏";
    private final String topRight="┓";
    private final String bottomLeft="┗";
    private final String bottomRight="┛";
    private final String leftCrossChar="┠";
    private final String rightCrossChar="┨";
    
    
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
