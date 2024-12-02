package lesson3HW.part1;


public class ArithmeticOperators {
    public static void main(String[] args) {
        solveTaskOne();
        solveTaskTwo();
        solveTaskThree();
        solveTaskFour();
        solveTaskFive();
        solveTaskSix();


    }

    // Task 1.
    public static void solveTaskOne() {
        int b = 11;
        int c = 27;
        int a;
        a = 4 * (b + c - 1) / 2;
        System.out.println("The result of a value is " + a);
    }


    // Task 2.
    public static void solveTaskTwo() {
        int n = 14;
        int a = n / 10;
        int b = n % 10;
        int c = a + b;
        System.out.println("The sum of the n value is " + c);
    }

    // Task 3. ( I do not exactly know how to solve this the way I did in the previous task, but I will do it in
    // another way - more simple. ) :D
    public static void solveTaskThree() {
        int a = 1;
        int b = 2;
        int c = 3;
        int q = 123;
        System.out.println(q);
    }

        // Task 4.
        public static void solveTaskFour() {
            double n = 17.8d;
            System.out.println (" Rounding a number to integer result is " + (int)n);


        }

    // Task 5.
    public static void solveTaskFive() {
        int q = 13;
        int w = 7;
        int b = q % w;
        System.out.println(b);


    }

    // Task 6.
    public static void solveTaskSix() {
        int a = 1;
        int b = 2;
        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
    }


}







































