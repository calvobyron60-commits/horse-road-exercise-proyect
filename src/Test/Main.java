/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import java.util.Random;

/**
 *
 * @author byron
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("""
             ────────────────────────────────────────────────────────
             ──────────────────────────────────────────────≡≡≡──────
                           """);
//    private String moveHorse() {
//
//        String espacios = " ".repeat(recorrido);
//
//        String[] lineas = horse.split("\n");
//
//        String resultado = "";
//
//        for (String linea : lineas) {
//            resultado += espacios + linea + "\n";
//        }
//
//        return resultado;
//    }

        String r = """
                         .``
               ._.-.___.' (`\\
              //(        ( `'
             '/ )\\ ).__. ) 
             ' <' `\\ ._/'\\
                `   \\     \\
        """;
//        int recorrido = 30;
//        System.out.println(moverCaballo(r, recorrido));
        try {
            x(r, 100);
        } catch (InterruptedException e) {
        }
        

    }

    public static String moverCaballo(String caballo, int posicion) {

        String espacios = " ".repeat(posicion);

        String[] lineas = caballo.split("\n");

        String resultado = "";

        for (String linea : lineas) {
            resultado += espacios + linea + "\n";
        }

        return resultado;
    }

    public static void x(String caballo, int meta) throws InterruptedException {
        int posicion = 0;
        while (meta > posicion) {
            Random ran = new Random();
            int avance = ran.nextInt(1, 7);
            posicion += avance;

            limpiarPantalla();
            System.out.println(moverCaballo(caballo, posicion));
            Thread.sleep(150);

        }

    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
