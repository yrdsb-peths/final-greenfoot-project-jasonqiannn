import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The car we drive.
 * 
 * @author Jason Qian
 * @version June 2023
 */
public class Car extends Actor
{
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound coinSound = new GreenfootSound("coinsound.mp3");
    
    public void act()
    {
        // Left key move left right key move right at a value of 5
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
        
        // Remove coin
        collect();

    }
    
    /**
    * Collect the coin and spawn new coin
    */
    public void collect()
    {
        // If elephant touching the apple remove it and spawn a new one
        if(isTouching(Coin.class))
        {
            removeTouching(Coin.class);
            MyWorld world = (MyWorld) getWorld();
            world.createCoin();
            coinSound.play();
        }
    }
}
