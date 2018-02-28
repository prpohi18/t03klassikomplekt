/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t03klassikomplekttriisa;

public class Battleground {
    Soldier one;
    Soldier two;
    
    void start(){
        one = new Soldier(0, 0, 100, 30);
        two = new Soldier(50, 0, 100, 40);
    }
    boolean inRange(){
        return one.isInRange(two);
    }
   
    void move(int dx, int dy) {
        one.move(dx, dy);
    }
    
    void shootout(){
        if(inRange()){ 
            while(one.isAlive() == true && two.isAlive() == true){
                one.shoot(two);
                if(two.isAlive() == true) {
                    System.out.println("Sõdur üks lasi mööda.");
                    two.shoot(one);
                    if(one.isAlive() == false) {
                        System.out.println("Sõdur kaks lasi sõdur ühe maha.");
                    } else {
                        System.out.println("Sõdur kaks lasi mööda.");
                    }
                } else {
                    System.out.println("Sõdur üks lasi sõdur kahe maha.");
                }
            }
        }
    }
}
