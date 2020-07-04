package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader firstFileIn = new BufferedReader(new FileReader(in.readLine()));
        BufferedReader secondFileIn = new BufferedReader(new FileReader(in.readLine()));

        while (firstFileIn.ready()) {
            allLines.add(firstFileIn.readLine());
        }

        while (secondFileIn.ready()) {
            forRemoveLines.add(secondFileIn.readLine());
        }

        List<String> localCopy = new ArrayList<>(allLines);
        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            allLines.addAll(localCopy);
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
