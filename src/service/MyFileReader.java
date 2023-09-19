package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
    public static String[] readTextFileToArray(String filePath) {
        StringBuilder resultBuilder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    resultBuilder.append(c).append(' ');
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String resultString = resultBuilder.toString().trim();
        String[] resultArray = resultString.split(" ");

        return resultArray;
    }
}
