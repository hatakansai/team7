import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class esa1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class esa1 extends Actor
{
    /**
     * Act - do whatever the esa1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public esa1()
    {    
        GreenfootImage image = getImage();  
        image.scale(30, 30);
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
         while (!getObjectsInRange(10, esa1.class).isEmpty() || !getObjectsInRange(10, wall.class).isEmpty()|| !getObjectsInRange(10, Mazewall.class).isEmpty())
    {
        setLocation(10+Greenfoot.getRandomNumber(getWorld().getWidth()), 10+Greenfoot.getRandomNumber(getWorld().getHeight()));
    }
    }    
}
