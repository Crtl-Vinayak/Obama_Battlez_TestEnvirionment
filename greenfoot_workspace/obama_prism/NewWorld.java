import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Graphics;
import java.awt.Color;

/**
 * Write a description of class NewWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewWorld extends World
{

    GreenfootSound backgroundMusic = new GreenfootSound("sounds/Pokemon_Theme_Song.mp3");
    private short cooldown = 0;
    
    /**
     * Constructor for objects of class NewWorld.
     * 
     */
    public NewWorld() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        kind kind = new kind();
        addObject(kind,56,163);
        kind kind2 = new kind();
        addObject(kind2,338,78);
        kind kind3 = new kind();
        addObject(kind3,235,295);
        
        obama obama = new obama();
        addObject(obama,822,295);
        
        TextTest tt = new TextTest();
        addObject(tt, 500, 300);
    }
    
    public void act() {
        MyWorld myWorld = new MyWorld();
        if(Greenfoot.isKeyDown("enter")){
            cooldown++;
            if(cooldown == 5) {
                cooldown = 0;
                Greenfoot.setWorld(myWorld);
            }
        }
        if(Greenfoot.isKeyDown("Y")){backgroundMusic.play();}
    }
}