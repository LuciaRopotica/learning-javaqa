package com.softvision.qa.automation.groupa;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
//Sa se citeasca un fisier din folderul de resources si sa se afiseze numarul de linii si ultima linie.

public class ExerciseThreeMod1 {

    public static void main(String[] args) throws IOException {

        File file = new File("./resources/data.txt");
        int indexLastLine = noOfLines(file) -1;
        lineReader(file, indexLastLine);
    }

    private static int noOfLines(File file) {
        int linenumber = 0;
        try {

            if (file.exists()) {
                FileReader fr = new FileReader(file);
                LineNumberReader lnr = new LineNumberReader(fr);



                while (lnr.readLine() != null) {
                    linenumber++;
                }

                System.out.println("Total number of lines : " + linenumber);

                lnr.close();

            } else {
                System.out.println("File does not exists!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
      return linenumber;
    }


    private static  void lineReader(File file, int index) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(file));

        List<String> result = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            result.add(line);
        }
        System.out.println(result.get(index));
    }
}

