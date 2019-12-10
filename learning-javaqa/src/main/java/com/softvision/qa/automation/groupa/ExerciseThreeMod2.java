package com.softvision.qa.automation.groupa;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ExerciseThreeMod2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./resources/data.txt");
        LineNumberReader lnr = new LineNumberReader(fr);

        String line = "";
        String lastLine = "";
        int counter = 0;

        while ((line = lnr.readLine()) != null) {
            lastLine = line;
            counter++;
        }

        System.out.println("No of lines: " + counter);
        System.out.println("Last line: " + lastLine);
    }
}
