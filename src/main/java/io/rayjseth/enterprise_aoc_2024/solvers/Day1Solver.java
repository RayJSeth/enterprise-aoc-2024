package io.rayjseth.enterprise_aoc_2024.solvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.rayjseth.enterprise_aoc_2024.beans.collections.ListSorter;
import io.rayjseth.enterprise_aoc_2024.beans.io.streams.Printer;
import io.rayjseth.enterprise_aoc_2024.beans.model.Day1;
import jakarta.validation.Valid;

@Component
public class Day1Solver {

    private final Day1 day1;
    private final ListSorter listSorter;
    private final Printer printer;

    @Autowired
    public Day1Solver(@Valid Day1 day1, ListSorter listSorter, Printer printer) {
        this.day1 = day1;
        this.listSorter = listSorter;
        this.printer = printer;
    }

    @SuppressWarnings("unchecked")
    public void solvePart1() {
        int sum = 0;
        listSorter.sortAll(null, day1.getList1(), day1.getList2());
        for (int i = 0; i < day1.getList1().size(); i++) {
            sum += Math.abs(day1.getList2().get(i) - day1.getList1().get(i));
        }
        printer.println(sum);
    }
}
