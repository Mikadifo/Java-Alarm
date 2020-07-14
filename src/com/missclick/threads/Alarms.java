package com.missclick.threads;

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
public class Alarms extends Thread {
    
    private FileManager alarmFileManager;
    private LocalDateTime now;
    
    public Alarms() { }
    
    public Alarms(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        try {
            while (true) {
                readAlarms().stream()
                        .filter(this::isTime)
                        .findFirst()
                        .get()
                        .sound();
                        
                this.sleep(500); //set 60000 -> minute
            }
        } catch (InterruptedException e) {
            System.err.println("An interrupted Exception in thread: " + this.getName() + " has been ocurred!!");
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
    
}
