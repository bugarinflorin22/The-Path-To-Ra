import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class urmatorul2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class urmatorul2 extends Actor
{
    /**
     * Act - do whatever the urmatorul2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Daca mouse-ul se afla pe start, schimbam imaginea.
        if (Greenfoot.mouseMoved(this)){
        GreenfootImage hover = new GreenfootImage("urmatorulh.png");
        setImage(hover);
        // Altfel daca mouse-ul nu se afla pe start si nici pe ecran atunci schimbam inapoi imaginea.
        }else if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)){
        GreenfootImage nhover = new GreenfootImage("urmatorul.png");
        setImage(nhover);
        }
        // Verificam daca utilizatorul apasa pe aceasta clasa.
        if(Greenfoot.mouseClicked(this)){
        if(RuneVerif.sw != 7){
        Greenfoot.setWorld(new world()); // Ne mutam pe alta scena !
        PlayerForRunWorld.verrunes();
        }
        else
        Greenfoot.setWorld(new MainMenu());
        // Verificam daca pornim sau nu sunetul.
        if(sound.sw == 0)
        MainMenu.click.play(); // Dam drumul la muzica !!
        }
    }    
}
