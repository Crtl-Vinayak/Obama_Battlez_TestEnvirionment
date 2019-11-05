import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obama_walk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obama_walk extends Actor
{   
    private short checklolol = 0;
    private GifImage myGif = new GifImage("obama_walk2.gif");
    private GifImage noGif = new GifImage("nothing.gif");
    
    /**
     * Act - do whatever the obama_walk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        checklolol++;
        if(checklolol > 120){
            getWorld().removeObject(this);
        } else {
            setImage(myGif.getCurrentImage());
        }
    }    
}
