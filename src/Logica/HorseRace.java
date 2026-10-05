/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Random;
import javax.swing.JLabel;
import Implements.RunnerHorseImpl;

/**
 *
 * @author byron
 * Main Horse road class here the whole horses behavior is managed
 */
public class HorseRace extends Thread implements RunnerHorseImpl {

    //Horses declaration
    private Horse localHorse;
    private Horse rivalHorse;
    private Horse thirdHorse;
    private Horse theHorse;//X
    //Comparator declaration
    private WinComparator comparator;
    //skills declaration 
    private HorseSkill skill;
    private HorseSkill skillRival;
    private HorseSkill skillRivalTwo;
    private HorseSkill theSkill;
    //Recorridos y velocidades de cada caballo
    private int recorridos[] = {0, 0, 0};
    int speeds[] = new int[3];
    //Distancia de la meta
    private int meta = 120;
    private Random ran = new Random();
    
    //private String horses[];
    private String horse = """
                         .``
               ._.-.___.' (`\\
              //(        ( `'
             '/ )\\ ).__. ) 
             ' <' `\\ ._/'\\
                `   \\     \\
        """;

    public HorseRace() {
        
    }

    public HorseRace(Horse localHorse, Horse rivalHorse, Horse thirdHorse) {
        this.localHorse = localHorse;
        this.rivalHorse = rivalHorse;
        this.thirdHorse = thirdHorse;
    } 

    @Override
    public void readSpeed() {

        //speed = ran.nextInt(1, 8);

        for (int i = 0; i < 3; i++) {
            speeds[i] = ran.nextInt(1, 8);
            recorridos[i] += speeds[i];
        }
             
        //recorrido += speed;
    }



    @Override
    public void startRoad(JLabel horseShower) throws InterruptedException{
        instanceClasses();
        while ( meta > recorridos[0] &&
                meta > recorridos[1] &&
                meta > recorridos[2]){
            
            readSpeed();

            if (comparator.winStatus()){
                horseShower.setText("");
                horseShower.setText(skill.moveHorse());
                Thread.sleep(150);
            }
        }

    }
    
    private void instanceClasses(){
        //Comparation
        comparator = new WinComparator(recorridos[2], meta, recorridos[0], recorridos[3]);
        
        //Skills
        
        skill = new HorseSkill(recorridos[0], horse);//skill
        skillRival = new HorseSkill(recorridos[1], horse);
        skillRivalTwo = new HorseSkill(recorridos[2], horse);
        //theSkill = new HorseSkill(recorrido, horse);
        
        //Horses

        localHorse = new Horse( recorridos[0], horse);
        rivalHorse = new Horse(recorridos[1], horse);
        thirdHorse = new Horse(recorridos[2], horse);
        
    }

}
