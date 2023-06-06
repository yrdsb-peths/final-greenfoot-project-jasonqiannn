import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Pedestrian on the sidewalk.
 * 
 * @author Jason Qian
 * @version June 2023
 */
public class Pedestrian extends Actor
{
    int speed = 3;

    /**
     * Act - do whatever the Pedestrian wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        // Remove pedestrian if touching barrier
        MyWorld world = (MyWorld) getWorld();
        if (isTouching(Barrier.class))
        {
            world.removeObject(this);
        }
    }
}
