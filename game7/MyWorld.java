import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(800, 815, 1); 
        addObject(new TARO(),55,50); 
        addObject(new squid(),700,750); 
        
        
        for(int i = 0 ; i < 5  ; i++){  

        int A = 0; 

        int B = 850; 

        int x = A + (int)(Math.random()*((B-A)+1)); 

        B= 450; 

        int y = B - (int)(Math.random()*((B-A)+1)); 

        addObject(new esa1(),x,y); 
        
    }
    }
}
