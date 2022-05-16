 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int acceleration = 1;
    int vSpeed = 0;
    int speed = 9;
    int jumpStrenght = 10;
    static int x = 0;
    public void act() 
    {
        CheckWallCollison();
        checkKeys();
        checkcoll();
        x = getX();
        if(getX() >= 1020 && getY() > 400)
        setLocation(1000,500);
        if(getX() <= 40 && getY() < 400)
        setLocation(60,200);
        if(getX() >= 900 && getY() < 200){
        String key = Greenfoot.ask("Care este cuvantul secret?");
        if(("distruge".equals(key) && PlayerForRunWorld.runaactiva == 1) || 
            ("razboi".equals(key) && PlayerForRunWorld.runaactiva == 2) || 
            ("dezvaluie".equals(key) && PlayerForRunWorld.runaactiva == 3) || 
            ("arde".equals(key) && PlayerForRunWorld.runaactiva == 4) || 
            ("uneste".equals(key) && PlayerForRunWorld.runaactiva == 5) || 
            ("ascunde".equals(key) && PlayerForRunWorld.runaactiva == 6)) {
        if (UserInfo.isStorageAvailable()) {
         UserInfo myInfo = UserInfo.getMyInfo();
         myInfo.setInt(2, 1 + myInfo.getInt(2));
         myInfo.store();
        }
        Greenfoot.setWorld(new Puzzle());
        }
        }
    }
    // Verificam colisiunea.
    public void checkcoll(){
        if(isTouching(ball.class) || isTouching(ball2.class))
        Greenfoot.setWorld(new world());
    }
    // Verificam coliziunea cu podeaua.
    public void CheckWallCollison()
    {
        Actor wall = getOneIntersectingObject(BottomWall.class);
        if(wall != null){
            setLocation (getX(), getY() - 10);
            vSpeed = 0;
        }
        else {
        Fall();
        }
    }
    // Setam gravitatea.
    public void Fall()
    {
        setLocation (getX(), getY() + vSpeed * 3 /2);
        if(vSpeed == -1)
        vSpeed = 1;
        if(vSpeed != 0)
        vSpeed = vSpeed += acceleration;
    }
    public void checkKeys()
    {
       if (Greenfoot.isKeyDown("left"))
       {
         moveLeft();
       }
       if(Greenfoot.isKeyDown("right"))
       {
          moveRight(); 
       }
       if(Greenfoot.isKeyDown("space"))
       {           
           if(vSpeed == 0)
           jump(); 
       }
    }
    public void jump()
    {
       vSpeed = -jumpStrenght;
       Fall();
    }
    public void moveLeft()
    {
       setLocation(getX() - speed, getY());  
    }
    public void moveRight()
    {
       setLocation(getX() + speed, getY());  
    }
}
