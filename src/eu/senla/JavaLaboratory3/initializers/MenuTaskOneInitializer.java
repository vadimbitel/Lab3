package eu.senla.JavaLaboratory3.initializers;

import eu.senla.JavaLaboratory3.menu.Menu;
import eu.senla.JavaLaboratory3.menu.MenuContext;
import eu.senla.JavaLaboratory3.menu.MenuItem;

import java.util.ArrayList;

public class MenuTaskOneInitializer {
    public static void init(){
        MenuContext.setCurrentMenu(new Menu());
        MenuContext.getCurrentMenu().setItems(new ArrayList<>());

    }
}

