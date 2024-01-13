package iegcode.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {

    @Test
    void testBeforePeek() {
        List.of("Ibrahim", "El", "Gibran").stream()
                .map(name -> {
                    System.out.println("Before Change Name to Upper : " + name);
                    String upper = name.toUpperCase();
                    System.out.println("Change Name to Upper : " + upper);
                    return  upper;
                })
                .forEach(name -> System.out.println("Final Name : " + name));
    }

    @Test
    void testAfterPeek() {
        List.of("Ibrhaim", "El", "Gibran").stream()
                .peek(name -> System.out.println("Before Change Name to Upper : " + name))
                .map(name -> name.toUpperCase())
                .peek(upper -> System.out.println("Change Name to Upper : " + upper))
                .forEach(name -> System.out.println("Final Name : " + name));
    }
}
