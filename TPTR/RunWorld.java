import greenfoot.*;

public class RunWorld extends World
{
    boolean swscore = true; // // Declaram o variabila globala de tip boolean.
    int addscore = 0; // Declaram o variabila globala de tip int pentru scor.
    int time = 0; // Declaram o variabila globala de tip int pentru timp.
    int rnb = 0; // Declaram o variabila globala de tip int pentru un numar generat aleatoriu.
    static int lvl = 0; // Declaram o variabila globala de tip int pentru level-ul curent.
    String scoretxt = "Scor: " + score; // Declaram o variabila de tip string pentru scorul de pe ecran.
    public static int score = 0; // Definim o variablia pentru scor.
    public static int locationsw = 1; // Definim o variabila statica deoarece vrem sa ne folosim de ea si in alte classe
    
    // Apelam toate functiile create.
    public void act(){      
        showText(scoretxt, 530, 20); // Afisam scorul pe ecran.
        scoretxt = "Scor: " + score; // Actualizam scorul constant si pe ecran.
        // Verificam level-ul si scorul.
        if((lvl == 0 && score == 20) || (lvl == 1 && score == 35) || (lvl == 2 && score == 45)
            || (lvl == 3 && score == 60) || (lvl == 5 && score == 75) || (lvl == 6 && score == 100)){
        String ptxt = "Ai toate punctele necesare !"; // Anuntam jucatorul cand punctele sunt suficiente.    
        showText(ptxt, 800, 20); // Afisam un mesaj pe ecran.
        }
        addObjects();
        addRunes();           
        timer();
    }
    // Consturim ecranul.
    public RunWorld()
    {    
        // Creem o lume de 1080x720 pixeli, apoi setam o lume fara margini.
        super(1080, 720, 1, false);
        prepare();
    }
    // Timpul din joc
    public void timer (){
        // Verificam daca timpul ajunge la 100.
        if(time == 100){
        addscore++;
        time = 0; // Resetam timpul.
        swscore = true; // Modificam swscore pentru a o folosii din nou.
        }
        time++; // Adaugam +1 la timp.
        // Astfel din toate cele 3 comenzi de sus obtinem un ceas de care ne putem folosii.
        if(addscore > 5)
        addscore = 0; // Resetam score delay. 
        // Crestem scorul in functie de timp.   
        if(addscore == 5 && swscore == true)
        {
            swscore = false;
            score++;
        }
    }
    // Adaugam obstacole pentru jucatorul nostru.
    public void addObjects()
    {
        if (UserInfo.isStorageAvailable()) {
         UserInfo myInfo = UserInfo.getMyInfo();
         lvl = myInfo.getInt(2);
        }
        if(((time == 50 || time == 0) && score < 16) || ((time == 50 || time == 0 || time == 75) && score >= 16)){
        sulita sulita = new sulita();
        addObject(sulita,150+Greenfoot.getRandomNumber(912),-100);
        if(lvl >= 3){
        sulita2 sulita2 = new sulita2();
        addObject(sulita2,500+Greenfoot.getRandomNumber(912),-100);
        sulita3 sulita3 = new sulita3();
        addObject(sulita3,180+Greenfoot.getRandomNumber(600),-100);
        }
        if(lvl >= 1 && addscore == 3){
        arrow arrow = new arrow();
        addObject(arrow,PlayerForRunWorld.posx,-100);
        }
        }
    }
    // Adugam rune.
    public void addRunes(){
        setPaintOrder(PlayerForRunWorld.class); // Punem jucatorul inaintea tuturor obiectelor.
        if(time == 100) // Verificam daca ceasul se imparte la 20.
        rnb = 1+Greenfoot.getRandomNumber(6); // Setam un numar aleatoriu intre 1 si 6.     
        locationsw = rnb; // Setam o locatie aleatorie pentru rune in functie de rnb.
    }
    // Salvam datele jucatorului.
    public static void saveData()
    {
        if (UserInfo.isStorageAvailable()) {
         UserInfo myInfo = UserInfo.getMyInfo();
         myInfo.setScore(score);
         myInfo.store();
        }
    }
    // Initializam variabile cu valori din "baza de date".
    public void getData()
    {
        if (UserInfo.isStorageAvailable()) {
         UserInfo myInfo = UserInfo.getMyInfo();
         score = myInfo.getScore();
        }
    }
    // Construim harta.
    private void prepare()
    {
        PlayerForRunWorld playerForRunWorld = new PlayerForRunWorld();
        addObject(playerForRunWorld,540,650);
        LeftWall wall = new LeftWall();
        addObject(wall,95,400);
        RightWall wall2 = new RightWall();
        addObject(wall2,990,400);
        bl1 bl1 = new bl1();   
        addObject(bl1,196,650);
        bl2 bl2 = new bl2();
        addObject(bl2,336,650);
        bl3 bl3 = new bl3();
        addObject(bl3,476,650);
        bl4 bl4 = new bl4();
        addObject(bl4,614,650);
        bl5 bl5 = new bl5();
        addObject(bl5,754,650);
        bl6 bl6 = new bl6();
        addObject(bl6,884,650);
    }   
}
