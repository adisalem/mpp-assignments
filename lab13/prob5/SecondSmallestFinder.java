package lab13.prob5;

import java.time.LocalDate;
import java.util.*;

public class SecondSmallestFinder {
   
    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
        if (list == null || list.size() < 2) {
            throw new IllegalArgumentException("List must have at least two elements");
        }
        T smallest = null;
        T second = null;
        for (T item : list) {
            if (smallest == null || item.compareTo(smallest) < 0) {
                second = smallest;
                smallest = item;
            } else if (!item.equals(smallest) && (second == null || item.compareTo(second) < 0)) {
                second = item;
            }
        }
        if (second == null) {
            throw new IllegalArgumentException("List must have at least two unique elements");
        }
        return second;
    }


    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 2, 7, 2, 5);
        System.out.println(secondSmallest(nums)); 
        List<LocalDate> dates = Arrays.asList(
            LocalDate.of(2021, 1, 1),
            LocalDate.of(2020, 1, 1),
            LocalDate.of(2022, 1, 1)
        );
        System.out.println(secondSmallest(dates));
    }
}
