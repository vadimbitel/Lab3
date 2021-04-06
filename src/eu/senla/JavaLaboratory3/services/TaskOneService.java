package eu.senla.JavaLaboratory3.services;

import eu.senla.JavaLaboratory3.context.Context;

import java.awt.font.NumericShaper;
import java.util.stream.IntStream;

public class TaskOneService {

    public static void displayMaxDigit(int number) {
        System.out.println("The biggest number is " +
                (Integer.toString(number)
                .chars()
                .max()
                .getAsInt()
                        - '0'));
    }

    public static void displaySumOfFirstDigit(int numberOne, int numberSecond, int numberThree ) {
        System.out.println("Sum of first digits is "+
                (numberOne/100+numberSecond/100+numberThree/100));
    }

    public static void displayDifferenceBetweenTwoNumbersAndThirdNumber(int numberOne, int numberSecond, int numberThree){
        String numberString = Integer.toString(numberOne) + Integer.toString(numberSecond);
        System.out.println("Concat number is "+numberString);
        System.out.println("Difference between the first two numbers and the third number is "
                + (Integer.parseInt(numberString)-numberThree));
    }

    public static void displaySumOfDigits(int number){
        System.out.println("Sum of digits in number is " +(Integer.toString(number)
        .chars()
        .map(Character::getNumericValue)//a->Character.getNumericValue(a)
        .sum()
        ));
    }

    /**
     * @param max exclusive
     * @param min inclusive
     * @return int
     */
    public static int generateRandomInt(int min, int max) {

        return Context.random.nextInt(max - min) + min;
    }

    /**
     * @param max exclusive
     * @return int
     */
    public static int generateRandomInt(int max) {

        return Context.random.nextInt(max);
    }
}
