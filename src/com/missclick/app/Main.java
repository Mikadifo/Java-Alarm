package com.missclick.app;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author missclickTeam
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        //EL INICIO DE TODO
        
        String dirName = "files";
        String fileName = "alarms.txt";
        
        String line = "";
        //{"01,22,1212", "2222,22222,22222", "ho,la,test"};
        String[] lines = new String[] {"3,13,1,3,1,3,321,32", "ALV"};
        
        Path pathF = Paths.get(dirName, fileName);
        
        List<String> linesA = Files.readAllLines(pathF, StandardCharsets.UTF_8);
        linesA.addAll(Arrays.asList(lines));
                
    }
    
}
