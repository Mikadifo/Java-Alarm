package com.missclick.alarm;

import java.awt.Toolkit;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author missclickTeam
 */
public class Alarm {
    //Attributes
    private int day;
    private int hour;
    private int minute;
    private int second;
    private String text;
    private int numSound;
    private boolean on;
    
    //Cons

    //doble
    public Alarm() {
    }

    public Alarm(int day, int hour, int minute, int second, String text, int numSound, boolean on) {
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.text = text;
        this.numSound = numSound;
        this.on = on;
    }
    //Getters and Setters

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getNumSound() {
        return numSound;
    }

    public void setNumSound(int numSound) {
        this.numSound = numSound;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public void sound() {
        while (on) {
            getSound();
        }
        
        //setOn(false);
        //clip.close() //cierra el archivo
    }
    
    private void getSound() { //its may need a new class
        String dir = "sounds";
        String file = "Ghost Power.wav";
        
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Paths.get(dir, file).toFile()));
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            
            while (clip.isRunning()) {
                Thread.sleep(1000);
            }
            
            clip.close();
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException | InterruptedException ex) {
            System.err.println("EOOROROORO"); //try catch en metodo run
        }
    }
    
}
