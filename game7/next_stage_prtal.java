import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class start_button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class next_stage_prtal extends Actor
{
    /**
     * Act - do whatever the start_button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public next_stage_prtal()
    {    
        GreenfootImage image = getImage();  
        image.scale(50, 50);
        setImage(image);
    }
    public void act() 
    {
        
    
        
      if (Greenfoot.mouseClicked(this))
 
      {
                  if (getWorld() instanceof Tutorial){  
                Greenfoot.setWorld(new Hokkaido());
            }
            
                else if (getWorld() instanceof Hokkaido){  
                Greenfoot.setWorld(new Niigata());
            }
            
                else if (getWorld() instanceof Niigata){  
                Greenfoot.setWorld(new Osaka());
            }
                else if (getWorld() instanceof Osaka){  
                Greenfoot.setWorld(new Edo());
            }
           
        }
    }    
}
