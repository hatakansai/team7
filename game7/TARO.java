import lang.stride.*; 

import java.util.*; 

import greenfoot.*; 

  

/** 

*  

*/ 

public class TARO extends Actor 

{ 
    int pt = 0;
  

    /** 

     * Act - do whatever the TARO wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment. 

     */ 

     

     

    public void act() 

    {  int x = getX(); 

        int y = getY(); 
        
        getWorld().showText("ポイント："+pt,500,20); 
       if( Greenfoot.isKeyDown( "right" ) ){ 

         setLocation(x+4,y); 

         

                    } 

                     

        else if( Greenfoot.isKeyDown( "down" ) ){ 

         setLocation(x,y+4); 

         

        } 

         

        else if( Greenfoot.isKeyDown( "left" ) ){ 

        setLocation(x-4,y); 

         

        } 

         

        else if( Greenfoot.isKeyDown( "up" ) ){ 

         setLocation(x,y-4); 

                if( Greenfoot.isKeyDown( "a" ) ){ 

        getWorld().showText("Hello",150,50);} 

            if( Greenfoot.isKeyDown( "s" ) ){ 

        getWorld().showText("Konnitiwa",150,50);} 

            if( Greenfoot.isKeyDown( "d" ) ){ 

        getWorld().showText("",150,50);} 

        
            } 
              Actor actor = getOneIntersectingObject( esa1.class ); 

        if( actor != null ){ 
            pt++;
            getWorld().removeObject(actor);
            
            }   
        Actor boss = getOneIntersectingObject( squid.class );
        if( boss!= null ){ 
            setLocation(x,y); 
            if(pt==5)
            getWorld().removeObject(boss);
            
            }  

        } 

    } 

 