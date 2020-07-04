package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            firstFileName = in.readLine();
            secondFileName = in.readLine();
        } catch (IOException e) {

        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();

        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private InputStream file;
        private String result = "";

        public void setFileName(String fullFileName) {
            try {
                file = new FileInputStream(fullFileName);
            } catch (FileNotFoundException e) {
            }
        }

        public void run() {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(file))) {
                while (in.ready()) {
                    result += in.readLine() + " ";
                }
            } catch (IOException e) {

            }
        }

        public String getFileContent() {
            return result;
        }
    }
}
