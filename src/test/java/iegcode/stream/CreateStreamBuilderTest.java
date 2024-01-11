package iegcode.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {

    // cara manual
    @Test
    void testCreateStreamBuild() {
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Ibrahim");
        builder.add("El").add("Gibran");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    // cara lebih simple
    @Test
    void testCreateStreamSimplify() {
        Stream<Object> stream = Stream.builder()
                .add("Ibrahim").add("El").add("Gibran").build();

        stream.forEach(System.out::println);
    }
}
