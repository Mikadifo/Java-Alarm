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
    
    private final Charset UTF_8 = StandardCharsets.UTF_8;
    private Path filePath;
    
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

}
