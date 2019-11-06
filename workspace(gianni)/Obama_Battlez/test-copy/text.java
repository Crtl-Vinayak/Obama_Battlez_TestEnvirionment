import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class text here.
 * 
 * @author (Gianni) 
 * @version (1.0)
 */

//attack list:
//willem attack 1 "Sneak attack" =w_a_1
//willem attack 2 "Willem hurricane" =w_a_2
//willem attack 3 "Kopstoot" =w_a_3
//willem attack 4 "sneak attack" =w_a_4

//Obama attack 1 "Prism prison" =b_a_1
//Obama attack 2 "sneak attack" =b_a_2
//Obama attack 3 "sneak attack" =b_a_3
//Obama attack 4 "sneak attack" =b_a_4

//trump attack 1 "sneak attack" =t_a_1
//trump attack 2 "sneak attack" =t_a_2
//trump attack 3 "sneak attack" =t_a_3
//trump attack 4 "sneak attack" =t_a_4


public class text extends Actor {
    
    private String w_a_1 = "Willem used sneak attack";
    GreenfootImage img = new GreenfootImage(200, 150);
    
    public text() {
     img.drawString(w_a_1, 2, 20);
     setImage(img);
     //getWorld().removeObject(this);
    }
    
    /**
     * Act - do whatever the text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
