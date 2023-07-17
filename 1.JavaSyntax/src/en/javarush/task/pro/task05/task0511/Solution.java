package en.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Creating a two-dimensional array
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        // Create scanner object
        Scanner scanner = new Scanner(System.in);

        // Get number of rows that is > 0
        int R;
        do {
            //System.out.print("Rows (> 0): ");
            R = scanner.nextInt();
        } while (R <= 0);
        multiArray = new int[R][];

        // Get number of columns that is > 0
        int C;
        for (int i = 0; i < multiArray.length; i++) {
            do {
                //System.out.print("Columns (> 0): ");
                C = scanner.nextInt();
            } while (C <= 0);
            multiArray[i] = new int[C];
        }

    }
}
