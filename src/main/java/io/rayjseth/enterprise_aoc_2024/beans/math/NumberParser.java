package io.rayjseth.enterprise_aoc_2024.beans.math;

import org.springframework.stereotype.Component;

@Component
public class NumberParser {
    public int parse(String numberStr) {
        return Integer.parseInt(numberStr);
    }
}
