package lektion0305.task02;

/*
Cat register
*/

public class Cat {
    private static int catCount = 0;

    public static void addNewCat() {
        Cat.catCount += 1;
    }

    public static void main(String[] args) {
        Cat.addNewCat();
        System.out.println(Cat.catCount);
    }
}
