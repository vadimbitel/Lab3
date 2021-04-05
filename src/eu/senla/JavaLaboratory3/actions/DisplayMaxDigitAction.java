package eu.senla.JavaLaboratory3.actions;


import eu.senla.JavaLaboratory3.services.TaskOneService;

public class DisplayMaxDigitAction implements Action {
    //todo изменить название
    @Override
    public void invoke() {

        int number = TaskOneService.generateRandomInt(100,1000);
        System.out.println("Random number is "+number);
        TaskOneService.displayMaxDigit(number);

    }
}
