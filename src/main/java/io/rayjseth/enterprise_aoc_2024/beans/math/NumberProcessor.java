package io.rayjseth.enterprise_aoc_2024.beans.math;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NumberProcessor {
    @Autowired
    private NumberParser numberParser;

    public int process(String number) {
        int parsedNumber = numberParser.parse(number);
        return parsedNumber;
    }
}