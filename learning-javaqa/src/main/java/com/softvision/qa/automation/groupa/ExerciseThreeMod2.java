package com.softvision.qa.automation.groupa;
//Sa se citeasca un fisier din folderul de resources si sa se afiseze numarul de linii si ultima linie;
// sa se afiseze liniile din fisier in sens invers

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExerciseThreeMod2 {
    public static void main(String[] args) throws IOException {
        List<String> allLines = readResourceFileLines("A/data.txt");
        System.out.println(allLines.size());
        System.out.println(allLines.get(allLines.size()-1));
        Collections.reverse(allLines);
        System.out.println(allLines);
    }
    public static List<String> readResourceFileLines(String filePath) {
        ClassLoader classLoader = ExerciseThreeMod2.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(filePath);
        InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);
        List<String> allLines = new ArrayList<>();
        try {
            for (String line; (line = reader.readLine()) != null; ) {
                allLines.add(line);
            }
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
        return allLines;
    }

    }
