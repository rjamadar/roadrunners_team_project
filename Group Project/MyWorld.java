import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int spawnTimer = 0;
    int houseTimer = 0;
    int obstacleTimer = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        GreenfootImage bg = new GreenfootImage("backgroundTemp.png");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        Car car1 = new Car();
        addObject (car1, 70, 200);
        setPaintOrder(Car.class, Bomb.class, Obstacle.class, Line.class, Tree.class, House.class);
    }
    public void act() {
        Tree tree1 = new Tree();
        Tree tree2 = new Tree();
        Line line1 = new Line();
        Line line2 = new Line();
        Line line3 = new Line();
        House house1 = new House();
        House house2 = new House();
        Obstacle obstacle1 = new Obstacle();
        Obstacle obstacle2 = new Obstacle();
        Obstacle obstacle3 = new Obstacle();
        spawnTimer++;
        houseTimer++;
        obstacleTimer++;
        if (spawnTimer == 15) {
            addObject (tree1, 600, Greenfoot.getRandomNumber(30));
            addObject (tree2, 600, Greenfoot.getRandomNumber(50) + 350); 
            spawnTimer = 0;
        }
        if (spawnTimer == 14) {
            addObject (line1, 600, 200);
            addObject (line2, 600, 100);
            addObject (line3, 600, 300);
        }
        if (houseTimer == 40) {
            addObject (house1, 600, Greenfoot.getRandomNumber(30) + 370);
            addObject (house2, 600, Greenfoot.getRandomNumber(30));
            houseTimer = 0;
        }
        if (obstacleTimer == 50) {
            addObject (obstacle1, 600, Greenfoot.getRandomNumber(400) - 100);
        }
        if (Greenfoot.getRandomNumber(20) == 5) {
            addObject (obstacle2, 600, Greenfoot.getRandomNumber(400) - 100);
        }
    }
}
