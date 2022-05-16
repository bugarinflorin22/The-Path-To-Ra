import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sulita2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sulita2 extends Actor
{
    /**
     * Act - do whatever the sulita2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(),getY()+ 5 + RunWorld.lvl);
        if(getY()>820 || getX()>911)
        getWorld().removeObject(this);
        setRotation(20);
        move(-1);
    }    
}
