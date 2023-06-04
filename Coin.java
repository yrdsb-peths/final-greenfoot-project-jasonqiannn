import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Coin we seek.
 * 
 * @author Jason Qian
 * @version June 2023
 */
public class Coin extends Actor
{
    int speed = 1;

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
        
        // Remove coin and draw game over when coin gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if (getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
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
