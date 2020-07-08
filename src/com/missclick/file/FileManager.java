package com.missclick.file;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 *
 * @author missclickTeam
 */
public class FileManager {
    
    private final Charset UTF8 = StandardCharsets.UTF_8;
    private Path filePath;
    private List<String> fileLines;
    
    public FileManager(Path filePath) {
        this.filePath = filePath;
    }
    
    public FileManager(String first, String... more) {
        this.filePath = Paths.get(first, more);
    }
    
    public FileManager(String fileName) {
        this.filePath = Paths.get(fileName);
    }
    
    //METODO
    
    private void writeFile(List<String> lines) throws IOException {
        readFile();
        fileLines.addAll(lines);
        Files.write(filePath, fileLines, UTF8, StandardOpenOption.CREATE);
    }
}
