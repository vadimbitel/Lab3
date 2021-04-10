package eu.senla.JavaLaboratory3.actions;

import eu.senla.JavaLaboratory3.context.Context;
import eu.senla.JavaLaboratory3.services.MenuService;
import eu.senla.JavaLaboratory3.services.TaskTwoService;

public class EndTaskTwoAction implements Action {
    @Override
    public void invoke(int index) {
        TaskTwoService.clearStorage();
        MenuService.goToPreviousMenu();
    }
}
