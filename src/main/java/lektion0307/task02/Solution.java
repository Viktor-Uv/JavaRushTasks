package lektion0307.task02;

/*
Interval
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        int min = 50;
        int max = 100;
        if (a > min)
            if (a < max)
                System.out.println("The number " + a + " is in the interval.");
            else
                System.out.println("The number " + a + " is not in the interval.");
        else
            System.out.println("The number " + a + " is not in the interval.");
    }
}
