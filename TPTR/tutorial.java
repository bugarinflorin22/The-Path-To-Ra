import greenfoot.*; 

public class tutorial extends Actor
{
    public void act() 
    {
        // Daca mouse-ul se afla pe start, schimbam imaginea.
        if (Greenfoot.mouseMoved(this)){
        GreenfootImage hover = new GreenfootImage("tutorialh.png");
        setImage(hover);
        // Altfel daca mouse-ul nu se afla pe start si nici pe ecran atunci schimbam inapoi imaginea.
        }else if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this)){
        if(TutorialWorld.tot == 0){
        GreenfootImage nhover = new GreenfootImage("tutorial.png");
        setImage(nhover);
        }
        else{
        GreenfootImage nhover = new GreenfootImage("tutorialh.png");
        setImage(nhover);
        }
        }
        // Verificam daca utilizatorul apasa pe aceasta clasa.
        if(Greenfoot.mouseClicked(this)){
        Greenfoot.setWorld(new TutorialWorld()); // Ne mutam pe alta scena !
        // Verificam daca pornim sau nu sunetul.
        if(sound.sw == 0)
        MainMenu.click.play(); // Dam drumul la muzica !!
        }
    }    
}
