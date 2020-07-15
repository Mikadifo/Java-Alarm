package com.missclick.app;

import com.missclick.alarm.JFCalendario;
import com.missclick.threads.Alarms;

/**
 *
 * @author missclickTeam
 */
public class Main {
        
    public static void main(String[] args) {
        JFCalendario ventana = new JFCalendario();
        ventana.setVisible(true);
        
        Alarms alarmsThread = new Alarms();
        alarmsThread.start();
    }
    
}
