package eu.senla.JavaLaboratory3.initializers;

import eu.senla.JavaLaboratory3.actions.DisplayDifferenceBetweenNumbersAction;
import eu.senla.JavaLaboratory3.actions.DisplayMaxDigitAction;
import eu.senla.JavaLaboratory3.actions.DisplaySumOfDigitsAction;
import eu.senla.JavaLaboratory3.actions.DisplaySumOfFirstDigitsAction;
import eu.senla.JavaLaboratory3.menu.Menu;
import eu.senla.JavaLaboratory3.menu.MenuContext;
import eu.senla.JavaLaboratory3.menu.MenuItem;

import java.util.ArrayList;

public class MenuTaskOneInitializer {
    public static void init() {
        MenuContext.setCurrentMenu(new Menu());
        MenuContext.getCurrentMenu().setItems(new ArrayList<>());

        MenuItem displayMaxDigit = new MenuItem("Display max digit from random number ", new DisplayMaxDigitAction());
        MenuContext.getCurrentMenu().getItems().add(displayMaxDigit);

        MenuItem displaySumOfFirstDigits = new MenuItem("Display the sum of the first digits of three numbers ",
                new DisplaySumOfFirstDigitsAction());
        MenuContext.getCurrentMenu().getItems().add(displaySumOfFirstDigits);

        MenuItem displayDifferenceBetweenNumbers = new MenuItem("Display difference between the first " +
                "two numbers and the third number ", new DisplayDifferenceBetweenNumbersAction());
        MenuContext.getCurrentMenu().getItems().add(displayDifferenceBetweenNumbers);

        MenuItem displaySumOfDigits = new MenuItem("Display sum of digits in random number ",
                new DisplaySumOfDigitsAction());
        MenuContext.getCurrentMenu().getItems().add(displaySumOfDigits);
    }
}

