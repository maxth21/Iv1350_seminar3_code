package se.kth.iv1350.bikeshop.startup;

import se.kth.iv1350.bikeshop.controller.Controller;
import se.kth.iv1350.bikeshop.integration.Printer;
import se.kth.iv1350.bikeshop.integration.RegistryCreator;
import se.kth.iv1350.bikeshop.view.View;

/**
 * Contains the main method — starts the application.
 */
public class Main {

    /**
     * The application's main method.
     *
     * @param args Command line arguments, not used.
     */
    public static void main(String[] args) {
        RegistryCreator registry   = new RegistryCreator();
        Printer         printer    = new Printer();
        Controller      controller = new Controller(registry, printer);
        View            view       = new View(controller);
        view.run();
    }
}