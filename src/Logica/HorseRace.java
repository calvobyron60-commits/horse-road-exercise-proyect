/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Implements.RunnerHorse;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author byron
 * Main Horse road class here the whole horses behavior is managed
 */
public class HorseRace extends Thread implements RunnerHorse {

    private Horse localHorse;
    private Horse rivalHorse;
    private Horse thirdHorse;
    private WinComparator comparator;
    private HorseSkill skill;
    private int speed;
    private int recorrido = 0;
    private int recorridos[] = new int[3];
    int speeds[] = new int[3];
    private int meta = 120;
    private Random ran = new Random();
    private int rivalRecorrido = 0;
    private String horse = """
                         .``
               ._.-.___.' (`\\
              //(        ( `'
             '/ )\\ ).__. ) 
             ' <' `\\ ._/'\\
                `   \\     \\
        """ + localHorse.getHorseName();

    public HorseRace() {
        
    }

    @Override
    public void readSpeed() {

        speed = ran.nextInt(1, 8);
        
        speeds[0] = ran.nextInt(1, 8);
        speeds[1] = ran.nextInt(1, 8);
        speeds[2] = ran.nextInt(1, 8);
        
        recorridos[0] += speeds[0];
        recorridos[1] += speeds[1];
        recorridos[2] += speeds[2];
        
        recorrido += speed;
    }



    @Override
    public void startRoad(JLabel horseShower) throws InterruptedException{
        instanceClasses();
        while (meta > recorrido) {
            readSpeed();

            if (comparator.winStatus()){
                horseShower.setText("");
                horseShower.setText(skill.moveHorse());
                Thread.sleep(150);
            }
        }

    }
    
    private void instanceClasses(){
        
        comparator = new WinComparator(rivalRecorrido, meta, recorrido);
        skill = new HorseSkill(recorrido, horse);
        localHorse = new Horse( recorrido, horse);
        rivalHorse = new Horse(rivalRecorrido, horse);
        
    }
    

    
    private void getRivalPos(int pos){
        rivalRecorrido = pos;
    }


}
