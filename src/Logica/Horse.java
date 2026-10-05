/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author byron
 */
public class Horse {

    private String horseName;
    private int recorrido;
    private String horse;

    public Horse(int recorrido, String horse) {
        this.recorrido = recorrido;
        this.horse = horse;
    }
    public Horse(){
    }

    public void setHorseName(String name) {
        this.horseName = name;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setRecorrido(int recorrido) {
        this.recorrido = recorrido;
    }

    public int getRecorrido() {
        return recorrido;
    }
    
    

}
