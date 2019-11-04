import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoodObama here.
 * 
 * @author (Mark Bout) 
 * @version (ver 0.01 4/11/2019)
 */
public class GoodObama extends Actor
{
    private GreenfootSound backgroundMusic = new GreenfootSound("sounds/POKEMON_THEME_SHITTYFLUTED.mp3");
    public static int counter = 0;
    /**
     * Act - do whatever the GoodObama wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("Q"))
        {counter++;}
        if(Greenfoot.isKeyDown("R"))
        {counter = 0;}
        move();
        
    }
    public void move()
        {
          int y = getY();
          int x = getX();
          if(Greenfoot.isKeyDown("W")){y-=5;}
          if(Greenfoot.isKeyDown("S")){y+=5;}
          if(Greenfoot.isKeyDown("A")){x-=5;}
          if(Greenfoot.isKeyDown("D")){x+=5;}
          if(Greenfoot.isKeyDown("enter")){backgroundMusic.play();}
          if(Greenfoot.isKeyDown("backspace")){backgroundMusic.stop();}
          setLocation(x,y);
        }
        

}
