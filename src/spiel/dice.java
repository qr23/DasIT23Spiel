package spiel;

import java.util.Random;

public class dice{
    public static int wuerfeln(int number, int nSides)
    { 
        int num = 0;
        int roll = 0;
        Random  r = new Random(); 
        if(nSides >=4) 
        { 
            for(int i = 0; i < number; i++)
            { 
                roll = r.nextInt(nSides)+1;
                System.out.println("Gewürfelt wurde:  "+roll);
                num = num + roll; 
            } 
        } 
        else
        { 
            System.out.println("Nummer muss mindestens 4 sein"); 
        } 
        return num;  
    } 

   /* public static void main(String[] args)
    {
        System.out.println("Menge total: "+wuerfeln(4, 6));
    }*/

}
