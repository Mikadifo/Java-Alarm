package com.mikadifo.threads;

/**
 *
 * @author missclickTeam
 */
public class Alarms implements Runnable {
    
    private final Thread alarmsThread;
    
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
        
    }
    
}
