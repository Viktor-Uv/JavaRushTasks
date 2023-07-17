package en.javarush.task.jdk13.task06.task0634;

import java.util.Scanner;

/* 
Chess board
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Input size: ");
        int n = scanner.nextInt();
        array = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean bothEven = i % 2 == 0 && j % 2 == 0;
                boolean bothOdd = i % 2 == 1 && j % 2 == 1;
                if (bothEven || bothOdd) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = ' ';
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
}
