/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author byron
 */
public class WinComparator {

    private int rivalPos;
    private int meta;
    private int recorrido;

    public WinComparator(int rivalPos, int meta, int recorrido) {
        this.rivalPos = rivalPos;
        this.meta = meta;
        this.recorrido = recorrido;
    }

    public WinComparator() {
    }

    public boolean winStatus() {

        if (rivalPos < meta) {
            return true;
        }
        return false;

    }

    public boolean drawStatus(){
        if (rivalPos == meta && recorrido == meta) return true;
        return false;
    }
    
}
