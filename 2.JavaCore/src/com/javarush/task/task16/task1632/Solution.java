package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new InfinityThread());
        threads.add(new InterruptedThread());
        threads.add(new UraThread());
        threads.add(new MessageThread());
        threads.add(new SumThread());
    }

    public static void main(String[] args) {
    }

    public static class InfinityThread extends Thread {
        @Override
        public void run() {
            while (true) { }
        }
    }

    public static class InterruptedThread extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }
    }

    public static class UraThread extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public static class MessageThread extends Thread implements Message {
        @Override
        public void run() {
            while (!isInterrupted()) {

            }
        }

        @Override
        public void showWarning() {
            if (isAlive()) {
                interrupt();
            }
        }
    }

    public static class SumThread extends Thread {
        private long sum;

        @Override
        public void run() {
            while (true) {
                try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
                    String tmp = in.readLine();
                    if (tmp.equals("N")) break;

                    sum += Integer.parseInt(tmp);
                } catch (IOException e) { }
            }
            System.out.println(sum);
        }
    }
}