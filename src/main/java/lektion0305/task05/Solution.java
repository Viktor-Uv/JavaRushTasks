package lektion0305.task05;

/*
Count the number of cats
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat.count += 1;

        Cat cat2 = new Cat();
        Cat.count += 1;

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}
