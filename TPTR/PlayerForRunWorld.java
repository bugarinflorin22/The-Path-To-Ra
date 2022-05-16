
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PlayerForRunWorld extends Actor
{
    static int posx = 0;
    static int runaactiva = 0;
    int lvl = 0;
    int score = 0;
    // Apelam toate functiile create.
    public void act() 
    {
        movementKey();
        collisonVer();
        posx = getX();
        lvl = RunWorld.lvl;
        score = RunWorld.score;
    }
    // Aceasta functie este pentru deplasarea jucatorului pe mapa.
    public void movementKey()
    {
        // Verificam daca se apasa de la tastatura tasta "D" sau 'sageata dreapta'.
        if(Greenfoot.isKeyDown("D") || Greenfoot.isKeyDown("right")){
            // Mutam jucatorul la dreapta cu 8 unitati.
            move(8 + RunWorld.score);
            setImage("caracterdreapta.png");
        }
        // Verificam daca se apasa de la tastatura tasta "A" sau 'sageata stanga'.
        if(Greenfoot.isKeyDown("A") || Greenfoot.isKeyDown("left")){
            // Mutam jucatorul la stanga cu 8 unitati.
            move(-8 - RunWorld.score);
            setImage("caracterstanga.png");
        }
    }
    // Aceasta functie este pentru verificarea coliziunii cu peretii.
    public void collisonVer()
    {
        // Daca jucatorul atinge peretele din staga acesta este respins la dreapta.
        if(isTouching(LeftWall.class))
        {
            move(8 + RunWorld.score);
        }
        // Daca jucatorul atinge peretele din dreapta acesta este respins la stanga.
        if(isTouching(RightWall.class))
        {
            move(-8 - RunWorld.score);
        }
        // Verificam daca jucatorul atinge una din sulite.
        if(isTouching(sulita.class) || isTouching(sulita2.class) || 
           isTouching(sulita3.class) || isTouching(arrow.class))
        {
            RunWorld.score = 0;
            if((lvl == 0 && score >= 20) || (lvl == 1 && score >= 35) || (lvl == 2 && score >= 45)
            || (lvl == 3 && score >= 60) || (lvl == 5 && score >= 75) || (lvl == 6 && score >= 100)){
            Greenfoot.setWorld(new NextLevel());
            } else {
            Greenfoot.setWorld(new GameOver());
            }
        }
        if (UserInfo.isStorageAvailable()) {
                UserInfo myInfo = UserInfo.getMyInfo();
                myInfo.setInt(3, runaactiva);
                myInfo.store();  
        }
        if(isTouching(bl1.class))
            runaactiva = 1;
        if(isTouching(bl2.class))
            runaactiva = 2;
        if(isTouching(bl3.class))
            runaactiva = 3;
        if(isTouching(bl4.class))
            runaactiva = 4;
        if(isTouching(bl5.class))
            runaactiva = 5;
        if(isTouching(bl6.class))
            runaactiva = 6;
    }
    static public void verrunes()
    {
    if (UserInfo.isStorageAvailable()) {
                UserInfo myInfo = UserInfo.getMyInfo();
                if(myInfo.getInt(5) == 0 || myInfo.getInt(6) == 0 || myInfo.getInt(7) == 0 || myInfo.getInt(8) == 0
                || myInfo.getInt(9) == 0 || "".equals(myInfo.getString(4))) {
                    if(runaactiva == 6)
                    myInfo.setString(4, "Da");
                    else
                    myInfo.setInt(4 + runaactiva, 1);  
                }
                myInfo.store();       
            }
    }
}
