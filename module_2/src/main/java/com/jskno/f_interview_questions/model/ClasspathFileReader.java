package com.jskno.f_interview_questions.model;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ClasspathFileReader {

    public static String readFile(String fileName) throws IOException {
        try (InputStream inputStream = ClasspathFileReader.class.getClassLoader().getResourceAsStream("socialNetworkConnectivityLog.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(inputStream), StandardCharsets.UTF_8))) {
            return reader.lines().collect(Collectors.joining("\n"));
        }
    }

    public static List<String> getFileLines(String fileName) {
        try (InputStream inputStream = ClasspathFileReader.class.getClassLoader().getResourceAsStream("socialNetworkConnectivityLog.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(inputStream), StandardCharsets.UTF_8))) {
            return reader.lines().collect(Collectors.toList());
        } catch (IOException ex) {
        throw new RuntimeException(ex);
    }
    }
}
