package se.kth.iv1350.bikeshop.util;

/**
 * Prints log messages to <code>System.out</code>
 * Can be used to replace <System.out.println(e.getMessage());> in order to keep stacktrace and
 * centralise logic
 */
public class ConsoleLogger implements Logger {
    /**
     * Prinst the chosen message to <code>System.out</code>
     * @param message is the String that will be printed to <code>System.out</code>
     */
    @Override
    public void log(String message) {
        System.out.println(message);
    }
    
}
