import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Road2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road2 extends Actor
{
    int speed = 3;

    /**
     * Act - do whatever the Road2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        if (isTouching(Barrier.class))
        {
            setLocation(300, 0);
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

