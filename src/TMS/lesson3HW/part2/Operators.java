package TMS.lesson3HW.part2;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        solveTaskTwo();
        solveTaskThree();
        solveTaskFour();
        solveTaskFive();
        solveTaskOne();

    }

    // Task 2.
    public static void solveTaskTwo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, type in the temperature of the weather today: ");
        int weatherTemperature = input.nextInt();
        if (weatherTemperature > -5) {
            System.out.println("Warm");
        } else if (weatherTemperature <= -20) {
            System.out.println("Cold");
        } else {
            System.out.println("Normal");
        }


    }

    // Task 3.
    public static void solveTaskThree() {
        for (int value = 10; value <= 20; value++) {
            System.out.println((value * value) + " ");
        }
    }

    // Task 4.
    public static void solveTaskFour() {
        int number = 7;
        while (number <= 98) {
            System.out.println(number + " ");
            number = number + 7;
        }
    }

    // Task 5.
    public static void solveTaskFive() {
        System.out.println("Type in any positive integer: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int value = 1; value <= number; value++) {
        }
        System.out.println(sum);
    }

    // Task 1.
    public static void solveTaskOne(){
        System.out.println(" Type in a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is not even");
        }
        }


    }

