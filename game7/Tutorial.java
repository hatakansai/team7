import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{
    
    /**
     * Constructor for objects of class Tutorial.
     * 
     * 
     * 
     */
    
      private int pt = 0;
    public Tutorial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 815, 1); 
        addObject(new TARO(),50,50); 
        addObject(new squid(),750,770); 
    
        for(int i = 0 ; i < 5  ; i++){  

        int A = 10; 

        int B = 750; 

        int x = A + (int)(Math.random()*((B-A)+1)); 

        B= 450; 

        int y = B - (int)(Math.random()*((B-A)+1)); 

        addObject(new esa1(),x,y); 
        }
       
     
        showText("1.エサを取るとポイントが上がる",500,100);
        showText("2.十分なポイントを集めると\nボスを倒せ次のステージに進める",500,150);
        showText("BOSS",750,720);
    
    
}
}