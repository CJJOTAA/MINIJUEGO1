import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ambulance extends Actor
{
   
    public void act() 
    {
        checkKey();
    }
    
    public void checkKey(){
    if(Greenfoot.isKeyDown("left")){
        if(getX()>=215){
            setLocation(getX() -2, getY());}
    }
    if(Greenfoot.isKeyDown("right")){
        if(getX()<=398){
            setLocation(getX() +2, getY());}
    }
    if(Greenfoot.isKeyDown("up")){        
            setLocation(getX(), getY()-2);
    }
    if(Greenfoot.isKeyDown("down")){        
            setLocation(getX(), getY()+2);
    }
    }
   
}
