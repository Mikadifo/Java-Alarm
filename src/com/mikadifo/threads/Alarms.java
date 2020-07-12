package com.mikadifo.threads;

import com.missclick.alarm.Alarm;
import com.missclick.file.FileManager;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author missclickTeam
 */
public class Alarms implements Runnable {
    
    private final Thread alarmsThread;
    private FileManager alarmFileManager;
    private LocalDateTime now;
    
    public Alarms(String name) {
        this.alarmsThread = new Thread(this, name);
    }
    
    public Alarms() {
        this.alarmsThread = new Thread(this);
    }
    
    public void start() {
        this.alarmsThread.start();
    }

    @Override
    public void run() {
        while (true) {
            readAlarms().stream()
                    .filter(this::isTime)
                    .findFirst()
                    .get();
                    //.sound
        }
    }
    
    private List<Alarm> readAlarms() {
        try {
            return alarmFileManager.getAlarms();
        } catch (IOException ex) {
            System.err.println("Error opening the file");
            return new ArrayList<>();
        }
    }
    
    public boolean isTime(Alarm alarm) {
        now = LocalDateTime.now();
        
        return alarm.getDay() == now.getDayOfMonth()
                && alarm.getHour() == now.getHour()
                && alarm.getMinute() == now.getMinute()
            ;
    }
    
    private void sound(Alarm alarm) {
        //empezar la alarma
        //poner en clase alarma
        //turnOff hacer combrobacion cuadno se apague
    }
    
}
