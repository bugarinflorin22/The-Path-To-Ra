import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bl1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bl1 extends Actor
{
    /**
     * Act - do whatever the bl1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // In functie de variabila declarata static, schimbam poztitia(x) runelor.
        switch (RunWorld.locationsw)
        {
            case 1: setLocation(196,650); break;
            case 2: setLocation(336,650); break;
            case 3: setLocation(476,650); break;
            case 4: setLocation(614,650); break;
            case 5: setLocation(754,650); break;
            case 6: setLocation(884,650); break;
        }
    }
}
