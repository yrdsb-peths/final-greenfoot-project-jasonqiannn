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
    GreenfootSound splatSound = new GreenfootSound("splat.mp3");
    GreenfootSound crashSound = new GreenfootSound("carcrash.mp3");  
    GreenfootImage[] car = new GreenfootImage[6];

    public Car()
    {
        // Array used for animating car exhaust fumes
        for(int i = 0; i < car.length; i++)
        {
            car[i] = new GreenfootImage("images/car_exhaust/exhaust" + i + ".png");
        }
        setImage(car[0]);
    }
    
    /**
     * Animate the exhaust
     */
    int imageIndex = 0;
    public void animateExhaust()
    {
        setImage(car[imageIndex]);
        imageIndex = (imageIndex + 1) % car.length;
    }
    
    public void act()
    {
        // Left key move left right key move right at a value of 7
        if(Greenfoot.isKeyDown("left"))
        {
            move(-7);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(7);
        }
        
        // Remove coin
        collect();
        
        // End game if collision
        hit();
        
        // Animate exhaust
        animateExhaust();
    }
    
    /**
    * Collect the coin and spawn new coin
    */
    public void collect()
    {
        // If car touching the coin remove it and spawn a new one
        if(isTouching(Coin.class))
        {
            removeTouching(Coin.class);
            MyWorld world = (MyWorld) getWorld();
            world.createCoin();
            world.increaseScore();
            coinSound.play();
        }
    }
    
    /**
     * Hit pedestrian or debris end game
     */
    public void hit()
    {
        // If car is touching pedestrian end the game
        if(isTouching(Pedestrian.class))
        {
            removeTouching(Pedestrian.class);
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
            splatSound.play();
        }
        // If car is touching debris end the game
        if(isTouching(Debris.class))
        {
            removeTouching(Debris.class);
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
            crashSound.play();
        }
    }
}
