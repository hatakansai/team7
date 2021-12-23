import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Niigata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Niigata extends World
{

    /**
     * Constructor for objects of class Niigata.
     * 
     */
    public Niigata()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(800, 815, 1); 

        addObject(new TARO(),50,50); 
        addObject(new squid(),750,770); 
        GreenfootImage image = getBackground();  
        image.scale(1200, 2000);

        setBackground(image);

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

        //maze vertical wall part(upper)
        for( int y = 0 ; y<=81.5 ;y++){
            addObject(new Mazewall(),89,y); //1
        }
        for( int y = 310 ; y<=401 ;y++){
            addObject(new Mazewall(),89,y); //2
        }
        for( int y = 220 ; y<=321 ;y++){
            addObject(new Mazewall(),180,y); //3
        }
        for( int y = 220 ; y<=321 ;y++){
            addObject(new Mazewall(),270,y); //4
        }
        for( int y = 220 ; y<=401 ;y++){
            addObject(new Mazewall(),360,y); //5
        }
        for( int y = 220 ; y<=315 ;y++){
            addObject(new Mazewall(),450,y); //6
        }
        for( int y = 220 ; y<=315 ;y++){
            addObject(new Mazewall(),470,y); //7
        }
        for( int y = 220 ; y<=220 ;y++){
            addObject(new Mazewall(),570,y); //8
        }
        for( int y = 220 ; y<=220 ;y++){
            addObject(new Mazewall(),590,y); //9
        }
        for( int y = 162 ; y<=220 ;y++){
            addObject(new Mazewall(),681,y); //10
        }
        for( int y = 162 ; y<=220 ;y++){
            addObject(new Mazewall(),701,y); //11
        }
        for( int y = 380 ; y<=400 ;y++){
            addObject(new Mazewall(),570,y); //12
        }
        for( int y = 380 ; y<=400 ;y++){
            addObject(new Mazewall(),590,y); //13
        }
        for( int y = 380 ; y<=490 ;y++){
            addObject(new Mazewall(),681,y); //14
        }
        for( int y = 380 ; y<=490 ;y++){
            addObject(new Mazewall(),701,y); //15
        }

  
        //maze wall part

        for( int y = 0 ; y<=100 ;y++){
            addObject(new wall(),100,y); 
        }

        
        
        
        
        //maze horizontal wall part
        for( int x = 110 ; x<=240 ;x++){
            addObject(new wall(),x,90);  //p1
        }
        for( int x = 110 ; x<=240 ;x++){
            addObject(new wall(),x,111); //p2
        }
        for( int x = 330 ; x<=700 ;x++){
            addObject(new wall(),x,90); //p3
        }
        for( int x = 330 ; x<=700 ;x++){
            addObject(new wall(),x,111); //p4
        }
        for( int x = 20 ; x<=89 ;x++){
            addObject(new wall(),x,190); //p5
        }
        for( int x = 110 ; x<=270 ;x++){
            addObject(new wall(),x,431); //p6
        }
        for( int x = 381 ; x<=470 ;x++){
            addObject(new wall(),x,431); //p7
        }
        for( int x = 290 ; x<=345 ;x++){
            addObject(new wall(),x,191); //p8
        }
        for( int x = 380 ; x<=430 ;x++){
            addObject(new wall(),x,280); //p9
        }
        for( int x = 720 ; x<=780 ;x++){
            addObject(new wall(),x,431); //p10
        }
        for( int x = 571 ; x<=700 ;x++){
            addObject(new wall(),x,345); //p11
        }

        //for horizontal wall
        for( int x = 0 ; x<=200 ;x++){
            addObject(new wall(),x,520); //z1
        }
        for( int x = 290 ; x<=390 ;x++){
            addObject(new wall(),x,520); //z2
        }
        for( int x = 500 ; x<=590 ;x++){
            addObject(new wall(),x,520); //z3
        }
        for( int x = 90 ; x<=300 ;x++){
            addObject(new wall(),x,610); //z4
        }
        for( int x = 500 ; x<=700 ;x++){
            addObject(new wall(),x,610); //z5
        }
        for( int x = 90 ; x<=250 ;x++){
            addObject(new wall(),x,700); //z6
        }
        for( int x = 90 ; x<=250 ;x++){
            addObject(new wall(),x,721); //z7
        }
        for( int x = 340 ; x<=500 ;x++){
            addObject(new wall(),x,700); //z8
        }
        for( int x = 340 ; x<=500 ;x++){
            addObject(new wall(),x,721); //z8
        }
        for( int x = 720 ; x<=780 ;x++){
            addObject(new wall(),x,700); //z8
        }
        for( int x = 720 ; x<=780 ;x++){
            addObject(new wall(),x,721); //z8
        }

        for( int y = 730 ; y<=770 ;y++){
            addObject(new Mazewall(),251,y);  //m1
        }
        for( int y = 480 ; y<=580 ;y++){
            addObject(new Mazewall(),410,y);  //m2
        }
        for( int y = 650 ; y<=690 ;y++){
            addObject(new Mazewall(),600,y);  //m3
        }
        for( int y = 650 ; y<=690 ;y++){
            addObject(new Mazewall(),621,y);  //m4
        }

      
        for(int i = 0 ; i < 5  ; i++){  
            int A = 10; 
            int B = 750; 
            int x = A + (int)(Math.random()*((B-A)+1)); 
            B= 450; 
            int y = B - (int)(Math.random()*((B-A)+1)); 
            addObject(new esa1(),x,y); 
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


