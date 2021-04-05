package eu.senla.JavaLaboratory3.initializers;

import eu.senla.JavaLaboratory3.main.Client;

public class MainInitializer {
    public static void init(){
        //todo add context
        MenuInitializer.initMenuContext();
        Client.userInterface();
    }
}
