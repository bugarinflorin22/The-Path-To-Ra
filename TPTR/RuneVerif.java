import greenfoot.*;
public class RuneVerif extends World
{
    static int sw = 0;
    public RuneVerif()
    {    
        super(1080, 720, 1); 
        prepare();
    }
    public void act(){
        if (UserInfo.isStorageAvailable()) {
         UserInfo myInfo = UserInfo.getMyInfo();
         sw = myInfo.getInt(3);
         if((myInfo.getInt(5) == 1 && PlayerForRunWorld.runaactiva == 1) || 
            (myInfo.getInt(6) == 1 && PlayerForRunWorld.runaactiva == 2) ||
            (myInfo.getInt(7) == 1 && PlayerForRunWorld.runaactiva == 3) ||
            (myInfo.getInt(8) == 1 && PlayerForRunWorld.runaactiva == 4) ||
            (myInfo.getInt(9) == 1 && PlayerForRunWorld.runaactiva == 5) ||
            ("Da".equals(myInfo.getString(4)) && PlayerForRunWorld.runaactiva == 6))
         sw = 7;
        }
        switch (sw){
        case 1: setBackground(new GreenfootImage("rbg1.png")); break;
        case 2: setBackground(new GreenfootImage("rbg2.png")); break;
        case 3: setBackground(new GreenfootImage("rbg3.png")); break;
        case 4: setBackground(new GreenfootImage("rbg4.png")); break;
        case 5: setBackground(new GreenfootImage("rbg5.png")); break;
        case 6: setBackground(new GreenfootImage("rbg6.png")); break;
        case 7: setBackground(new GreenfootImage("dublura.png")); break;
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
            urmatorul2 urmatorul = new urmatorul2();
            addObject(urmatorul,540,660);
    }
}
