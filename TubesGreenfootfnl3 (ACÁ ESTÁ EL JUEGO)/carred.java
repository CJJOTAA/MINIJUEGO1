import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class carred here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class carred extends parent
{
    int speed = -5;
    
    public void act() 
    {
        carred a = new carred();
        Actor i = getOneIntersectingObject(carblue.class);
        move(speed);
        checkdouble(i);
        end();
    } 
    
}
