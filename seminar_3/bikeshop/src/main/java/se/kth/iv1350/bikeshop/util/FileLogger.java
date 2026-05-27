package se.kth.iv1350.bikeshop.util;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * FileLogger writes a log to a file
 * Implements the Logger Interface
 */
public class FileLogger implements Logger{
    private PrintWriter logStream;

    /**
     * Logs to a file called log.txt
     */
    public FileLogger() {
        try{
            logStream = new PrintWriter(new FileWriter ("log.txt"), true);
        }catch (IOException ioException) {
            System.out.println("COULD NOT WRITE TO LOG");
            ioException.printStackTrace(logStream);
        }
    }

    /**
     * Prints message  
     */    
    @Override
    public void log(String message) {
        logStream.println(message);
    }
}

