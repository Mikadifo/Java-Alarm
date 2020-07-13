/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.missclick.app;

import com.missclick.alarm.Alarm;

/**
 *
 * @author MIKADIFO
 */
public class test extends Thread {
    
    Alarm ala;
    
    public test(Alarm ala) {
        this.start();
        this.ala = ala;
    }
    
    @Override
    public void run() {
        int i = 0;
        
        try {
            do {
                i ++;
                test.sleep(1000);
            } while (i != 5);
            
            System.out.println("YA");
            ala.stop();
        } catch (InterruptedException e) {
            System.err.println("EEOOEOEOEOEOOEOMAEMIA");
        }
    }
    
}
