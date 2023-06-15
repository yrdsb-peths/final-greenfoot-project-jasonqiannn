import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road extends Actor
{
    int speed = 1;

    /**
     * Act - do whatever the Road wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        // If road line is touching the barrier, replace it at the top of the screen
        if (isTouching(Barrier.class))
        {
            setLocation(300, 0);
        }
        // If level is back at 0, freeze the roadlines
        MyWorld world = (MyWorld) getWorld();
        if (world.level == 0)
        {
            speed = 0;
        }
    }

    /**
     * Speed of the road
     *
     */
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}

