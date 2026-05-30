package se.kth.iv1350.bikeshop.startup;

import se.kth.iv1350.bikeshop.controller.Controller;
import se.kth.iv1350.bikeshop.integration.Printer;
import se.kth.iv1350.bikeshop.integration.RegistryCreator;
import se.kth.iv1350.bikeshop.util.FileLogger;
import se.kth.iv1350.bikeshop.util.Logger;
import se.kth.iv1350.bikeshop.view.RepairOrderLogger;
import se.kth.iv1350.bikeshop.view.RepairOrderView;
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
        Logger          logger     = new FileLogger();
        Controller      controller = new Controller(registry, printer);
        controller.addObserver(new RepairOrderView());
        controller.addObserver(new RepairOrderLogger());
        View            view       = new View(controller);
        controller.setLogger(logger);
        view.setLogger(logger);
     
        view.run();


    }
}