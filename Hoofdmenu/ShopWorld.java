import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShopWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShopWorld extends World
{

    /**
     * Constructor for objects of class ShopWorld.
     * 
     */
    public ShopWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        GreenfootImage bg = new GreenfootImage("background.jpg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Shopbanner shopbanner = new Shopbanner();
        addObject(shopbanner,603,128);
        backButton backButton = new backButton();
        addObject(backButton,629,623);
        inDev inDev = new inDev();
        addObject(inDev,604,378);
    }
}