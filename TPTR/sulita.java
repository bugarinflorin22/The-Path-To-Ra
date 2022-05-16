
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sulita here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sulita extends Actor
{
    /**
     * Act - do whatever the sulita wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(RunWorld.score <= 10)
        setLocation(getX(),getY()+ 3 + RunWorld.lvl + RunWorld.score/2);
        else
        setLocation(getX(),getY()+ RunWorld.lvl + RunWorld.score);
        if(getY()>820 || getX()>911)
        getWorld().removeObject(this);
    }    
}
