import greenfoot.*;

public class TutorialWorld extends World
{
    int currentslide = 0;
    static int tot = 0;
    public TutorialWorld()
    {    
        super(1080, 720, 1); 
    }
    public void act()
    {
        if (UserInfo.isStorageAvailable()) {
         UserInfo myInfo = UserInfo.getMyInfo();
         if("Da".equals(myInfo.getString(0)))
         tot = 1;
        }
        if(Greenfoot.mouseClicked(this))
        currentslide++;
        switch(currentslide){
            case 0: setBackground(new GreenfootImage("introducere.png")); break;
            case 1: setBackground(new GreenfootImage("introducere2.png")); break;
            case 2: setBackground(new GreenfootImage("introducere3.png")); break;
            case 3: setBackground(new GreenfootImage("introducere4.png")); break;
            case 4: setBackground(new GreenfootImage("introducere5.png")); break;
            case 5: finish(); Greenfoot.setWorld(new MainMenu()); break;
        }
    }
    public void finish()
    {
        if (UserInfo.isStorageAvailable()) {
         UserInfo myInfo = UserInfo.getMyInfo();
         myInfo.setString(0, "Da");
         myInfo.store();
        }
    }
}
