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

/**
 *
 * @author missclickTeam
 */
public class FileManager {
    
    private final Charset UTF_8 = StandardCharsets.UTF_8;
    private final Path filePath;
    
    public FileManager(Path filePath) {
        this.filePath = filePath;
    }
    
    public FileManager(String first, String... more) {
        this.filePath = Paths.get(first, more);
    }
    
    public FileManager(String fileName) {
        this.filePath = Paths.get(fileName);
    }
    
    private void writeFile(List<String> lines) throws IOException {
        Files.write(filePath, lines, UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
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
    private List<Alarm> getAlarms() throws IOException{
       return Files.lines(filePath, UTF_8).map(x ->x.split(";")).map(this::setAlarm).collect(toList());
       
    }   
    
}
