package io.rayjseth.enterprise_aoc_2024.beans.collections;

import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ListSorter {
    public <T> void sort(Comparator<T> c, List<T> input) {
        input.sort(c);
    }

    public <T> void sortAll(Comparator<T> c, @SuppressWarnings("unchecked") List<T>... inputs) {
        for (List<T> list : inputs) {
            sort(c, list);
        }
    }
}
