import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class House here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class House extends Actor
{
    /**
     * Act - do whatever the House wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public House() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 50, image.getHeight() - 50);
        setImage(image);
    }
    public void act() 
    {
        move(-5);
    }    
}
