
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
    short totalclicks = 0;
    int damage = 20;

    public HPbar()
    {
        update(); 
    }

    public void act() 
    {
        framez++;
        System.out.println(framez);
        System.out.println(clicked);
        System.out.println(totalclicks);
        System.out.println(health);
        if(framez == 60) {
            framez = 0;
        }
        if (Greenfoot.isKeyDown("enter")) {
           clicked = true;
           totalclicks = 1;
           framez = 0;
        }
        if(clicked == true & totalclicks == 1){
            for(int i = 10; i < 60; i+=5){
                if(framez == i) health -= damage / 10;
            }
            if(framez == 59) totalclicks = 0;
        }
        update();
    }
        public void update()
        {
            setImage(new GreenfootImage(402,17));
            GreenfootImage myImage = getImage();
            myImage.setColor(Color.BLACK);
            myImage.drawRect(0,0, healthbarwidth +1, healthbarheight+1);
            myImage.setColor(Color.GREEN);
            myImage.fillRect(1,1,health*pixelsPerHealthpoint, healthbarheight);
        }
    }
