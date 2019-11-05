import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextTest here.
 * 
 * @author (Vinayak) 
 * @version (a version number or a date)
 */
public class TextTest extends Actor {
    
   private String hoi = "tesadjfkljhdsfkajsdhf";
   GreenfootImage img = new GreenfootImage(200, 150);
   
   public TextTest() {
     img.drawString(hoi, 2, 20);
     setImage(img);
   }
   
    /**
     * Act - do whatever the TextTest wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        img.clear();
        GreenfootImage img = new GreenfootImage(200, 150);
        img.drawString(hoi, 200, 120);
        setImage(img);
    }    
}
