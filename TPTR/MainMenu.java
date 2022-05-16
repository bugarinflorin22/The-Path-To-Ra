import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    static GreenfootSound music = new GreenfootSound("music.mp3"); // Setam odata variabila pentru muzica.
    static GreenfootSound click = new GreenfootSound("click.mp3"); // Setam odata variabila pentru click.
    static int staremuzica = 1; // Setari default pentru muzica.
    static int stareef = 1; // Setari default pentru sound effects.
    public MainMenu()
    {    
        // Creem lumea aceasta fiind 720x1080 pixeli.
        super(1080, 720, 1);
        prepare();
    }
    
    public void act(){
        // Verificam starea muzicii.
        if(muzica.sw == 0){
        music.playLoop(); // Pornim muzica in loop.
        }else {
        music.stop(); // Oprim muzica.   
        }
    }
   
    private void prepare()
    {
        startb startb = new startb();
        addObject(startb,540,250);
        muzica muzica = new muzica();
        addObject(muzica,540,320);
        sound sound = new sound();
        addObject(sound,540,390);
        iesire iesire = new iesire();
        addObject(iesire,540,460);
        tutorial tutorial = new tutorial();
        addObject(tutorial,540,180);
    }
}
