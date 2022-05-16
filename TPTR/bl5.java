import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bl5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bl5 extends Actor
{
    /**
     * Act - do whatever the bl5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Setam rezolutia pentru incadrarea corecta a imaginii
        getImage().scale(140, 140);
        // In functie de variabila declarata static, schimbam poztitia(x) runelor.
        switch (RunWorld.locationsw)
        {
            case 1: setLocation(754,650); break;
            case 2: setLocation(884,650); break;
            case 3: setLocation(614,650); break;
            case 4: setLocation(336,650); break;
            case 5: setLocation(196,650); break;
            case 6: setLocation(476,650); break;
        }
    }    
}
