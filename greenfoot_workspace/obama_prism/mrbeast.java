import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mrbeast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mrbeast extends Actor
{
    GreenfootImage img = getImage();
    
    /**
     * Act - do whatever the mrbeast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
    }    
    
    public void move() {
        if(Greenfoot.isKeyDown("W")){getImage().mirrorVertically();}
        if(Greenfoot.isKeyDown("S")){getImage().mirrorVertically();}
        if(Greenfoot.isKeyDown("A")){getImage().mirrorHorizontally();}
        if(Greenfoot.isKeyDown("D")){getImage().mirrorHorizontally();}
    }
}
