import greenfoot.*; 

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World {
    
    private short cooldown = 0;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        mrbeast mrbeast = new mrbeast();
        addObject(mrbeast,162,582);

        kind kind = new kind();
        addObject(kind,56,163);
        kind kind2 = new kind();
        addObject(kind2,338,78);
        kind kind3 = new kind();
        addObject(kind3,235,195);

        CoolDown1 coolDown1 = new CoolDown1("0");
        addObject(coolDown1, 600, 500);
        obama_walk obama_walk = new obama_walk();
        addObject(obama_walk,631,350);
        kind kind4 = new kind();
        addObject(kind4,296,269);
        kind kind5 = new kind();
        addObject(kind5,433,168);
        kind5.setLocation(464,141);
        kind kind6 = new kind();
        addObject(kind6,464,141);
        kind kind7 = new kind();
        addObject(kind7,569,108);
        kind7.setLocation(603,127);
        kind kind8 = new kind();
        addObject(kind8,603,127);
        kind kind9 = new kind();
        addObject(kind9,637,160);
        kind9.setLocation(615,192);
        kind kind10 = new kind();
        addObject(kind10,615,192);
        kind kind11 = new kind();
        addObject(kind11,486,225);
        kind kind12 = new kind();
        addObject(kind12,372,228);
        kind kind13 = new kind();
        addObject(kind13,308,219);
        kind13.setLocation(318,171);
        kind kind14 = new kind();
        addObject(kind14,318,171);
        kind14.setLocation(352,143);
        kind kind15 = new kind();
        addObject(kind15,352,143);
        kind kind16 = new kind();
        addObject(kind16,492,128);
        kind kind17 = new kind();
        addObject(kind17,617,106);
        kind kind18 = new kind();
        addObject(kind18,663,143);
        kind kind19 = new kind();
        addObject(kind19,432,191);
        kind kind20 = new kind();
        addObject(kind20,331,191);
        kind14.setLocation(465,172);
        kind kind21 = new kind();
        addObject(kind21,465,172);
        kind kind22 = new kind();
        addObject(kind22,539,158);
        kind5.setLocation(440,171);
        kind kind23 = new kind();
        addObject(kind23,440,171);
        kind kind24 = new kind();
        addObject(kind24,382,172);
        kind15.setLocation(352,136);
        kind kind25 = new kind();
        addObject(kind25,352,136);
        kind15.setLocation(399,128);
        kind kind26 = new kind();
        addObject(kind26,399,128);
        kind6.setLocation(511,178);
        kind kind27 = new kind();
        addObject(kind27,511,178);
        kind6.setLocation(520,183);
        kind kind28 = new kind();
        addObject(kind28,520,183);
        kind6.setLocation(470,197);
        kind kind29 = new kind();
        addObject(kind29,417,182);
        kind19.setLocation(404,181);
        kind kind30 = new kind();
        addObject(kind30,404,181);
        kind24.setLocation(358,195);
        kind kind31 = new kind();
        addObject(kind31,358,195);
        kind24.setLocation(354,196);
        kind kind32 = new kind();
        addObject(kind32,354,196);
        kind24.setLocation(407,235);
        kind kind33 = new kind();
        addObject(kind33,407,235);
        kind32.setLocation(425,244);
        kind kind34 = new kind();
        addObject(kind34,425,244);
        kind kind35 = new kind();
        addObject(kind35,491,237);
        kind kind36 = new kind();
        addObject(kind36,538,228);
        kind36.setLocation(529,210);
        kind kind37 = new kind();
        addObject(kind37,529,210);
        kind6.setLocation(559,158);
        kind kind38 = new kind();
        addObject(kind38,559,158);
        kind16.setLocation(462,144);
        kind kind39 = new kind();
        addObject(kind39,462,144);
        kind5.setLocation(442,151);
        kind kind40 = new kind();
        addObject(kind40,442,151);
        kind15.setLocation(402,121);
        kind kind41 = new kind();
        addObject(kind41,402,121);
        kind15.setLocation(429,115);
        kind kind42 = new kind();
        addObject(kind42,429,115);
        kind kind43 = new kind();
        addObject(kind43,474,115);
        kind43.setLocation(491,117);
        kind kind44 = new kind();
        addObject(kind44,491,117);
        kind43.setLocation(501,125);
        kind kind45 = new kind();
        addObject(kind45,501,125);
        kind44.setLocation(531,145);
        kind kind46 = new kind();
        addObject(kind46,531,145);
        kind45.setLocation(528,165);
        kind kind47 = new kind();
        addObject(kind47,528,165);
        kind29.setLocation(379,171);
        kind kind48 = new kind();
        addObject(kind48,379,171);
        kind25.setLocation(417,136);
        kind kind49 = new kind();
        addObject(kind49,417,136);
        kind15.setLocation(393,148);
        kind kind50 = new kind();
        addObject(kind50,393,148);
        kind15.setLocation(383,145);
        kind kind51 = new kind();
        addObject(kind51,383,145);
    }
    
    public void act() {
        NewWorld newWorld = new NewWorld();
        if(Greenfoot.isKeyDown("enter")){
            cooldown++;
            if(cooldown == 5) {
                cooldown = 0;
                Greenfoot.setWorld(newWorld);
            }
        }    
    }
}
