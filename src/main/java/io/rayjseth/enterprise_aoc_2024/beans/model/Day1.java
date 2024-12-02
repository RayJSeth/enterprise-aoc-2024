package io.rayjseth.enterprise_aoc_2024.beans.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.rayjseth.enterprise_aoc_2024.beans.annotations.ListLengthEqual;
import io.rayjseth.enterprise_aoc_2024.beans.io.files.FileLineMapper;
import io.rayjseth.enterprise_aoc_2024.beans.io.files.FileProcessor;
import io.rayjseth.enterprise_aoc_2024.beans.math.NumberProcessor;
import jakarta.annotation.PostConstruct;
import lombok.Data;

@Component
@Data
@ListLengthEqual
public class Day1 {

    @Value("${file.path.day1}")
    private String filePath;

    private final FileProcessor fileProcessor;
    private final FileLineMapper fileLineMapper;
    private final NumberProcessor numberProcessor;
    private ArrayList<Integer> list1;
    private ArrayList<Integer> list2;

    @Autowired
    public Day1(FileProcessor fileProcessor, FileLineMapper fileLineMapper, NumberProcessor numberProcessor) {
        this.fileProcessor = fileProcessor;
        this.fileLineMapper = fileLineMapper;
        this.numberProcessor = numberProcessor;
        this.list1 = new ArrayList<Integer>();
        this.list2 = new ArrayList<Integer>();
    }

    @PostConstruct
    public void init() {
        List<String> fileLines = fileProcessor.processFile(this.filePath);
        for (String line : fileLines) {
            List<String> numbers = fileLineMapper.mapLineToNumbers(line);
            List<Integer> processedNumbers = numbers.stream().map(numberProcessor::process)
                    .collect(Collectors.toUnmodifiableList());
            this.list1.add(processedNumbers.get(0));
            this.list2.add(processedNumbers.get(1));
        }
    }
}
