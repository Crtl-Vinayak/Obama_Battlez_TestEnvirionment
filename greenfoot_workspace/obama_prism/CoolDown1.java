import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CoolDown1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoolDown1 extends Actor {
    
    private short cooldown = 0;
    
    public CoolDown1(String text) {
        GreenfootImage img = new GreenfootImage(text.length() * 30, 30);
        img.setFont(new Font("Helvetica", 24));
        img.drawString(Short.toString(cooldown), 2, 20);
        setImage(img);
    }
    
    public void setText(String text) { 
        GreenfootImage img = getImage();
        img.clear();
        img.setFont(new Font("Helvetica", 24));
        img.drawString(Short.toString(cooldown), 2, 20);
    }
    
    /**
     * Act - do whatever the CoolDown1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        cooldown++;
        if(cooldown == 60){
            cooldown = 0;
        }
        setText(Short.toString(cooldown));
    }    
}
