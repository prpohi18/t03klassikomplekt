/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamesim;

/**
 *
 * @author erike
 */
public class basketball {
    protected int quarterLength;
    protected int attackTime;
    protected int quarterLengthSec;
    
    public basketball(int x, int y){
        this.quarterLength = x;
        this.attackTime = y;
        this.quarterLengthSec = x * 60;
    }
}
