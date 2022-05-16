import greenfoot.*;
public class world extends World
{
    public world()
    {    
        super(1080, 720, 1); 
        prepare();
        addobj();
    }
    // Adaugam obstacole.
    public void addobj(){
        ball ball = new ball();
        addObject(ball,1080,670);
    }
    public void addobj2(){
        ball2 ball2 = new ball2();
        addObject(ball2,20,460);
    }
    public void act ()
    {
        if(Player.x == 1020)
        addobj2();
    }
    private void prepare()
    {
        Player player = new Player();
        addObject(player,30,645);
        BottomWall wall = new BottomWall();
        addObject(wall,300,705);
        BottomWall wall2 = new BottomWall();
        addObject(wall2,800,705);
        BottomWall wall3 = new BottomWall();
        addObject(wall3,300,495);
        BottomWall wall4 = new BottomWall();
        addObject(wall4,590,495);
        BottomWall wall5 = new BottomWall();
        addObject(wall5,300,230);
        BottomWall wall6 = new BottomWall();
        addObject(wall6,590,230);
    }
}
