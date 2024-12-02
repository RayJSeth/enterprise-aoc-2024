package io.rayjseth.enterprise_aoc_2024.beans.io.streams;

import java.io.PrintStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Printer {
    private final PrintStream printStream;

    @Autowired
    public Printer(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void println(int msg) {
        printStream.println(msg);
    }
}
