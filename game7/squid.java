import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class squid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class squid extends Actor
{
    /**
     * Act - do whatever the squid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      public squid()
    {    
        GreenfootImage image = getImage();  
        image.scale(70, 70);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
