
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class willem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class willem extends Actor
{
    public short pressOnceEnter = -1;
    public int frameCheck = 0;
    private short total60;
    private short totalRotation = 0;
    public boolean button1Click = false;
    public boolean button2Click = false;
    
    public willem()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 2, image.getHeight() / 2);
        getImage().mirrorHorizontally();
        setImage(image);
    }
    
    /**
     * Act - do whatever the willem wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        frameCheck++;
        keyEvents();
        move();
    }    
    
    public void move() {
        int y = getY();
        int x = getX();
        
        if(pressOnceEnter == 0 && button1Click == true) {
            
            if(frameCheck == 30) {
                getImage().mirrorHorizontally();
                x-=100;
            }
            
            if(frameCheck == 100){
                getImage().mirrorHorizontally();
                setRotation(-45);
                x-=100;
                y+=50;
            }
            
            //terug
            if(frameCheck == 120){
                setRotation(0);
                x+=200;
                y-=50;
                
                getImage().mirrorHorizontally();
                getImage().mirrorHorizontally();
                frameCheck = 0;
                pressOnceEnter = 1;
                button1Click = false;
            }
        }
        if(pressOnceEnter == 0 && button2Click == true){
        //needs loop for first spin
            for(int i = 0; i < 70; i+=20) {
                if(frameCheck == i) {
                    getImage().mirrorVertically();
                }
            }
            for(int i = -10; i < 80; i+=20) {
                if(frameCheck == i) {
                    getImage().mirrorHorizontally();
                }
            }
            //second pattern
            for(int i = 70; i < 130; i+=10) {
                if(frameCheck == i) {
                    getImage().mirrorVertically();
                    x-=40;
                    y+=22;
                    totalRotation++;
                    if(totalRotation == 5){
                        pressOnceEnter = 1;
                        button2Click = false;
                        setRotation(0);
                        x+=40 * 5;
                        y-=22 * 5;
                        totalRotation = 0;
                    }
                }
            }
            if(frameCheck == 120){
                frameCheck = 0;
                total60++;
                x-= 38 * total60;
                y+= 34;
                
                if(total60 == 5){
                    total60 = 0;
                }
            }
        }
        setLocation(x, y);
    }
    
    public void keyEvents() {
        if(Greenfoot.isKeyDown("enter")){
            pressOnceEnter = 0;
            frameCheck = 0;
            button1Click = true;
        }
        if(Greenfoot.isKeyDown("R")) {
            pressOnceEnter = 0;
            frameCheck = 0;
            button2Click = true;
        }
    }
}

//if(Greenfoot.isKeyDown("enter")){}

