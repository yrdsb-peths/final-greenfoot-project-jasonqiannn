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
        if (isAtEdge())
        {
            setLocation(300, 200);
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

