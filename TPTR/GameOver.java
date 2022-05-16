import greenfoot.*;
public class GameOver extends World
{
    public GameOver()
    {    
        super(1080, 720, 1); 
        prepare();
    }

    public void gameover()
    {
        setBackground("gameover.png");
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        revive revive = new revive();
        addObject(revive,540,662);
    }
}
