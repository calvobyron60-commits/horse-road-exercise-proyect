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
    private int thirdRivalPos;
    private int meta;
    private int recorrido;

    public WinComparator(int rivalPos, int meta, int recorrido, int thirdRivalPos) {
        this.rivalPos = rivalPos;
        this.meta = meta;
        this.recorrido = recorrido;
        this.thirdRivalPos = thirdRivalPos;
    }

    public WinComparator() {
    }

    public boolean winStatus() {

        if (rivalPos < meta || thirdRivalPos < meta) {
            return true;
        }
        return false;

    }

    public boolean drawStatus(){
        if (    rivalPos == meta && recorrido == meta ||
                thirdRivalPos == meta && recorrido == meta ||
                thirdRivalPos == meta && rivalPos == meta) return true;
        return false;
    }
    
}
