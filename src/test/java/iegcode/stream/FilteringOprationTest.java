package iegcode.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOprationTest {

    @Test
    void testFilter() {
        List.of("Ibrahim", "El", "Gibran", "Iegcode").stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);

        List.of(1,2,3,4,5,6,7,8).stream()
                .filter(number -> number % 2 ==0)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        List.of("Ibrahim", "El", "Ibrahim", "Gibran", "El", "Iegcode").stream()
                .distinct()
                .forEach(System.out::println);
    }
}
