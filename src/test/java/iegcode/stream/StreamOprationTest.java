package iegcode.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOprationTest {

    @Test
    void testStreamOpration(){
        List<String> names = List.of("Ibrahim", "El", "Gibran");

        Stream<String> streamNames = names.stream();
        Stream<String> streamUpper = streamNames.map(name -> name.toUpperCase()); // map itu seperti mmerubah data asli

        streamUpper.forEach(System.out::println);
        names.forEach(System.out::println);
    }
}
