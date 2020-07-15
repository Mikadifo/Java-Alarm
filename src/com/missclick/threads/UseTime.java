package com.missclick.threads;

import com.missclick.alarm.JFAlarma;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 *
 * @author missclickTeam
 */
public class UseTime extends Thread {

    private JFAlarma ventana;
    private LocalDateTime now;
    private LocalDateTime finishTime;
    private final Period age;

    public UseTime(LocalDate dateOfBirth, JFAlarma ventana) {
        this.dateOfBirth = dateOfBirth;
        this.age = Period.between(dateOfBirth, LocalDate.now());
        this.ventana = ventana;
    }

    @Override
    public void run() {
        now = LocalDateTime.now();
        if (age.getYears() >= 18) {

            finishTime = now.plusHours(1);
            for (;;) {
                now = LocalDateTime.now();
                if (now.compareTo(finishTime) == 1) {
                    ventana.dispose();
                }
            }

        } else {

            finishTime = now.plusMinutes(15);
            for (;;) {
                now = LocalDateTime.now();

                if (now.compareTo(finishTime) == 1) {

                    ventana.dispose();
                }

            }
        }

    }

}
