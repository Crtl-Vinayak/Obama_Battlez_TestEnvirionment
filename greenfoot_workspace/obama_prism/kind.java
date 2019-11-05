import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kind here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kind extends Actor
{
    /**
     * Act - do whatever the kind wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        move();
    }
    
    public void move() {
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("W")){y-= 3;}
        if(Greenfoot.isKeyDown("S")){y+= 3;}
        if(Greenfoot.isKeyDown("A")){x-= 3;}
        if(Greenfoot.isKeyDown("D")){x+= 3;}
        setLocation(x, y);
    }
}
