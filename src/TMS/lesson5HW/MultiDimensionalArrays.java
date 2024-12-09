package TMS.lesson5HW;

import java.util.Random;
import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        solveTaskOne();
        solveTaskTwo();

    }


    // Task 1.
    public static void solveTaskOne() {
        Random rnd = new Random();
        int[][] array = new int[7][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array [i][j] = rnd.nextInt(0, 10);
                System.out.println(array[i][j] + " ");



            }
            System.out.println();

        }

        System.out.println(" Type in the integer to add to each index: ");
        Scanner scr = new Scanner(System.in);
        int indexToAdd = scr.nextInt();
        int sum = 0;
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                array [j][i] += indexToAdd;
                sum += array [j][i];
            }
        }

        System.out.println(" The sum of all numbers is " + sum);

    }


    // Task 2.
    public static void solveTaskTwo(){
        String [][] chessBoard = new String [8][8]; // I tried int, did not work and was showing an error with
        // exception of input string.
        for (int i = 0; i<chessBoard.length; i++){
            for (int j = 0; j<chessBoard[0].length; j++){
                if ((i+j) % 2 == 0) {
                    chessBoard[i][j] = "W";
                }   else {
                    chessBoard [i][j] = "B";
                }
            }
        }
    }

}