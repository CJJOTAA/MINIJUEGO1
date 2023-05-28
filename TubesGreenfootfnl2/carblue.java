import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class carblue extends parent
{
    int speed = 3;
    Actor car = new carblue();
    
    public void act() 
    {
        end();
        checkDuplicate(car);
        move(speed);
    }    
}
