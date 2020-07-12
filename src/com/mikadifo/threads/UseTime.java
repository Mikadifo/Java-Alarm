package com.mikadifo.threads;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author missclickTeam
 */
public class UseTime extends Thread {

    //Hola
    Thread timer = new Thread();
    LocalDate dateOfBirth;
    LocalDateTime now;
    LocalDateTime finishTime;
    Period age;

    public UseTime(LocalDate dateOfBirth) {
        this.dateOfBirth=dateOfBirth;
        this.age = Period.between(dateOfBirth, LocalDate.now());
    }
    

    @Override
    public void run() {

        if (age.getYears() >= 18) {

            finishTime = now.plusHours(1);
            for (;;) {
                if (now.compareTo(finishTime) == 0) {
                    System.exit(0);
                }
            }

        } else {

            finishTime = now.plusSeconds(4);
            for (;;) {
                now = LocalDateTime.now();

                if (now.compareTo(finishTime) == 1) {

                    System.exit(0);
                }

            }
        }

    }
}
