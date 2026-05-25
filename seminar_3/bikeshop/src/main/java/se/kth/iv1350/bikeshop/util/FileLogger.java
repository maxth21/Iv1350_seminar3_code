package se.kth.iv1350.bikeshop.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogger {
    private PrintWriter logStream;

    public FileLogger() {
        try{
            logStream = new PrintWriter(new FileWriter ("log.txt"), true);
        }catch (IOException ioException) {
            System.out.println("COULD NOT WRITE TO LOG");
            ioException.printStackTrace(logStream);
        }
    }
}
