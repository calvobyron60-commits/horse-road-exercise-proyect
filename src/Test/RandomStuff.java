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
public class RandomStuff {

    public static void main(String[] args) {
        Random r = new Random();
        int nums[] = {0, 0, 0};
        int sumatorias[] = new int[3];

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                nums[i] = r.nextInt(1, 8);
                System.out.println("Random number: " + nums[i]);
                sumatorias[i] += nums[i];
                System.out.println("Sumatoria #" + (i + 1) + " = " + sumatorias[i]);
            }
        }

    }

}
