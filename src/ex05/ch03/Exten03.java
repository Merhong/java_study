package ex05.ch03;

// 추상 클래스, new를 못함. 자식을 통해서 Heap에 띄워질 수 있음.
abstract class Animal {     // 추상 메소드, 구체적 행위가 없음.
    abstract void speak();  // 자식 클래스에서 무조건 재정의(구현) 해야 함.

}

class Bird extends Animal {
    @Override
    void speak() {
        System.out.println("짹짹");
    }
}

class Cow extends Animal {
    void speak() {
        System.out.println("음메");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("야옹");
    }
}

public class Exten03 {
    static void start(Animal u) {
        u.speak();
    }

    public static void main(String[] args) {
        Animal d = new Dog();
        start(d);

        Animal c = new Cat();
        start(c);

        Animal b = new Bird();
        start(b);
    }
}
