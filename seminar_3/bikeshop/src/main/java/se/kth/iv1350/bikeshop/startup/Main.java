package se.kth.iv1350.bikeshop.startup;

imort se.kth.iv1350.bikeshop.controller.Controller;
imort se.kth.iv1350.bikeshop.integration.Printer;
imort se.kth.iv1350.bikeshop.integration.RegistryCreator;
imort se.kth.iv1350.bikeshop.view.View;

public Main {
  /**
    * Contains the main method - start the application.
    */
  public static void main(String[] args) {
    ReigistryCreator registry = new RegistryCreator();
    Printer printer = new Printer();
    Controller controller = new Controller(registry, printer);
    View.startRepairShop();
  }
}
