package beforeLektion0305;/*
New Java Syntax
3 уровень, 4 лекция
Price of apples
*/

public class Task0304_applePrice {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("Apple price " + Apple.applePrice);
    }

    public static class Apple {
        public static int applePrice = 0;

        public static void addPrice(int applePrice) {
            Apple.applePrice += applePrice;

        }
    }
}
