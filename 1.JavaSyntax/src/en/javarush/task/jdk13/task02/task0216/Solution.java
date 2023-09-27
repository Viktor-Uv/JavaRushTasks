package en.javarush.task.jdk13.task02.task0216;

/* 
Minimum of three numbers
*/

public class Solution {
    public static int min(int a, int b, int c) {
        //write your code here
        return Math.min(Math.min(a, b), c);
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
