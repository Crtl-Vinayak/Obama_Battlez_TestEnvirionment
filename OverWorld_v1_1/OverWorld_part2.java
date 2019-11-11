import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OverWorld_part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OverWorld_part2 extends Actor
{
    /**
     * Act - do whatever the OverWorld_part2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if(Greenfoot.isKeyDown("W")) {
                setLocation(getX(), getY() + 4);
                if(getY() > 610) {
                    //battle starts...
                    //to the battle world!
                    setLocation(getX(), getY() - 4);
                }
                //sprite.setLocation(sprite.getX(), sprite.getY() - 4);
            }
        if(Greenfoot.isKeyDown("S")) {
            setLocation(getX(), getY() - 4);
            if(getY() < 400) {
                setLocation(getX(), getY() + 4);
            }
                //sprite.setLocation(spriteX, spriteY + 4);
        }
        if(Greenfoot.isKeyDown("A")) {
            setLocation(getX() + 4, getY());
            if(getX() > 800) {
                setLocation(getX() - 4, getY());
            }
            //sprite.setLocation(spriteX - 4, spriteY);
        }
        if(Greenfoot.isKeyDown("D")) {
            setLocation(getX() - 4, getY());
            if(getX() < 450) {
                setLocation(getX() + 4, getY());
            }
            //sprite.setLocation(spriteX + 4, spriteY);
        }
        System.out.println(getX() + " x " + getY());
    }    
}
