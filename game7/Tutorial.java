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
     */
    public Tutorial()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 815, 1); 
        addObject(new TARO(),50,50); 
        addObject(new angry(),750,770); 
        GreenfootImage image = getBackground();  
        image.scale(800, 1100);

        setBackground(image);
        
        for(int i = 0 ; i < 5  ; i++){  
            int A = 10; 
            int B = 750; 
            int x = A + (int)(Math.random()*((B-A)+1)); 
            B= 450; 
            int y = B - (int)(Math.random()*((B-A)+1)); 
            addObject(new esa1(),x,y); 
        }

    }
    public void act(){
     if( Greenfoot.isKeyDown( "a" ) ){ 


            Greenfoot.setWorld(new start());



        } 
    }
}
