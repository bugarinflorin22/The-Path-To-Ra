import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Puzzle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puzzle extends World
{
    int sv = 0;
    public Puzzle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1);
        prepare();
    }

    public void act()
    {
        if (UserInfo.isStorageAvailable()) {
            UserInfo myInfo = UserInfo.getMyInfo();
            sv = myInfo.getInt(2);
        }
        switch(sv){
            case 1:  setBackground(new GreenfootImage("part5.png")); break;
            case 2:  setBackground(new GreenfootImage("part4.png")); break;
            case 3:  setBackground(new GreenfootImage("part3.png")); break;
            case 4:  setBackground(new GreenfootImage("part2.png")); break;
            case 5:  setBackground(new GreenfootImage("part1.png")); break;
            case 6:  setBackground(new GreenfootImage("final.png")); break;
        } 
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        urmatorul3 urmatorul3 = new urmatorul3();
        addObject(urmatorul3,540,700);
    }
}
