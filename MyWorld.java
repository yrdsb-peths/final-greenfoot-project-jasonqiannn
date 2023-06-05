import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World of my game.
 * 
 * @author Jason Qian
 * @version June 2023
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);

        // Create the road
        createRoad();
        createRoad2();
        createRoad3();
        createRoad4();
        createBarrier();

        // Create the car object
        Car car = new Car();
        addObject (car, 300, 350);  
        
        // Draw coin to screen
        createCoin();
    }
    
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }

    /**
     * Create a new coin at random location at top of screen
     */
    public void createCoin()
    {
        Coin coin = new Coin();
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = 0;
        addObject(coin, x, y);
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
    }

    public void createRoad2()
    {
        Road road = new Road();
        int x = 300;
        int y = 100;
        addObject(road, x, y);
    }

    public void createRoad3()
    {
        Road road = new Road();
        int x = 300;
        int y = 200;
        addObject(road, x, y);
    }

    public void createRoad4()
    {
        Road road = new Road();
        int x = 300;
        int y = 300;
        addObject(road, x, y);
    }

    public void createBarrier()
    {
        Barrier barrier = new Barrier();
        int x = 300;
        int y = 400;
        addObject(barrier, x, y);
    }
    
}
