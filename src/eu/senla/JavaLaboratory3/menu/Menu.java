package eu.senla.JavaLaboratory3.menu;

import lombok.Getter;
import lombok.Setter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

@Getter
@Setter
public class Menu {
    private List<MenuItem> items;
    private Menu previousMenu;

    public void executeSelectedFunction() {
        try {
            int index = MenuContext.getScanner().nextInt() - 1;
            System.out.println();
            try {
                items.get(index).getAction().invoke();
            }  catch (Exception exception) {
                System.out.print("There is no such item! \n");
            }
        } catch (InputMismatchException inputMismatchException){
            System.out.print("\nData format error! \n");
            MenuContext.setScanner(new Scanner(System.in));
        }
        //Proverochka - file test
    }
}
