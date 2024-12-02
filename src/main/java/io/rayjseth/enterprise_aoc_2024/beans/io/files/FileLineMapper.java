package io.rayjseth.enterprise_aoc_2024.beans.io.files;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class FileLineMapper {
    public List<String> mapLineToNumbers(String line) {
        return Arrays.asList(line.split("\\s+"));
    }
}