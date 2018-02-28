/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03klassikomplekttriisa;

import java.util.Random;

/**
 *
 * @author Tyym
 */
public class Soldier {
    protected int x;
    protected int y;
    protected int range;
    protected int acc;
    protected boolean alive;

    public Soldier(int x, int y, int range, int acc){
        this.x=x;
        this.y=y;
        this.range=range;
        this.acc=acc;
        this.alive=true;
    }
    
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getR(){
        return range;
    }
    
    public double getDistance(Soldier second){
        double dx=getX()-second.getX();
        double dy=getY()-second.getY();
        return Math.sqrt(dx*dx+dy*dy);
    }
    
    public boolean isInRange(Soldier second){
        return getDistance(second)<this.getR();
    }
    
    public void move(int dx, int dy){ 
        x+=dx; y+=dy;
    }
    
    public boolean isAlive(){ 
        return alive;
    }
    
    public void shoot(Soldier second){ 
        Random rand = new Random();  
        int value = rand.nextInt(100);
        if(acc > value){
            second.alive = false;
        }
    }
}
