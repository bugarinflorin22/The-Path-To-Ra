import greenfoot.*;

public class iesire extends Actor
{
    public void act() 
    {
        // Daca mouse-ul se afla pe start, schimbam imaginea.
        if (Greenfoot.mouseMoved(this)){
        GreenfootImage hover = new GreenfootImage("iesireh.png");
        setImage(hover);
        // Altfel daca mouse-ul nu se afla pe start si nici pe ecran atunci schimbam inapoi imaginea.
        }else if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)){
        GreenfootImage nhover = new GreenfootImage("iesire.png");
        setImage(nhover);
        }
        // Verificam daca utilizatorul apasa pe aceasta clasa.
        if(Greenfoot.mouseClicked(this)){
        Greenfoot.stop(); // Iesim din joc
        // Verificam daca pornim sau nu sunetul.
        if(sound.sw == 0)
        MainMenu.click.play(); // Dam drumul la muzica !!
        }
    }    
}
