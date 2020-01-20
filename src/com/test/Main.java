package com.test;

import java.util.Scanner;

public class MathUtil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        int number;
        do {
            System.out.println("Please enter a number (zero for exit):");
            number = input.nextInt();

            boolean result = MathUtil.canBeDividedByThree(number);
            System.out.println(result);
        }
        while (number != 0);
    }

    public static boolean canBeDividedByThree(int number) {
        return number % 3 == 0;
    }

}
