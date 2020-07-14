package com.missclick.threads;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 *
 * @author missclickTeam
 */
public class UseTime extends Thread {

    private Thread timer = new Thread();
    private LocalDate dateOfBirth;
    private LocalDateTime now;
    private LocalDateTime finishTime;
    private Period age;

    public UseTime(LocalDate dateOfBirth) {
        this.dateOfBirth=dateOfBirth;
        this.age = Period.between(dateOfBirth, LocalDate.now());
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    @Override
    public void run() {
        now = LocalDateTime.now();
        if (age.getYears() >= 18) {

            finishTime = now.plusHours(1);
            for (;;) {
                now = LocalDateTime.now();
                if (now.compareTo(finishTime) == 1) {
                    System.exit(0);
                }
            }

        } else {

            finishTime = now.plusMinutes(15);
            for (;;) {
                now = LocalDateTime.now();

                if (now.compareTo(finishTime) == 1) {

                    System.exit(0);
                }

            }
        }

    }
    
}
