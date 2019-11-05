import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class willem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class willem extends Actor
{
    private short pressOnceEnter = 0;
    private boolean willemLooksGood = true;
    
    public willem()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 2, image.getHeight() / 2);
        setImage(image);
    }
    
    /**
     * Act - do whatever the willem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
    }    
    
    public void move() {
    int y = getY();
    int x = getX();
    if(pressOnceEnter == 0) {
        if(Greenfoot.isKeyDown("enter")){
            getImage().mirrorHorizontally();
            getImage().mirrorHorizontally();
             x-=50;
             getImage().mirrorHorizontally();
             getImage().mirrorHorizontally();
            if(willemLooksGood == true) {
                getImage().mirrorHorizontally();
                willemLooksGood = false;
            }
            pressOnceEnter++;
        }
    }
    if(Greenfoot.isKeyDown("D")){
        x++;
        if(willemLooksGood == false) {
            getImage().mirrorHorizontally();
            willemLooksGood = true;
        }
    }
    setLocation(x, y);
    }
}
