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
public class BoardExeception extends RuntimeException {
    private static final long serialVersionUID = 1L;
    
    public BoardExeception(String msg){
        super(msg);
    }
}
