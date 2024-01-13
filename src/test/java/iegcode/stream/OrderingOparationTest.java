package iegcode.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOparationTest {

    @Test
    void testSorted() {
        List.of("Ieg" ,"Iegcode", "Ibrahim", "El", "Gibran", "Berti").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reversComparator = Comparator.reverseOrder();

        List.of("Ieg" ,"Iegcode", "Ibrahim", "El", "Gibran", "Berti").stream()
                .sorted(reversComparator)
                .forEach(System.out::println);
    }
}
