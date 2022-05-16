import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class muzica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class muzica extends Actor
{
    static int sw = 1;
    public void act() 
    {
        // Luam date din "baza de date".
        if (UserInfo.isStorageAvailable()) {
         UserInfo myInfo = UserInfo.getMyInfo();
         sw = myInfo.getInt(0); // Intializam variabila sw cu datele din baza.
        }
        // Verificam daca utilizatorul a apasat pe aceasta clasa.
        if(Greenfoot.mouseClicked(this) && sw == 0){
        // Verificam daca pornim sau nu sunetul.
        if(sound.sw == 0)
        Greenfoot.playSound("click.mp3"); // Pornim sound effect-ul.
        MainMenu.music.stop(); // Oprim muzica.
        // Inseram direct in "baza de date" setarile pentru muzica.
        if (UserInfo.isStorageAvailable()) {
         UserInfo myInfo = UserInfo.getMyInfo();
         myInfo.setInt(0, 1);
         myInfo.store();
        }
        }
        // Verificam daca utilizatorul a apasat pe aceasta clasa.
        if(Greenfoot.mouseClicked(this) && sw == 1){
        // Verificam daca pornim sau nu sunetul.
        if(sound.sw == 0)
        Greenfoot.playSound("click.mp3"); // Pornim sound effect-ul.
        // Inseram direct in "baza de date" setarile pentru muzica.
        if (UserInfo.isStorageAvailable()) {
         UserInfo myInfo = UserInfo.getMyInfo();
         myInfo.setInt(0, 0);
         myInfo.store();
        }
        }
        if(sw == 1)
        setImage("muzicah.png");
        else if (sw == 0)
        setImage("muzica.png");
    }    
}
