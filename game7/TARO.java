import lang.stride.*; 

import java.util.*; 

import greenfoot.*; 

  

/** 

*  

*/ 

public class TARO extends Actor 

{ 
    public int pt = 0;

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
              //Actor portal = getOneIntersectingObject( next_stage_prtal.class ); 
              Actor boss = getOneIntersectingObject( squid.class );
        /*if( portal != null ){ 
            
            getWorld().removeObject(actor);
            
            }*/   

        if( actor != null ){ 
            pt++;
            getWorld().removeObject(actor);
            
            }   
   
        if( boss!= null ){ 
            setLocation(x,y); 
            if(pt==5)
            getWorld().removeObject(boss);
            getWorld().addObject(new next_stage_prtal() , 750,770);
            getWorld().showText("おめでとうございます！ステージクリアです\nボタンを押したら次のステージへ進めます。",400,405);
            }  
            
<<<<<<< HEAD
          Actor wall = getOneIntersectingObject( wall.class );
        if( wall != null ){ 
=======
        Actor Mazewall = getOneIntersectingObject( Mazewall.class );
        if( Mazewall!= null ){ 
            setLocation(x,y); 
         
        }
        Actor wall = getOneIntersectingObject( wall.class );
        if( wall!= null ){ 
>>>>>>> efadfe5d4cfab9f05bcbd33931c4825aa822e5bc
            setLocation(x,y); 
         
        } 
        
    }
}
    


 