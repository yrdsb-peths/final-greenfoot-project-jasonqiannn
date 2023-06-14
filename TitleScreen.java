import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Jason Qian
 * @version June 2023
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("ARISTO DRIVE", 80);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        titleLabel.setLocation(300, 50);
        Label label = new Label("Press <SPACE> to Start!", 40);
        addObject(label,300,550);
        Label label2 = new Label("Use \u2190 and \u2192 to move!", 30);
        addObject(label2,300,575); 
        Label label3 = new Label("Collect coins and avoid oncoming", 30);
        addObject(label3,225,100); 
        Label label4 = new Label("debris and pedestrians as you drive", 30);
        addObject(label4,235,130); 
        Car car = new Car();
        addObject(car,35,50);
        Car car2 = new Car();
        addObject(car2,565,50);
    }
}
