package iegcode.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetivingOperatorTest {

    @Test
    void testLimit() {
        List.of("Iegcode", "Ibrahim", "El", "Gibran", "Berti").stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Iegcode", "Ibrahim", "El", "Gibran", "Berti").stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Ieg" ,"Iegcode", "Ibrahim", "El", "Gibran", "Berti").stream()
                .takeWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Ieg" ,"Iegcode", "Ibrahim", "El", "Gibran", "Berti").stream()
                .dropWhile(name -> name.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional = List.of("Ieg" ,"Iegcode", "Ibrahim", "El", "Gibran", "Berti").stream()
                .findAny();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }
    @Test
    void testFindFirst() {
        Optional<String> optional = List.of("Ieg" ,"Iegcode", "Ibrahim", "El", "Gibran", "Berti").stream()
                .findFirst();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }
}
