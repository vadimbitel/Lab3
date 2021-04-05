package eu.senla.JavaLaboratory3.initializers;

import eu.senla.JavaLaboratory3.context.Context;

import java.util.Random;

public class ContextInitializer {
    public  static void init(){
        Context.random = new Random();
    }
}
