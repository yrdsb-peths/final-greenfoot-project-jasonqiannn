import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Debris we don't want to crash into.
 * 
 * @author Jason Qian
 * @version June 2023
 */
public class Debris extends Actor
{
    int speed = 1;

    /**
     * Act - do whatever the Pedestrian wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        // Respawn debris if touching barrier
        MyWorld world = (MyWorld) getWorld();
        if (isTouching(Barrier.class))
        {
            world.removeObject(this);
            world.createDebris();
        }
    }
    
    /**
     * Speed of the debris
     *
     */
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}