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
        //pt = ((TARO)getWorld().getObjects(TARO.class).get(0).pt);
       
        addObject(new TARO(),50,50);  
        //while(pt!=5){
        showText("エサを取るとポイントが上がる",500,200);
    //}
    }
}
