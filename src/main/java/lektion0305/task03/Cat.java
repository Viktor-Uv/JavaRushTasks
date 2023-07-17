package lektion0305.task03;

/*
Setting the number of cats
*/

public class Cat {
    private static int catCount = 0;

    public static void setCatCount(int catCount) {
        Cat.catCount = catCount;
    }

    public static void main(String[] args) {
        Cat.setCatCount(10);
        System.out.println(Cat.catCount);
    }
}