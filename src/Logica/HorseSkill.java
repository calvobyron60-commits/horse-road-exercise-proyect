/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author byron
 */
public class HorseSkill {


    private int recorrido;
    private String name;
    private String horse = """
                         .``
               ._.-.___.' (`\\
              //(        ( `'
             '/ )\\ ).__. ) 
             ' <' `\\ ._/'\\
                `   \\     \\
        """ + name;

    public HorseSkill( int recorrido, String horse) {
        this.recorrido = recorrido;
        this.horse = horse;
    }
    
    public HorseSkill(){
        
    }
    /**
     * Makes the spaces for create horses movement 
     * 
     */
    
    public String moveHorse() {

        String espacios = " ".repeat(recorrido);

        String[] lineas = horse.split("\n");

        String resultado = "";

        for (String linea : lineas) {
            resultado += espacios + linea + "\n";
        }

        return resultado;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

}
