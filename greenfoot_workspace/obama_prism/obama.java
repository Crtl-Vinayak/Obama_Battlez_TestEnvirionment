import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obama extends Actor
{
    /**
     * Act - do whatever the obama wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("W")){y-=2;}
        if(Greenfoot.isKeyDown("S")){y+=2;}
        if(Greenfoot.isKeyDown("A")){x-=2;}
        if(Greenfoot.isKeyDown("D")){x+=2;}
        setLocation(x, y);
    }    
}
