/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/**
 *
 * @author rafae
 */
public class Position {
    private int row;
    private int colomn;
    
    public Position(int row, int colomn){
        this.row = row;
        this.colomn = colomn;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColomn() {
        return colomn;
    }

    public void setColomn(int colomn) {
        this.colomn = colomn;
    }
    
    @Override
    public String toString(){
        return row + ", "+ colomn;
    }
    
    
    
}
