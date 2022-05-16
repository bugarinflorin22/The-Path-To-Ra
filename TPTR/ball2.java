
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball2 extends Actor
{
    /**
     * Act - do whatever the ball2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(getX() >= 950)
        getWorld().removeObject(this);
        move(5);
    }    
}
