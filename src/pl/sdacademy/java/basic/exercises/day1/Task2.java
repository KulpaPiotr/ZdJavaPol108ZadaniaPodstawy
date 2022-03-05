package pl.sdacademy.java.basic.exercises.day1;

import java.util.Scanner;

public class Task2 {
    private static final float PI = 3.14F;

    public static void main(String[] args) {
        float radius = getDiameterFromUser() / 2;
        float circumference = calculateCircumferenceOfACircle(radius);
        float area = calculateAreaOfACircle(radius);
        System.out.println("Circumference Of A Circle: " + circumference);
        System.out.println("Area Of A Circle: " + area);
    }

    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert diameter: ");
        return scanner.nextFloat();
    }

    private static float calculateCircumferenceOfACircle (float radius) {
        return 2 * (float)Math.PI * radius;
    }

    private static float calculateAreaOfACircle (float radius) {
        return (float)Math.PI * radius * radius;
    }
}
