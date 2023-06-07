package ex05.ch02;

public class ProtossUnit {
    String name;
    int hp;
    int attack;

    // 메소드
    void Attack(ProtossUnit u1, ProtossUnit u2){
        u2.hp = u2.hp - u1.attack;
        System.out.println(u1.name+"(이/가) "+u2.name+"(을/를) 공격 했습니다.");
        System.out.println(u2.name+"의 남은 hp : "+u2.hp);
    }
}

class Zealot extends ProtossUnit {
    public Zealot() {
        this.name = "Zealot";
        this.hp = 100;
        this.attack = 10;
    }
}

class Dragoon extends ProtossUnit {
    public Dragoon() {
        this.name = "Dragoon";
        this.hp = 100;
        this.attack = 5;
    }
}

class DarkTempler extends ProtossUnit {
    public DarkTempler() {
        this.name = "DarkTempler";
        this.hp = 50;
        this.attack = 20;
    }
}
