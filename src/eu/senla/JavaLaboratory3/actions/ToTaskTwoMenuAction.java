package eu.senla.JavaLaboratory3.actions;

import eu.senla.JavaLaboratory3.services.MenuService;
import eu.senla.JavaLaboratory3.services.TaskTwoService;

public class ToTaskTwoMenuAction implements Action {
    @Override
    public void invoke(int index) {
        TaskTwoService.fillStorage();
        MenuService.goToSubmenu(index);
    }
}
