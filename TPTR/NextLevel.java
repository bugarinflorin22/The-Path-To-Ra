import greenfoot.*;
public class NextLevel extends World
{
    public NextLevel()
    {    
        super(1080, 720, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        urmatorul urmatorul = new urmatorul();
        addObject(urmatorul,540,660);
    }
}
