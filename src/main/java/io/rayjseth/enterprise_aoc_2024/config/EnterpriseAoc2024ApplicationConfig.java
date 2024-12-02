package io.rayjseth.enterprise_aoc_2024.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.rayjseth.enterprise_aoc_2024.beans.collections.ListSorter;
import io.rayjseth.enterprise_aoc_2024.beans.io.files.FileLineMapper;
import io.rayjseth.enterprise_aoc_2024.beans.io.files.FileProcessor;
import io.rayjseth.enterprise_aoc_2024.beans.io.files.FileReaderService;
import io.rayjseth.enterprise_aoc_2024.beans.io.streams.Printer;
import io.rayjseth.enterprise_aoc_2024.beans.math.NumberParser;
import io.rayjseth.enterprise_aoc_2024.beans.math.NumberProcessor;
import io.rayjseth.enterprise_aoc_2024.beans.model.Day1;
import io.rayjseth.enterprise_aoc_2024.solvers.Day1Solver;

@Configuration
public class EnterpriseAoc2024ApplicationConfig {

    @Bean
    public FileProcessor fileProcessor() {
        return new FileProcessor(fileReader());
    }

    @Bean
    public FileReaderService fileReader() {
        return new FileReaderService();
    }

    @Bean
    public FileLineMapper lineMapper() {
        return new FileLineMapper();
    }

    @Bean
    public NumberParser numberParser() {
        return new NumberParser();
    }

    @Bean
    public NumberProcessor numberProcessor() {
        return new NumberProcessor();
    }

    @Bean
    ListSorter listSorter() {
        return new ListSorter();
    }

    @Bean
    Printer printer() {
        // TODO: make configurable with props
        return new Printer(System.out);
    }

    @Bean
    Day1 day1() {
        return new Day1(fileProcessor(), lineMapper(), numberProcessor());
    }

    @Bean
    Day1Solver day1Solver() {
        return new Day1Solver(day1(), listSorter(), printer());
    }
}