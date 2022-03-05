package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first digit: ");
        int firstDigit = scanner.nextInt();

        System.out.print("Please insert second digit: ");
        int secondDigit = scanner.nextInt();

//        if(firstDigit < secondDigit) {
//            int sum = sum(firstDigit, secondDigit);
//            System.out.println("Sum: " + sum);
//        } else {
//            int sum = sum(secondDigit, firstDigit);
//            System.out.println("Sum: " + sum);
//
//            System.out.println("error");
//        }
        int sum = sum(firstDigit, secondDigit);
        System.out.println("Sum: " + sum);
    }

    private static int sum(int firstDigit, int secondDigit) {
//        if(firstDigit > secondDigit) {
//            int tmp = secondDigit;
//            secondDigit = firstDigit;
//            firstDigit = tmp;
//        }
        int sum = 0;

//        for(int i = firstDigit; i <= secondDigit; i++) {
//            sum += i;
//        }

//        while(firstDigit <= secondDigit) {
//            sum += firstDigit;
//            firstDigit++;
//        }

        do {
            sum += firstDigit;
            firstDigit++;
        }while(firstDigit <= secondDigit);

        return sum;
    }

}