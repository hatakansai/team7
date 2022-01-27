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
    public TARO()
    {    
        GreenfootImage image = getImage();  
        image.scale(50, 50);
        setImage(image);
    }


    public void act() 

    {  int x = getX(); 

        int y = getY(); 

        getWorld().showText("ポイント："+pt,500,20); 
        if( Greenfoot.isKeyDown( "right" ) ){ 

<<<<<<< HEAD
            setLocation(x+6,y); 
=======
            setLocation(x+5,y); 
>>>>>>> f0a8be871d4e7d0a98d65b92ff0c91e1ec8e8b16


        } 


        else if( Greenfoot.isKeyDown( "down" ) ){ 

<<<<<<< HEAD
            setLocation(x,y+6); 
=======
            setLocation(x,y+5); 
>>>>>>> f0a8be871d4e7d0a98d65b92ff0c91e1ec8e8b16


        } 


        else if( Greenfoot.isKeyDown( "left" ) ){ 

<<<<<<< HEAD
            setLocation(x-6,y); 
=======
            setLocation(x-5,y); 
>>>>>>> f0a8be871d4e7d0a98d65b92ff0c91e1ec8e8b16


        } 


        else if( Greenfoot.isKeyDown( "up" ) ){ 

<<<<<<< HEAD
            setLocation(x,y-6); 
=======
            setLocation(x,y-5); 
>>>>>>> f0a8be871d4e7d0a98d65b92ff0c91e1ec8e8b16

      

        } 
        Actor actor = getOneIntersectingObject( esa1.class ); 
        //Actor portal = getOneIntersectingObject( next_stage_prtal.class ); 
        Actor squid = getOneIntersectingObject( squid.class );
        Actor yokozuna = getOneIntersectingObject( yokozuna.class );
        Actor farmer = getOneIntersectingObject( farmer.class );
        Actor angry = getOneIntersectingObject( angry.class );
        /*if( portal != null ){ 

        getWorld().removeObject(actor);

        }*/   

        if( actor != null ){ 
            pt++;
            getWorld().removeObject(actor);

        }   

        if( squid!= null   ){ 
            setLocation(x,y);   
            
            if(pt>4){
                getWorld().removeObject(squid);
            getWorld().addObject(new next_stage_prtal() , 750,770);
            getWorld().showText("おめでとうございます！ステージクリアです\nボタンを押したら次のステージへ進めます。",400,405);}
            
        }  
        if( farmer!= null   ){ 
            setLocation(x,y);   
            
            if(pt>4){
                getWorld().removeObject(farmer);
            getWorld().addObject(new next_stage_prtal() , 750,770);
            getWorld().showText("おめでとうございます！ステージクリアです\nボタンを押したら次のステージへ進めます。",400,405);}
            
        }  
        if( angry!= null   ){ 
            setLocation(x,y);   
            
            if(pt>4){
                getWorld().removeObject(angry);
            getWorld().addObject(new next_stage_prtal() , 750,770);
            getWorld().showText("おめでとうございます！ステージクリアです\nボタンを押したら次のステージへ進めます。",400,405);}
            
        }  
        if( yokozuna!= null  ){ 
            setLocation(x,y);   
            
            if(pt>4){
                getWorld().removeObject(yokozuna);
           
            getWorld().showText("おめでとうございます！ゲームクリアです！\n貴方は横綱だ！",400,405);
        }
           
            
        }  

        Actor wall = getOneIntersectingObject( wall.class );
        if( wall != null ){ 
            setLocation(x,y);   
            

            }
        Actor Mazewall = getOneIntersectingObject( Mazewall.class );
            if( Mazewall!= null ){ 
                setLocation(x,y);     

        }
        
    }
    }


