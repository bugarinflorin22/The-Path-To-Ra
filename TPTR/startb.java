import greenfoot.*;

public class startb extends Actor
{
    public void act() 
    {
        // Daca mouse-ul se afla pe start, schimbam imaginea.
        if (Greenfoot.mouseMoved(this)){
        GreenfootImage hover = new GreenfootImage("starth.png");
        setImage(hover);
        // Altfel daca mouse-ul nu se afla pe start si nici pe ecran atunci schimbam inapoi imaginea.
        }else if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)){
        GreenfootImage nhover = new GreenfootImage("start.png");
        setImage(nhover);
        }
        // Verificam daca utilizatorul apasa pe aceasta clasa.
        if(Greenfoot.mouseClicked(this)){
        if(TutorialWorld.tot == 0)
        Greenfoot.setWorld(new TutorialWorld()); // Ne mutam pe alta scena !
        else
        Greenfoot.setWorld(new RunWorld()); // Ne mutam pe alta scena !
        // Verificam daca pornim sau nu sunetul.
        if(sound.sw == 0)
        MainMenu.click.play(); // Dam drumul la muzica !!
        }
    }    
}
