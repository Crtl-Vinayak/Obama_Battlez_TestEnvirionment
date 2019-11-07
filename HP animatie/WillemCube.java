import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WillemCube here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WillemCube extends Actor
{
    public int HP = 100;
    public int Defence = 50;
    public int speed = 10;
    public WillemCube()
    {
        GreenfootImage willemcube = getImage();
        int height = (int)willemcube.getHeight()/2;
        int width = (int)willemcube.getWidth()/2;
        willemcube.scale(width,height);
    }

    /**
     * Act - do whatever the WillemCube wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    }

}
