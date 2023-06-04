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
}
