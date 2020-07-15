package com.missclick.file;

import com.missclick.alarm.Alarm;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author missclickTeam
 */
public class FileManager {
    
    private AudioInputStream sound;
    private Clip soundClip;
    
    private final Charset UTF_8 = StandardCharsets.UTF_8;
    private final Path FILE_PATH;
    private final String SEPARATOR;
        
    public FileManager(Path FILE_PATH, String SEPARATOR) {
        this.FILE_PATH = FILE_PATH;
        this.SEPARATOR = SEPARATOR;
    }
    
    public FileManager(String SEPARATOR, String first, String... more) {
        this.FILE_PATH = Paths.get(first, more);
        this.SEPARATOR = SEPARATOR;
    }
    
    public FileManager(String fileName, String SEPARATOR) {
        this.FILE_PATH = Paths.get(fileName);
        this.SEPARATOR = SEPARATOR;
    }
    
    public void writeFile(String line) throws IOException {
        writeFile(Arrays.asList(line));
    }
    
    public void writeFile(List<String> lines) throws IOException {
        Files.write(FILE_PATH, lines, UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

    private Alarm setAlarm(String alarmLine[]) {
        return new Alarm(
                Integer.valueOf(alarmLine[0]),
                Integer.valueOf(alarmLine[1]), 
                Integer.valueOf(alarmLine[2]), 
                alarmLine[3], 
                Integer.valueOf(alarmLine[4]), 
                alarmLine[5].equals("on")
            ); 
  
    }
    
    public List<Alarm> getAlarms() throws IOException{
       return Files.lines(FILE_PATH, UTF_8)
               .map(this::splitLine)
               .map(this::setAlarm)
               .collect(toList());
    }   
    
    private String[] splitLine(String line) {
        return line.split(SEPARATOR);
    }
    
    public List<String> getFileLines() throws IOException {
        return Files.readAllLines(FILE_PATH, UTF_8);
    }
    
    public void setSound() throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        soundClip = AudioSystem.getClip();
        sound = AudioSystem.getAudioInputStream(FILE_PATH.toFile());
    }
    
    public void play() throws LineUnavailableException, IOException, InterruptedException {
        soundClip.open(sound);
        soundClip.loop(Clip.LOOP_CONTINUOUSLY);
        
        
        while(soundClip.isOpen()) {
            Thread.sleep(1000);
        }
        
        soundClip.close();
    }
    
    public void stop() {
        soundClip.close();
    }
    
}
