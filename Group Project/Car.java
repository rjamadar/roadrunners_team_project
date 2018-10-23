import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Actor
{
    int obstaclesHit = 0;
    /**
     * Act - do whatever the Car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()+5);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()-5);
        }
        if (getY() == 60) {
            setLocation(getX(), getY()+10);
        }
        if (getY() == 330) {
            setLocation(getX(), getY()-10);
        }
        Actor obstacle = getOneIntersectingObject(Obstacle.class);
        if (obstacle != null) {
            getWorld().removeObject(obstacle);
            obstaclesHit++;
            if (obstaclesHit >= 10) {
                Greenfoot.stop();
            }
        }
    }    
}
