package com.missclick.file;

import com.missclick.alarm.Alarm;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
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
    private final String PREFIX;
    
    private List<String> fileLines;
    
    public FileManager(Path FILE_PATH, String PREFIX) {
        this.FILE_PATH = FILE_PATH;
        this.PREFIX = PREFIX;
    }
    
    public FileManager(String PREFIX, String first, String... more) {
        this.FILE_PATH = Paths.get(first, more);
        this.PREFIX = PREFIX;
    }
    
    public FileManager(String fileName, String PREFIX) {
        this.FILE_PATH = Paths.get(fileName);
        this.PREFIX = PREFIX;
    }
    
    public void writeFile(List<String> lines) throws IOException {
        addLines(lines);
        writeFile();
    }
    
    public void writeFile(String line) throws IOException {
        addLine(line);
        writeFile();
    }
    
    private void writeFile() throws IOException {
        Files.write(FILE_PATH, fileLines, UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

    private Alarm setAlarm(String alarmLine[]) {
        return new Alarm(
                Integer.valueOf(alarmLine[0]),
                Integer.valueOf(alarmLine[1]), 
                Integer.valueOf(alarmLine[2]), 
                Integer.valueOf(alarmLine[3]), 
                alarmLine[4], 
                Integer.valueOf(alarmLine[5]), 
                alarmLine[6].equals("on")
            ); 
  
    }
    
    public List<Alarm> getAlarms() throws IOException{
       return Files.lines(FILE_PATH, UTF_8)
               .map(this::splitLine)
               .map(this::setAlarm)
               .collect(toList());
    }   
    
    private String[] splitLine(String line) {
        return line.split(PREFIX);
    }
    
    private void addLine(String line) throws IOException {
        fileLines = getFileLines();
        fileLines.add(line);
    }
    
    private void addLines(List<String> lines) throws IOException {
        fileLines = getFileLines();
        fileLines.addAll(lines);
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
        
        while (soundClip.isRunning()) {
            Thread.sleep(1000);
        }
        
        soundClip.close();
    }
    
    public void stop() {
        soundClip.close();
    }
    
}
