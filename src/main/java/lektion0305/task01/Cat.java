package lektion0305.task01;

/*
What's the cat's name?
*/

public class Cat {
    private String name = "nameless cat";

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Charlie");
        System.out.println(cat.name);
    }
}


