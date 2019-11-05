import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CoolDown2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoolDown2 extends Actor {
    
    private short cooldown = 0;
    GreenfootImage img = new GreenfootImage(200, 150);
    
    public CoolDown2 () {
     img.drawString(Short.toString(cooldown), 2, 20);
     setImage(img);
    }
    
    /**
     * Act - do whatever the CoolDown2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        cooldown++;
        img.clear();
        setImage(img);
        if(cooldown == 60){
            cooldown = 0;
        }
    }    
}
