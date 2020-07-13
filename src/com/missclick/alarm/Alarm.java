package com.missclick.alarm;

import com.missclick.file.FileManager;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author missclickTeam
 */
public class Alarm {
    private FileManager soundsManager;
    
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
    public Alarm() { }

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
        setSound(1);
        
        while (on) {
            play();
        }
    }
    
    public void stop() {
        soundsManager.stop();
        setOn(false);
    }
    
    private void play() {
        try {
            soundsManager.play();
        } catch (LineUnavailableException | IOException | InterruptedException ex) {
            System.err.println("An error has been ocurred while playing the sound!!");
        }
    }
    
    private void setSound(int numSound) {
        switch (numSound) {
            case 1:
                soundsManager = new FileManager(null, "sounds", "Ghost Power.wav");
                break;
            case 2:
                //soundsManager = new FileManager(null, "sounds", "Ghost Power.wav");
                break;
            case 3:
                //soundsManager = new FileManager(null, "sounds", "Ghost Power.wav");
                break;
            default:
                //...
        }   
        
        try {
            soundsManager.setSound();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException ex) {
            System.err.println("An error has been ocurred openning the file");
        }
    }
    
}
