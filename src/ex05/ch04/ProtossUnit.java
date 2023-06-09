package ex05.ch04;

// 추상클래스
public abstract class ProtossUnit {
    String name;
    int hp;
    int attack;
    
    public ProtossUnit(String name, int hp, int attack) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }
}