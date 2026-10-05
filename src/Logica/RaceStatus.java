/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 *
 * @author byron
 * this might be the class that really create the winner message and
 * contains the 3 threads (depending about the future this can be changed)
 * 
 */
public class RaceStatus {

    public static final int META = 119;
    public static final int PLAYERS_QUANT = 3;
    // Control atómico: el primer hilo en cambiarlo de false a true es el ganador
    private final AtomicBoolean winnerStatus = new AtomicBoolean(false);
    
    public boolean winScreamer(){
        
        return winnerStatus.compareAndSet(false, true);
    }
    
    public boolean winnerExistenceStatus(){
        return winnerStatus.get();
    }

}
