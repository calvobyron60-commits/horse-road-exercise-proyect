/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Implements.RacerHorseImpl;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JLabel;

/**
 *
 * @author byron
 */
public class RuningHorse extends Thread implements RacerHorseImpl {

    private String horseName;
    private int recorrido;

    //
    private RaceStatus raceStatus;
    private final CountDownLatch SameStart;
    private final CountDownLatch endRace;
    private WinComparator comparator;
    private HorseSkill skill;
    private JLabel horseShower;

    public RuningHorse(String horseName,
            RaceStatus raceStatus,
            CountDownLatch SameStart,
            CountDownLatch endRace) {
        this.horseName = horseName;
        this.raceStatus = raceStatus;
        this.SameStart = SameStart;
        this.endRace = endRace;
        skill = new HorseSkill();
    }

    public int getRecorrido() {
        return recorrido;
    }

    public String getHORSE_NAME() {
        return horseName;
    }

    public void setHorseShower(JLabel horseShower) {
        this.horseShower = horseShower;
    }

    @Override
    public void startRace() {
        try {

            SameStart.await();
            while (recorrido < raceStatus.META) {

                int advance = ThreadLocalRandom.current().nextInt(1, 8);
                recorrido = Math.min(recorrido + advance, raceStatus.META);
                
                skill.setRecorrido(recorrido);
                skill.setName(horseName);
                String horseText = skill.moveHorse();
                javax.swing.SwingUtilities.invokeLater(() -> {
                    horseShower.setText("<html><pre>" + horseText + "</pre></html>");
                });
                Thread.sleep(150);
                
                if (recorrido == raceStatus.META){
                    if (raceStatus.winScreamer()){
                        System.out.println("GG's");
                    }else{
                        System.out.println("you lose");
                    }
                }
                

            }

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            endRace.countDown();
        }

    }

    @Override
    public void run() {
        startRace();
    }

}
