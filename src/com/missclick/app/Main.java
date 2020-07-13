package com.missclick.app;

import com.missclick.alarm.Alarm;
import java.io.IOException;

/**
 *
 * @author missclickTeam
 */
public class Main {
        
    public static void main(String[] args) throws IOException {
        //EL INICIO DE TODO
        Alarm ala = new Alarm();
        ala.setOn(true);
        test asu = new test(ala);
        
        ala.sound();
    }
    
}
