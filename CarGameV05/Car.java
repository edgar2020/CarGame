import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class crate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Car extends Tile
{
    private int delay = 0;
    World myWorld;
    private int p;
    int speed = 0;
    public Car(boolean right)
    { 
        int temp = Greenfoot.getRandomNumber(10);
        GreenfootImage car = getImage();   
        
        setImage(car);
        if(temp%2==0)
            setImage("car01.png");
        if(!right)
        {
            setRotation(180);
            speed = Greenfoot.getRandomNumber(6)+5;
        }
        else
        {
            setRotation(0);
            speed = Greenfoot.getRandomNumber(3)+1;
        }
    }
    public void act() 
    {
        move(speed);
        if(getX()<1)
        {
            setLocation(700, getY());
        }
        else if(getX()>697)
        {
            setLocation(0, getY());
        }
    }
}












