import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ant extends Actor
{
    /**
     * Act - do whatever the ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(1);
        if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(90);
        move(1);
        }
}// Add your action code here.
    }
}
