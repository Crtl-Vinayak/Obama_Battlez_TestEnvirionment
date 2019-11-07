import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage extends World
{
    private GreenfootImage myImage;

    /**
     * Constructor for objects of class Stage.
     * 
     */
    public Stage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        UIEnemy uIEnemy = new UIEnemy();
        addObject(uIEnemy,299,123);
        UIPlayer uIPlayer = new UIPlayer();
        addObject(uIPlayer,964,415);
        uIEnemy.setLocation(203,67);
        NameEnemy nameEnemy = new NameEnemy();
        addObject(nameEnemy,163,27);
        uIEnemy.setLocation(296,102);
        uIPlayer.setLocation(732,347);
        NamePlayer namePlayer = new NamePlayer();
        addObject(namePlayer,870,347);
        uIPlayer.setLocation(990,415);
        WillemCube willemCube = new WillemCube();
        addObject(willemCube,286,351);
        trumpPrism trumpPrism = new trumpPrism();
        addObject(trumpPrism,962,160);
        uIEnemy.setLocation(280,100);
        HPemeny hPemeny = new HPemeny();
        addObject(hPemeny,270,80);
        HPplayer hPplayer = new HPplayer();
        addObject(hPplayer, 1000,400);
        HPbar hPbar = new HPbar();
        myImage = new GreenfootImage(1036,398);
        uIPlayer.setLocation(1061,356);
        addObject(hPbar,1061,356);
        uIPlayer.setLocation(1010,415);
        hPbar.setLocation(1060,400);
    }
}
