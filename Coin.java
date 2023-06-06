import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Coin we seek.
 * 
 * @author Jason Qian
 * @version June 2023
 */
public class Coin extends Actor
{
    int speed = 3;

    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Coin falls downwards. 
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        // Respawn the coin if it is touching the barrier
        MyWorld world = (MyWorld) getWorld();
        if (isTouching(Barrier.class))
        {
            setLocation(x, 0);
        }
    }

    /**
     * Speed of the coin
     *
     */
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
