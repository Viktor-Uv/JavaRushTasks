package en.javarush.task.jdk13.task02.task0217;

/* 
Minimum of four numbers
*/

public class Solution {
    public static int min(int a, int b, int c, int d) {
        //write your code here
        return min(min(a, b), min(c ,d));

    }

    public static int min(int a, int b) {
        //write your code here
        return Math.min(a, b);
    }

    public static void main(String[] args) {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
