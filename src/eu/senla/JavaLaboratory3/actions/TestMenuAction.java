package eu.senla.JavaLaboratory3.actions;


import eu.senla.JavaLaboratory3.services.TestService;

public class TestMenuAction implements Action {

    @Override
    public void invoke() {
        TestService.displayTestMessage();
    }
}
