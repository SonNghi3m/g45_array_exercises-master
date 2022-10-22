package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise02 {

    /**
     * 2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
     * If the element does not exist your method should return -1 as value.
     * Expected output: Index position of number 5 is: 2.
     */

    // step1: define an array
    // step2: iterate on the array
    // step3: check the input param with the array element'
    // if exists return index of element, return -1
    public static void ex2() {
        int[] array = {24, 30, 5, 100, 220};
        int input = userInput();
        int index =  indexOf(array, input);
        System.out.println("Number you entered located at index: " + index);
    }

    public static int indexOf(int[] array, int input) {
        for (int i = 0; i < array.length; i++) {
            if (input == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();
        return userInput;
    }
}
