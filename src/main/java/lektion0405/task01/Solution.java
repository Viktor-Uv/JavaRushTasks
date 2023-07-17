package lektion0405.task01;

/*
Multiplication table
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j);
                if (j < 10)
                    // Separate numbers by space
                    System.out.print(" ");
            }
            // Separate lines by new line
            System.out.println();
        }
    }
}