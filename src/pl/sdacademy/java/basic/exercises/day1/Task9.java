package pl.sdacademy.java.basic.exercises.day1;

public class Task9 {
    public static void main(String[] args) {
        int rangeTo = 20;
        System.out.println("Range from 1 to " + rangeTo);
        for (int i = 1; i <= rangeTo; i++) {
            String result = fizzBuzz(i);
            System.out.println(result);
        }
    }
    private static String fizzBuzz (int number) {
        //if (number % 3 == 0 && number % 5 == 0) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
