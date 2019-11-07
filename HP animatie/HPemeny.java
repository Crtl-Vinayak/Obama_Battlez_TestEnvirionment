import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HPemeny here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HPemeny extends Actor
{
    public HPemeny()
    {
        GreenfootImage image = getImage();
        image.scale((int) Math.round(image.getWidth() * 1.6), image.getHeight());
        image.setColor(Color.GREEN);
        image.fillRect(400, 600, 497, 23);
    }
}
