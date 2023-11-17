package edu.handong.csee.java.example.fileread.benchmark;

import java.io.*;

public class UsingBufferedReader {
    public static void main(String[] args) throws IOException {

        if(args.length != 1) {
            System.out.println("Please provide a file name as a command line argument.");
            return;
        }

        String fileName = args[0]; 

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File not found: " + fileName);
            return;
        }

        StopWatch.start();

        BufferedReader inputStream = new BufferedReader(new FileReader(file));
        while (inputStream.read() != -1) {}

        long duration = StopWatch.stop();
        System.out.println(duration + " milsec");

        inputStream.close();
    }
}
