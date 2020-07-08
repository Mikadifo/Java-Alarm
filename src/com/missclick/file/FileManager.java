package com.missclick.file;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 *
 * @author missclickTeam
 */
public class FileManager {
    
    private Path filePath;
    private List<String> fileLines;
    
    //METODO
    
    private void writeFile(List<String> lines) throws IOException {
        fileLines = Files.readAllLines(filePath, cs);
        Files.write(filePath, lines, StandardCharsets.UT, StandardOpenOption.CREATE);
    }
}
