package eu.senla.JavaLaboratory3.initializers;

import eu.senla.JavaLaboratory3.menu.MenuContext;

import java.util.Scanner;

public class MenuInitializer {
    public static void initMenuContext(){
        MenuContext.setScanner(new Scanner(System.in));
        MenuTaskOneInitializer.init();
        //todo init menu
    }

}
