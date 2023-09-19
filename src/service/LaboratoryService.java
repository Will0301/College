package service;

import model.DNAcombinations;

import java.util.Arrays;


public class LaboratoryService {
    public static String[] evaluate(String[] dna) {

        String[] DNA = Arrays.copyOf(dna, dna.length);
        boolean isValid = true;

        while (isValid) {
            int size = DNA.length;
            int newSize = size;

            for (int i = 0; i < newSize - 1; i++) {
                String par = DNA[i] + DNA[i + 1];
                try {
                    DNAcombinations combination = DNAcombinations.fromString(par);
                    DNA[i] = combination.getMergeResult();

                    for (int j = i + 1; j < newSize - 1; j++) {
                        DNA[j] = DNA[j + 1];
                    }

                    newSize--;
                } catch (IllegalArgumentException e) {

                }
            }

            if (newSize == size) {
                isValid = false;
            } else {
                DNA = Arrays.copyOf(DNA, newSize);
            }
        }
        return DNA;
    }
}

