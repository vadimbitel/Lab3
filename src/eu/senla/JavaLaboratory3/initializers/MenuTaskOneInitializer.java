package eu.senla.JavaLaboratory3.initializers;

import eu.senla.JavaLaboratory3.actions.TestMenuAction;
import eu.senla.JavaLaboratory3.menu.Menu;
import eu.senla.JavaLaboratory3.menu.MenuContext;
import eu.senla.JavaLaboratory3.menu.MenuItem;

import java.util.ArrayList;

public class MenuTaskOneInitializer {
    public static void init(){
        MenuContext.setCurrentMenu(new Menu());
        MenuContext.getCurrentMenu().setItems(new ArrayList<>());

        MenuItem testMenu=new MenuItem("Display test message", new TestMenuAction());
        MenuContext.getCurrentMenu().getItems().add(testMenu);

    }
}

