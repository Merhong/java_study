package ex04.mem;

public class App {

    static Dog make() {
        Dog instance = new Dog("토토", 10);
        return instance;
    }

    public static void main(String[] args) {
        Dog d = make();
        System.out.println(d.name);
        System.out.println(d.speed);
    }
}