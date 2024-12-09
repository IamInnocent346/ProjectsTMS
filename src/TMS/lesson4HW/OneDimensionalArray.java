package TMS.lesson4HW;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArray {
    public static void main(String[] args) {
        solveTaskOne();
        solveTaskTwo();
        solveTaskFour();
        solveTaskFive();
        solveTaskSix();



    }

    // Task 1.
    public static void solveTaskOne(){
        Scanner input = new Scanner(System.in);
        System.out.println("Type in the array size as in integer number: ");
        int numbers = input.nextInt();
        int x[] = new int[numbers];
        System.out.println("Type in the numbers in the direct order: ");
        for (int i = 0; i < numbers; i++) {
            x[i] = input.nextInt();

        }
        System.out.println ("Type in the numbers in the reverse order: ");
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.println(x[i]);

        }


    }
    // Task 2 + 3
    public static void solveTaskTwo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in the array size as in integer number: ");
        int numbers = input.nextInt();
        Random rnd = new Random();
        int[] value = new int[numbers];
        for (int val = 0; val < numbers; val++) {
            value[val] = rnd.nextInt(10);

        }
        System.out.println(Arrays.toString(value));
        int max = value[0];
        int min = value[0];
        for (int a : value) {
            if (a > max) {
                max = a;

            }
        }
        System.out.println("Array maximum is: " + max);


        for (int x : value) {
            if (x < min) {
                min = x;
                System.out.println(" Array minimum is: " + min);

            }
        }
    }

        // Task 4.
        public static void solveTaskFour () {
            Scanner input = new Scanner(System.in);
            System.out.println("Type in the array size as in integer number: ");
            int numbers = input.nextInt();
            int[] value = new int[numbers];
            for (int val = 0; val < numbers; val++) {
                System.out.println("Enter the array: " + val);
                value[val] = input.nextInt();
                int count = 0;
                for (int a : value) {
                    if (a == 0) {
                        count++;

                    }
                }
                if (count == 0) {
                    System.out.println("There are no zeros");
                }
            }
        }

            // Task 5.
            public static void solveTaskFive() {
                Scanner input = new Scanner(System.in);
                System.out.println("Type in the array size as in integer number: ");
                int numbers = input.nextInt();
                int[] value = new int[numbers];
                for (int val = 0; val < value.length; val++) {
                    System.out.println("Enter the array: " + val);
                    value[val] = input.nextInt();

                }

                for (int i = 0; i < value.length / 2; i++) {
                    int smth = value[i];
                    value[i] = value[value.length - i - 1];
                    value[value.length - i - 1] = smth;

                }
                System.out.println(Arrays.toString(value));

            }

                // Task 6.
                public static void solveTaskSix(){
                    Scanner input = new Scanner(System.in);
                    System.out.println("Type in the array size as in integer number: ");
                    int numbers = input.nextInt();
                    int[] value = new int[numbers];
                    for (int val = 0; val < value.length; val++) {
                        System.out.println("Enter the array: " + val);
                        value[val] = input.nextInt();
                        for (int i = 0; i < value.length - 1; i++) {
                            if (value[i] >= value[i + 1]){
                                System.out.println("Array is not increasing by one");

                            }
                    }




                }
            }



        }




