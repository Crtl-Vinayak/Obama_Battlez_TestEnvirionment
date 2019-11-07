import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HPbar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HPbar extends Actor
{
    int health = 100;
    int healthbarwidth = 400;
    int healthbarheight = 15;
    int pixelsPerHealthpoint = (int)healthbarwidth/health;
    int framez = 0;
    boolean clicked = false;
    int damage = 20;

    public HPbar()
    {
        update(); 
    }

    public void act() 
    {
        framez++;
        if(framez == 60) {
            framez = 0;
        }
        update();
        if (Greenfoot.isKeyDown("enter")) {
           clicked = true;
        }
        if(clicked == true){
            if(framez > damage){
                clicked = false;
            } else {
                health -= 1;
            }     
        }
    }
        public void update()
        {
            setImage(new GreenfootImage(healthbarwidth + 2,healthbarheight + 2));
            GreenfootImage myImage = getImage();
            myImage.setColor(Color.BLACK);
            myImage.drawRect(0,0, healthbarwidth +1, healthbarheight+1);
            myImage.setColor(Color.GREEN);
            myImage.fillRect(1,1,health*pixelsPerHealthpoint, healthbarheight);
        }
    }
