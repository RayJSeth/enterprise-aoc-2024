package io.rayjseth.enterprise_aoc_2024.beans.io.files;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileProcessor {

    private final FileReaderService fileReaderService;

    @Autowired
    public FileProcessor(FileReaderService fileReaderService) {
        this.fileReaderService = fileReaderService;
    }

    public List<String> processFile(String filePath) {
        List<String> fileLines = fileReaderService.readFile(filePath);
        return fileLines;
    }
}