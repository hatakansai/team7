import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hokkaido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hokkaido extends World
{

    /**
     * Constructor for objects of class Hokkaido.
     * 
     */
    public Hokkaido()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(800, 815, 1); 
        addObject(new TARO(),50,50); 
        addObject(new squid(),700,750); 
        for( int x = 0 ; x<=815 ;x++){
        addObject(new wall(),x,0); 
        }
         for( int x = 0 ; x<=815 ;x++){
        addObject(new wall(),x,815); 
        }
         for( int y = 0 ; y<=800 ;y++){
        addObject(new wall(),0,y); 
        }
         for( int y = 0 ; y<=800 ;y++){
        addObject(new wall(),815,y); 
        }
  
        //maze wall part
        
        for( int y = 0 ; y<=100 ;y++){
        addObject(new wall(),100,y); 
        }
        
        
        
        
        
        
        
        
        
        
        
        
        // if hit wall re-set the food **not done
        for(int i = 0 ; i < 5  ; i++){  

        int A = 10; 

        int B = 750; 

        int x = A + (int)(Math.random()*((B-A)+1)); 

        B= 450; 

        int y = B - (int)(Math.random()*((B-A)+1)); 

        addObject(new esa1(),x,y); 
        
    }
    }
    }

