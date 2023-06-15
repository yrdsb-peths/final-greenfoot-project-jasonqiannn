import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World of my game.
 * 
 * @author Jason Qian
 * @version June 2023
 */
public class MyWorld extends World
{
    public int score = 0;
    int level = 4;
    int speed = 4;
    Label scoreLabel;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);

        // Create the road lines
        createRoad();
        createRoad2();
        createRoad3();
        createRoad4();
        createRoad5();
        createRoad6();
        createBarrier();
        
        //Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        // Create the car object
        Car car = new Car();
        addObject (car, 300, 500);  
        
        // Draw coin and pedestrian to screen
        createCoin();
        createPedestrian();
        createDebris();
    }
    
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over!", 100);
        Label restartLabel = new Label("Press R to restart!", 60);
        addObject(gameOverLabel, 300, 200);
        addObject(restartLabel, 300, 300);
        level = 0;
    }
    
    /**
     * Increase score and every 5 points increase speed by 1
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        // Every 5 scores, increase level by 1
        if(score % 5 == 0)
        {
            level += 1;
        }
    }

    /**
     * Create the road
     */
    public void createRoad()
    {
        Road road = new Road();
        int x = 300;
        int y = 0;
        addObject(road, x, y);
        road.setSpeed(level);
    }

    public void createRoad2()
    {
        Road road2 = new Road();
        int x = 300;
        int y = 100;
        addObject(road2, x, y);
        road2.setSpeed(level);
    }

    public void createRoad3()
    {
        Road road3 = new Road();
        int x = 300;
        int y = 200;
        addObject(road3, x, y);
        road3.setSpeed(level);
    }

    public void createRoad4()
    {
        Road road4 = new Road();
        int x = 300;
        int y = 300;
        addObject(road4, x, y);
        road4.setSpeed(level);
    }

    public void createRoad5()
    {
        Road road5 = new Road();
        int x = 300;
        int y = 400;
        addObject(road5, x, y);
        road5.setSpeed(level);
    }

    public void createRoad6()
    {
        Road road6 = new Road();
        int x = 300;
        int y = 500;
        addObject(road6, x, y);
        road6.setSpeed(level);
    }

    /**
     * Create barrier that is used for respawning
     */
    public void createBarrier()
    {
        Barrier barrier = new Barrier();
        int x = 300;
        int y = 600;
        addObject(barrier, x, y);
    }
    
    /**
     * Create a new coin at random location at top of screen
     */
    public void createCoin()
    {
        Coin coin = new Coin();
        coin.setSpeed(level);
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = 0;
        addObject(coin, x, y);
    }
    
    /**
     * Create a new pedestrian at random location at top of screen
     */
    public void createPedestrian()
    {
        Pedestrian pedestrian = new Pedestrian();
        pedestrian.setSpeed(level);
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = 0;
        addObject(pedestrian, x, y);
    }
    
    /**
     * Create a debris at random location at top of screen
     */
    public void createDebris()
    {
        Debris debris = new Debris();
        debris.setSpeed(level);
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = 0;
        addObject(debris, x, y);
    }

    /**
     * Main game loop to restart
     */
    public void act()
    {
        // Start the game if user presses R
        if(Greenfoot.isKeyDown("R"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
