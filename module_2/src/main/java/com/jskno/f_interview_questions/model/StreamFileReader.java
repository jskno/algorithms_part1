package com.jskno.f_interview_questions.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFileReader {

    public static void readFile(String filePath) throws IOException {
        try (Stream<String> lines = Files.lines(Path.of(filePath))) {
            lines.forEach(System.out::println);
        }
    }

    public static List<String> getFileLines(String filePath) {
        try (Stream<String> lines = Files.lines(Path.of(filePath))) {
            return lines.collect(Collectors.toList());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
