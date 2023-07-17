package en.javarush.task.pro.task05.task0510;

/* 
Triangular array
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j <= i; j++) {
                // Initialisation
                result[i] = new int[j + 1];
            }
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                // Assignment
                result[i][j] = i + j;
                // Display separated by spaces
                System.out.print(result[i][j] + " ");
            }
            // Separate by new line
            System.out.println();
        }
    }
}
